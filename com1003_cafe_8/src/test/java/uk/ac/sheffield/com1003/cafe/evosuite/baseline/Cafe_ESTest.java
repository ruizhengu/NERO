/*
 * This file was automatically generated by EvoSuite
 * Tue Sep 26 12:57:41 GMT 2023
 */

package uk.ac.sheffield.com1003.cafe.evosuite.baseline;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sheffield.com1003.cafe.Cafe;
import uk.ac.sheffield.com1003.cafe.Order;
import uk.ac.sheffield.com1003.cafe.Recipe;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Cafe_ESTest extends Cafe_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Cafe cafe0 = new Cafe();
      Recipe recipe0 = new Recipe("uk.ac.sheffield.com1003.cafe.Recipe", 0.0);
      cafe0.addRecipe(recipe0);
      cafe0.addRecipe(recipe0);
      cafe0.removeRecipe("uk.ac.sheffield.com1003.cafe.Recipe");
      Recipe[] recipeArray0 = cafe0.getMenu();
      assertEquals(1, recipeArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Cafe cafe0 = new Cafe((String) null);
      String string0 = cafe0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Cafe cafe0 = new Cafe("");
      String string0 = cafe0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Cafe cafe0 = new Cafe();
      Recipe recipe0 = new Recipe((String) null, (-1.0));
      cafe0.addRecipe(recipe0);
      // Undeclared exception!
      try { 
        cafe0.removeRecipe((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Cafe cafe0 = new Cafe("bTp$l_O %L7Ni", 6023, 6023);
      cafe0.printMenu();
      // Undeclared exception!
      cafe0.printMenu();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Cafe cafe0 = new Cafe((String) null);
      Recipe recipe0 = new Recipe((String) null, 608.9291148723524);
      cafe0.addRecipe(recipe0);
      // Undeclared exception!
      try { 
        cafe0.placeOrder("Nd0XcG7Sr`lon-E+5Fu", "Coffee", 608.9291148723524);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Cafe cafe0 = new Cafe("8y_=%Hm6t,{V9Cumx", 3610, 3610);
      cafe0.getMenu();
      cafe0.getMenu();
      // Undeclared exception!
      cafe0.getMenu();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Cafe cafe0 = null;
      try {
        cafe0 = new Cafe("g", (-4), (-4));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sheffield.com1003.cafe.Cafe", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Cafe cafe0 = new Cafe();
      String string0 = cafe0.greeting();
      assertEquals("Welcome to Cafe", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Cafe cafe0 = new Cafe();
      String string0 = cafe0.getName();
      assertEquals("Cafe", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Recipe recipe0 = new Recipe("Menu", (-269.921132));
      Cafe cafe0 = new Cafe();
      cafe0.addRecipe(recipe0);
      cafe0.placeOrder("Menu", "Menu", (-269.921132));
      Order order0 = cafe0.serveOrder();
      assertNotNull(order0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Cafe cafe0 = new Cafe("bTp$l_O %L7Ni", 0, 0);
      Order order0 = cafe0.serveOrder();
      assertNull(order0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Cafe cafe0 = new Cafe("", 1, 1);
      Order order0 = cafe0.serveOrder();
      assertNull(order0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Recipe recipe0 = new Recipe("Menu", (-269.921132));
      Cafe cafe0 = new Cafe();
      cafe0.addRecipe(recipe0);
      try { 
        cafe0.placeOrder("Milk", "Milk", (-269.921132));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sheffield.com1003.cafe.Cafe", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Cafe cafe0 = new Cafe("Menu");
      Recipe recipe0 = new Recipe("Menu", (-269.921132));
      boolean boolean0 = cafe0.addRecipe(recipe0);
      boolean boolean1 = cafe0.placeOrder("Menu", "Menu", (-1175.215905013079));
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Cafe cafe0 = new Cafe("TaOK/*4f>!tAecH:s", 0, 0);
      try { 
        cafe0.placeOrder("TaOK/*4f>!tAecH:s", "TaOK/*4f>!tAecH:s", 0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sheffield.com1003.cafe.Cafe", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Cafe cafe0 = new Cafe();
      Recipe recipe0 = new Recipe("uk.ac.sheffield.com1003.cafe.Recipe", 0.0);
      cafe0.addRecipe(recipe0);
      cafe0.printMenu();
      assertEquals("Cafe", cafe0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Cafe cafe0 = new Cafe();
      cafe0.printPendingOrders();
      assertEquals("Cafe", cafe0.getName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Cafe cafe0 = new Cafe("", 1, 1);
      Recipe recipe0 = new Recipe("J:4MJc7(PH@w", 0.0);
      cafe0.addRecipe(recipe0);
      cafe0.placeOrder("J:4MJc7(PH@w", "Water", 2300.5544345427);
      cafe0.printPendingOrders();
      assertEquals("", cafe0.getName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Cafe cafe0 = new Cafe();
      Recipe.Size recipe_Size0 = Recipe.Size.SMALL;
      Recipe recipe0 = new Recipe("Served: ", (-4292.86), recipe_Size0, 30);
      cafe0.addRecipe(recipe0);
      try { 
        cafe0.removeRecipe(";Zj(&,e");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sheffield.com1003.cafe.Cafe", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Cafe cafe0 = new Cafe("", 1, 1);
      Recipe recipe0 = new Recipe("J:4MJc7(PH@w", 0.0);
      boolean boolean0 = cafe0.addRecipe(recipe0);
      boolean boolean1 = cafe0.addRecipe(recipe0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }
}
