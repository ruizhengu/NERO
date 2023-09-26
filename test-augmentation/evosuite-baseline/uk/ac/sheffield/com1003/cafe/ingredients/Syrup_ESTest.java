/*
 * This file was automatically generated by EvoSuite
 * Tue Sep 26 12:53:10 GMT 2023
 */

package uk.ac.sheffield.com1003.cafe.ingredients;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sheffield.com1003.cafe.ingredients.Syrup;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Syrup_ESTest extends Syrup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Syrup syrup0 = new Syrup();
      String string0 = syrup0.toString();
      assertEquals("Syrup", syrup0.getName());
      assertEquals("Syrup [unit=ML, amount=10, flavour=Plain]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Syrup syrup0 = new Syrup("");
      assertEquals("Syrup", syrup0.getName());
      assertEquals(10, syrup0.getAmount());
  }
}
