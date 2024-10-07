import json
from pathlib import Path

from numpy.lib.function_base import select

from utils import *


class TestGen:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "NERO"
        self.generated_tests_path = self.project_home / "resource/test_gen"
        self.generated_tests = list(self.generated_tests_path.rglob("*"))
        self.model_solution = Path("/Users/ruizhengu/Experiments/model_solution")
        self.dataset_home = Path("/Users/ruizhengu/Experiments/incorrect_submissions")
        self.submission_list = [submission for submission in self.dataset_home.iterdir() if
                                submission.is_dir() and submission.name != ".git"]
        self.method_file_json = self.project_home / "resource/method_files.json"
        self.method_of_interest_file_json = self.project_home / "resource/method_of_interest_test.json"
        self.method_coverage_evosuite_json = self.project_home / "resource/method_coverage_evosuite.json"
        self.method_coverage_teacher_json = self.project_home / "resource/method_coverage.json"
        self.methods = self.get_model_methods()

    def replace_tests(self):
        for submission in self.submission_list:
            self.replace_build_gradle(submission)
            submission_test = submission / "src/test/java"
            empty_directory(submission_test)

            for generated_test in self.generated_tests_path.rglob("*"):
                target_path = submission_test / generated_test.relative_to(self.generated_tests_path)

                if generated_test.is_dir():
                    target_path.mkdir(parents=True, exist_ok=True)
                else:
                    target_path.parent.mkdir(parents=True, exist_ok=True)
                    shutil.copy2(generated_test, target_path)

    def replace_build_gradle(self, submission):
        model_gradle = self.model_solution / "build.gradle"
        submission_gradle = submission / "build.gradle"
        shutil.copy2(model_gradle, submission_gradle)

    def check_compilation(self):
        for submission in self.submission_list:
            chmod = f"chmod +x {submission}/gradlew"
            cmd = f"{submission}/gradlew clean build -p {submission}"
            try:
                run_cmd(chmod)
                build_output = run_cmd(cmd)
                if "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." not in build_output:
                    print(f"{submission} - BUILD FAILED")
                elif "BUILD SUCCESSFUL" in build_output and "Execution failed for task ':test'." not in build_output:
                    shutil.rmtree(submission)
            except Exception as e:
                print(f"{submission} - Error executing {e}")

    def get_model_methods(self):
        with open(self.method_of_interest_file_json, "r") as f:
            data = json.load(f)
        return list(data.keys())

    def inject_aspectj(self, submission):
        model_solution = self.model_solution / "src/main/java/aspect"
        destination = submission / "src/main/java/aspect"
        if destination.exists():
            shutil.rmtree(destination)
        shutil.copytree(model_solution, destination)

    def get_method_coverage(self, test_method_calls):
        method_coverage = {}
        for method in self.methods:
            data = {}
            tests = []
            for test, method_calls in test_method_calls.items():
                for call in method_calls:
                    if method in call:
                        tests.append(test)
            data["tests"] = tests
            data["num"] = len(tests)
            method_coverage[method] = data
        return method_coverage

    def get_method_calls(self, submission, test):
        execution_log = submission / "method-executions.log"
        test_cmd = f"{submission}/gradlew -p {submission} test --tests {test}"
        run_cmd(test_cmd)
        with open(execution_log, "r") as f:
            calls = f.readlines()
        calls = set([line.replace("\n", "") for line in calls])
        return calls

    def failed_tests_method_coverage(self):
        submission_method_coverage = {}
        for submission in self.submission_list:
            self.inject_aspectj(submission)
            test_cmd = f"{submission}/gradlew build -p {submission}"
            run_cmd(test_cmd)
            list_cmd = f"{submission}/gradlew listFailedTests -p {submission}"
            output = run_cmd(list_cmd)
            pattern = r"^(.+::\w+)$"
            failed_tests = re.findall(pattern, output, re.MULTILINE)
            failed_tests = [t.replace("::", ".") for t in failed_tests]
            test_method_calls = {}
            for test in failed_tests:
                method_calls = self.get_method_calls(submission, test)
                test_method_calls[test] = method_calls
            method_coverage = self.get_method_coverage(test_method_calls)
            submission_method_coverage[submission.name] = method_coverage
            with open(self.method_coverage_evosuite_json, "w") as f:
                f.write(json.dumps(submission_method_coverage, indent=4))
            print(f"Get failed tests: {submission.name}")

    def get_buggy_method_evosuite(self, submission):
        buggy_methods = []
        with open(self.method_coverage_evosuite_json) as f:
            data = json.load(f)
        for method, coverage in data[submission].items():
            if coverage["num"] > 0:
                buggy_methods.append(method)
        return buggy_methods

    def get_buggy_method_teacher(self, submission):
        buggy_methods = []
        with open(self.method_coverage_teacher_json) as f:
            data = json.load(f)
        for method, coverage in data[submission].items():
            if coverage["num"] > 0:
                buggy_methods.append(method)
        return buggy_methods

    def buggy_methods_analysis(self, submission):
        buggy_method_teacher = self.get_buggy_method_teacher(submission)
        buggy_method_evosuite = self.get_buggy_method_evosuite(submission)
        if len(buggy_method_teacher) > len(buggy_method_evosuite):
            missed_gen_tests = set(buggy_method_teacher) - set(buggy_method_evosuite)
            print(f"submission {submission}: teacher tests better than generated tests")
            print(f"missed tests by generated tests: {', '.join(missed_gen_tests)}")
        elif len(buggy_method_teacher) == len(buggy_method_evosuite):
            print(f"submission {submission}: teacher tests are equivalent to generated tests")
        else:
            missed_gen_tests = set(buggy_method_evosuite) - set(buggy_method_teacher)
            print(f"submission {submission}: teacher tests are not sufficient")
            print(f"missed tests by teacher tests: {', '.join(missed_gen_tests)}")


if __name__ == '__main__':
    test_gen = TestGen()
    test_gen.replace_tests()
    test_gen.check_compilation()
    test_gen.failed_tests_method_coverage()
    # test_gen.buggy_methods_analysis("1")