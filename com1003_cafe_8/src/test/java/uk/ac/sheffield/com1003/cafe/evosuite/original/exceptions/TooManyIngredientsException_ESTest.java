/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 21 12:03:35 GMT 2023
 */

package uk.ac.sheffield.com1003.cafe.evosuite.original.exceptions;

import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TooManyIngredientsException_ESTest extends TooManyIngredientsException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TooManyIngredientsException tooManyIngredientsException0 = new TooManyIngredientsException();
  }
}
