/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 21 19:42:45 GMT 2023
 */

package uk.ac.sheffield.com1003.cafe.ingredients;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sheffield.com1003.cafe.ingredients.Milk;
import uk.ac.sheffield.com1003.cafe.ingredients.Unit;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Milk_ESTest extends Milk_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Milk milk0 = new Milk();
      Milk milk1 = new Milk(4927);
      boolean boolean0 = milk0.equals(milk1);
      assertEquals("Milk", milk1.getName());
      assertFalse(boolean0);
      assertEquals(4927, milk1.getAmount());
      assertFalse(milk1.equals((Object)milk0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Milk milk0 = new Milk();
      milk0.name = null;
      // Undeclared exception!
      try { 
        milk0.equals(milk0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Milk milk0 = new Milk(2);
      Milk.Type milk_Type0 = Milk.Type.SKIMMED;
      Milk milk1 = new Milk(2, milk_Type0);
      boolean boolean0 = milk0.equals(milk1);
      assertFalse(boolean0);
      assertEquals("Milk", milk1.getName());
      assertEquals(2, milk1.getAmount());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Milk milk0 = new Milk();
      Unit unit0 = Unit.GR;
      milk0.unit = unit0;
      Milk milk1 = new Milk(100);
      boolean boolean0 = milk0.equals(milk1);
      assertFalse(boolean0);
      assertEquals("Milk", milk1.getName());
      assertEquals(100, milk1.getAmount());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Milk milk0 = new Milk();
      Milk.Type milk_Type0 = Milk.Type.SOY;
      Milk milk1 = new Milk(0, milk_Type0);
      boolean boolean0 = milk0.equals(milk1);
      assertFalse(boolean0);
      assertEquals("Milk", milk1.getName());
      assertEquals(100, milk0.getAmount());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Milk milk0 = new Milk();
      Milk milk1 = new Milk();
      assertEquals("Milk", milk1.getName());
      
      milk1.name = "s-.3";
      boolean boolean0 = milk0.equals(milk1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Milk milk0 = new Milk();
      boolean boolean0 = milk0.equals("Milk");
      assertEquals(100, milk0.getAmount());
      assertEquals("Milk", milk0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Milk milk0 = new Milk();
      boolean boolean0 = milk0.equals((Object) null);
      assertEquals(100, milk0.getAmount());
      assertFalse(boolean0);
      assertEquals("Milk", milk0.getName());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Milk milk0 = new Milk(2);
      boolean boolean0 = milk0.equals(milk0);
      assertEquals(2, milk0.getAmount());
      assertEquals("Milk", milk0.getName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Milk milk0 = new Milk();
      String string0 = milk0.toString();
      assertEquals("Milk", milk0.getName());
      assertEquals("Milk [unit=ML, amount=100, type=WHOLE]", string0);
  }
}