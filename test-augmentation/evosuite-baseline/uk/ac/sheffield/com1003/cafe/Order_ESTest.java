/*
 * This file was automatically generated by EvoSuite
 * Tue Sep 26 12:58:47 GMT 2023
 */

package uk.ac.sheffield.com1003.cafe;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sheffield.com1003.cafe.Order;
import uk.ac.sheffield.com1003.cafe.Recipe;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Order_ESTest extends Order_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Recipe recipe0 = new Recipe("", 1835.7603470362787);
      Order order0 = new Order(recipe0, "", (-1149.200527002187), "");
      String string0 = order0.toString();
      assertEquals("Order: ; For: ; Paid: -1149.200527002187", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Order order0 = new Order((Recipe) null, "ozW}h)vN[er\"", (-612.42446), "ozW}h)vN[er\"");
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
  public void test2()  throws Throwable  {
      Recipe recipe0 = new Recipe("", 1835.7603470362787);
      Order order0 = new Order(recipe0, "", (-1149.200527002187), "");
      order0.printReceipt();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Recipe recipe0 = new Recipe("uk.ac.sheffield.com1003.cafe.ingredients.Milk$Type", (-75.993));
      Order order0 = new Order(recipe0, "uk.ac.sheffield.com1003.cafe.ingredients.Milk$Type", (-75.993));
      order0.serve();
      order0.printReceipt();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Order order0 = new Order((Recipe) null, "ozW}h)vN[er\"", (-612.42446), "ozW}h)vN[er\"");
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
