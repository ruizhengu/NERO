/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 07 15:45:23 GMT 2024
 */

package uk.ac.sheffield.com1003.cafe;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import uk.ac.sheffield.com1003.cafe.Order;
import uk.ac.sheffield.com1003.cafe.Recipe;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Order_ESTest {

//  @org.junit.Rule
//  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
//
//  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone();
//
//  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);
//
//
//  @BeforeClass
//  public static void initEvoSuiteFramework() {
//    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sheffield.com1003.cafe.Order";
//    org.evosuite.runtime.GuiSupport.initialize();
//    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100;
//    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000;
//    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true;
//    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED;
//    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT();
//    org.evosuite.runtime.classhandling.JDKClassResetter.init();
//    setSystemProperties();
//    initializeClasses();
//    org.evosuite.runtime.Runtime.getInstance().resetRuntime();
//  }
//
//  @AfterClass
//  public static void clearEvoSuiteFramework(){
//    Sandbox.resetDefaultSecurityManager();
//    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone());
//  }
//
//  @Before
//  public void initTestCase(){
//    threadStopper.storeCurrentThreads();
//    threadStopper.startRecordingTime();
//    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler();
//    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode();
//    setSystemProperties();
//    org.evosuite.runtime.GuiSupport.setHeadless();
//    org.evosuite.runtime.Runtime.getInstance().resetRuntime();
//    org.evosuite.runtime.agent.InstrumentingAgent.activate();
//  }
//
//  @After
//  public void doneWithTestCase(){
//    threadStopper.killAndJoinClientThreads();
//    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks();
//    org.evosuite.runtime.classhandling.JDKClassResetter.reset();
//    resetClasses();
//    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode();
//    org.evosuite.runtime.agent.InstrumentingAgent.deactivate();
//    org.evosuite.runtime.GuiSupport.restoreHeadlessMode();
//  }
//
//  public static void setSystemProperties() {
//
//    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone());
//    java.lang.System.setProperty("user.dir", "/Users/ruizhengu/Experiments/model_solution_evosuite");
//    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/1r/t1t8tcs944979hxkq3w8p1b40000gn/T/");
//  }
//
//  private static void initializeClasses() {
//    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Order_ESTest.class.getClassLoader() ,
//      "uk.ac.sheffield.com1003.cafe.ingredients.Ingredient",
//      "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException",
//      "uk.ac.sheffield.com1003.cafe.Recipe$Size",
//      "uk.ac.sheffield.com1003.cafe.Recipe",
//      "uk.ac.sheffield.com1003.cafe.Order"
//    );
//  }
//
//  private static void resetClasses() {
//    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Order_ESTest.class.getClassLoader());
//
//    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
//      "uk.ac.sheffield.com1003.cafe.Order",
//      "uk.ac.sheffield.com1003.cafe.Recipe",
//      "uk.ac.sheffield.com1003.cafe.Recipe$Size"
//    );
//  }

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Recipe recipe0 = new Recipe("", (-2688.726));
      Order order0 = new Order(recipe0, "Pending", (-997.5665603693), "");
      order0.printReceipt();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Recipe recipe0 = new Recipe("", (-2688.726));
      Order order0 = new Order(recipe0, "Pending", (-997.5665603693), "");
      String string0 = order0.toString();
      assertEquals("Order: ; For: Pending; Paid: -997.5665603693", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Order order0 = new Order((Recipe) null, "Change due: ", (-1564.5138307));
      // Undeclared exception!
      try { 
        order0.printReceipt();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sheffield.com1003.cafe.Order", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Recipe recipe0 = new Recipe("TNC.%zYy[ |8$/[;I5j", 35.18806449135657);
      Order order0 = new Order(recipe0, "TNC.%zYy[ |8$/[;I5j", 35.18806449135657, "TNC.%zYy[ |8$/[;I5j");
      order0.serve();
      order0.printReceipt();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Order order0 = new Order((Recipe) null, "5HW}J'0MDw", 2813.109973416);
      // Undeclared exception!
      try { 
        order0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sheffield.com1003.cafe.Order", e);
      }
  }
}
