/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 15:56:48 GMT 2024
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

public class Order_ESTest {

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Recipe recipe0 = new Recipe("1mik\"|Djmp)N@q)S.r", (-673.0549144));
        Order order0 = new Order(recipe0, "1mik\"|Djmp)N@q)S.r", 0.0, "1mik\"|Djmp)N@q)S.r");
        order0.printReceipt();
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Recipe recipe0 = new Recipe("", 1.0);
        Order order0 = new Order(recipe0, "8sX>$++eU", 1.0);
        String string0 = order0.toString();
        assertEquals("Order: ; For: 8sX>$++eU; Paid: 1.0", string0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Order order0 = new Order((Recipe) null, ",2K3%JB}Uu3Kc", 0.0);
        // Undeclared exception!
        try {
            order0.printReceipt();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("uk.ac.sheffield.com1003.cafe.Order", e);
        }
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Recipe recipe0 = new Recipe("", 1.0);
        Order order0 = new Order(recipe0, "8sX>$++eU", 1.0);
        order0.serve();
        order0.printReceipt();
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        Order order0 = new Order((Recipe) null, ",2K3%JB}Uu3Kc", 0.0);
        // Undeclared exception!
        try {
            order0.toString();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("uk.ac.sheffield.com1003.cafe.Order", e);
        }
    }
}
