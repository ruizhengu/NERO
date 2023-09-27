/*
 * This file was automatically generated by EvoSuite
 * Tue Sep 26 17:45:18 GMT 2023
 */

package uk.ac.sheffield.com1003.cafe;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDateTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sheffield.com1003.cafe.Order;
import uk.ac.sheffield.com1003.cafe.Recipe;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Order_ESTest extends Order_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Recipe.Size recipe_Size0 = Recipe.Size.LARGE;
      Recipe recipe0 = new Recipe("", 1.0, recipe_Size0, 0);
      Order order0 = new Order(recipe0, "", 0, "");
      order0.printReceipt();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Recipe.Size recipe_Size0 = Recipe.Size.REGULAR;
      Recipe recipe0 = new Recipe("A6", (-3461.2658), recipe_Size0, 0);
      Order order0 = new Order(recipe0, "A6", (-3461.2658));
      order0.serve();
      order0.printReceipt();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Recipe recipe0 = new Recipe("", (-383.519));
      Order order0 = new Order(recipe0, "", (-383.519));
      LocalDateTime localDateTime0 = order0.getOrderServed();
      assertNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Recipe recipe0 = new Recipe(">)N", (-1780.33406674854));
      Order order0 = new Order(recipe0, ">)N", (-1780.33406674854), "");
      String string0 = order0.toString();
      assertEquals("Order: >)N; For: >)N; Paid: -1780.33406674854", string0);
  }
}
