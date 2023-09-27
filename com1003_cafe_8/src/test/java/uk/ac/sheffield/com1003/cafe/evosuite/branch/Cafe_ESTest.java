/*
 * This file was automatically generated by EvoSuite
 * Tue Sep 26 17:38:52 GMT 2023
 */

package uk.ac.sheffield.com1003.cafe.evosuite.branch;

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
      Cafe cafe0 = new Cafe("`=87AGH-]", 3693, 3693);
      Recipe recipe0 = new Recipe("`=87AGH-]", (-1.0));
      cafe0.addRecipe(recipe0);
      cafe0.placeOrder("`=87AGH-]", "`=87AGH-]", (-1.0));
      cafe0.serveOrder();
      assertEquals(1, cafe0.getIndexNextOrderToPlace());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Cafe cafe0 = new Cafe("", 1666, 0);
      cafe0.serveOrder();
      assertEquals(0, cafe0.getIndexNextOrderToPlace());
      assertEquals(0, cafe0.getIndexNextOrderToServe());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Cafe cafe0 = new Cafe("`=87AGH-]", 3693, 3693);
      cafe0.serveOrder();
      assertEquals(0, cafe0.getIndexNextOrderToPlace());
      assertEquals(0, cafe0.getIndexNextOrderToServe());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Cafe cafe0 = new Cafe("/6");
      Recipe.Size recipe_Size0 = Recipe.Size.REGULAR;
      Recipe recipe0 = new Recipe("/6", 1084.5514692, recipe_Size0, 1);
      cafe0.addRecipe(recipe0);
      try { 
        cafe0.placeOrder("", "", 2222.65951);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sheffield.com1003.cafe.Cafe", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Cafe cafe0 = new Cafe("dP|J'ZkHU");
      Recipe.Size recipe_Size0 = Recipe.Size.LARGE;
      Recipe recipe0 = new Recipe("Welcome to dP|J'ZkHU", 133.6467579, recipe_Size0, 0);
      boolean boolean0 = cafe0.addRecipe(recipe0);
      boolean boolean1 = cafe0.placeOrder("Welcome to dP|J'ZkHU", "S%a*Y>)u[", (-240.7899241647607));
      assertFalse(boolean1 == boolean0);
      assertEquals(0, cafe0.getIndexNextOrderToServe());
      assertEquals(0, cafe0.getIndexNextOrderToPlace());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Cafe cafe0 = new Cafe("", 1666, 0);
      try { 
        cafe0.placeOrder("", "", 0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sheffield.com1003.cafe.Cafe", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Cafe cafe0 = new Cafe("`=87AGH-]", 3693, 3693);
      Recipe recipe0 = new Recipe("`=87AGH-]", (-1.0));
      boolean boolean0 = cafe0.addRecipe(recipe0);
      assertTrue(boolean0);
      
      cafe0.printMenu();
      assertEquals(0, cafe0.getIndexNextOrderToServe());
      assertEquals(0, cafe0.getIndexNextOrderToPlace());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Cafe cafe0 = new Cafe("`=87AGH-]", 3693, 3693);
      Recipe recipe0 = new Recipe("`=87AGH-]", (-1.0));
      cafe0.addRecipe(recipe0);
      cafe0.placeOrder("`=87AGH-]", "`=87AGH-]", (-1.0));
      cafe0.printPendingOrders();
      assertEquals(1, cafe0.getIndexNextOrderToPlace());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Cafe cafe0 = new Cafe("8", 0, 0);
      cafe0.printPendingOrders();
      assertEquals(0, cafe0.getIndexNextOrderToServe());
      assertEquals(0, cafe0.getIndexNextOrderToPlace());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Cafe cafe0 = new Cafe("/6");
      Recipe.Size recipe_Size0 = Recipe.Size.REGULAR;
      Recipe recipe0 = new Recipe("/6", 1084.5514692, recipe_Size0, 1);
      boolean boolean0 = cafe0.addRecipe(recipe0);
      assertTrue(boolean0);
      
      cafe0.removeRecipe("/6");
      assertEquals(0, cafe0.getIndexNextOrderToServe());
      assertEquals(0, cafe0.getIndexNextOrderToPlace());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Cafe cafe0 = new Cafe("/6");
      Recipe recipe0 = new Recipe("/6", 2299.649244623082);
      cafe0.addRecipe(recipe0);
      try { 
        cafe0.removeRecipe("QpE78=XV@w<c");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sheffield.com1003.cafe.Cafe", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Cafe cafe0 = new Cafe("dP|J'ZkHU");
      int int0 = cafe0.getIndexNextOrderToServe();
      assertEquals(0, int0);
      assertEquals(0, cafe0.getIndexNextOrderToPlace());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Cafe cafe0 = new Cafe("dP|J'ZkHU");
      Order[] orderArray0 = cafe0.getOrders();
      assertEquals(0, cafe0.getIndexNextOrderToPlace());
      assertEquals(0, cafe0.getIndexNextOrderToServe());
      assertEquals(100, orderArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Cafe cafe0 = new Cafe();
      int int0 = cafe0.getIndexNextOrderToPlace();
      assertEquals(0, cafe0.getIndexNextOrderToServe());
      assertEquals(0, int0);
  }
}
