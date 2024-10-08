/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 07 15:38:56 GMT 2024
 */

package uk.ac.sheffield.com1003.cafe.ingredients;

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
import uk.ac.sheffield.com1003.cafe.ingredients.Unit;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Water_ESTest {

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
//    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sheffield.com1003.cafe.ingredients.Water";
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
//    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Water_ESTest.class.getClassLoader() ,
//      "uk.ac.sheffield.com1003.cafe.ingredients.Ingredient",
//      "uk.ac.sheffield.com1003.cafe.ingredients.Water",
//      "uk.ac.sheffield.com1003.cafe.ingredients.Unit"
//    );
//  }
//
//  private static void resetClasses() {
//    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Water_ESTest.class.getClassLoader());
//
//    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
//      "uk.ac.sheffield.com1003.cafe.ingredients.Ingredient",
//      "uk.ac.sheffield.com1003.cafe.ingredients.Water",
//      "uk.ac.sheffield.com1003.cafe.ingredients.Unit"
//    );
//  }

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Water water0 = new Water(0);
      Water water1 = new Water();
      boolean boolean0 = water0.equals(water1);
      assertEquals("Water", water1.getName());
      assertFalse(boolean0);
      assertEquals(30, water1.getAmount());
      assertFalse(water1.equals((Object)water0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Water water0 = new Water();
      water0.name = null;
      // Undeclared exception!
      try { 
        water0.equals(water0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Water water0 = new Water(0);
      Unit unit0 = Unit.UNDEFINED;
      water0.unit = unit0;
      Water water1 = new Water(0);
      boolean boolean0 = water0.equals(water1);
      assertEquals(0, water1.getAmount());
      assertEquals("Water", water1.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Water water0 = new Water(0);
      Water water1 = new Water(0);
      assertEquals(0, water1.getAmount());
      
      water1.amount = 2;
      boolean boolean0 = water1.equals(water0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Water water0 = new Water(0);
      boolean boolean0 = water0.equals(water0);
      assertEquals(0, water0.getAmount());
      assertTrue(boolean0);
      assertEquals("Water", water0.getName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Water water0 = new Water(0);
      boolean boolean0 = water0.equals("Water [unit=ML, amount=0]");
      assertEquals("Water", water0.getName());
      assertFalse(boolean0);
      assertEquals(0, water0.getAmount());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Water water0 = new Water(0);
      boolean boolean0 = water0.equals((Object) null);
      assertEquals(0, water0.getAmount());
      assertEquals("Water", water0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Water water0 = new Water();
      Water water1 = new Water();
      assertEquals("Water", water1.getName());
      
      water1.name = "]";
      boolean boolean0 = water0.equals(water1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Water water0 = new Water(0);
      String string0 = water0.toString();
      assertEquals("Water [unit=ML, amount=0]", string0);
      assertEquals("Water", water0.getName());
  }
}
