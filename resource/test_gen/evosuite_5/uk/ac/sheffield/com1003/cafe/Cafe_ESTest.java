/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 16:12:08 GMT 2024
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
import uk.ac.sheffield.com1003.cafe.Cafe;
import uk.ac.sheffield.com1003.cafe.Order;
import uk.ac.sheffield.com1003.cafe.Recipe;

public class Cafe_ESTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Cafe cafe0 = new Cafe("");
        Recipe.Size recipe_Size0 = Recipe.Size.REGULAR;
        Recipe recipe0 = new Recipe("", (-1274.9911978592077), recipe_Size0, 314);
        boolean boolean0 = cafe0.addRecipe(recipe0);
        boolean boolean1 = cafe0.placeOrder("", "", 0.0);
        assertTrue(boolean1 == boolean0);
        assertTrue(boolean1);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        Cafe cafe0 = new Cafe("");
        try {
            cafe0.placeOrder("", "", 0.0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("uk.ac.sheffield.com1003.cafe.Cafe", e);
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Cafe cafe0 = new Cafe((String) null, 100, 1730);
        String string0 = cafe0.getName();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        Cafe cafe0 = new Cafe("");
        String string0 = cafe0.getName();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Cafe cafe0 = new Cafe();
        Recipe recipe0 = new Recipe((String) null, 1213.94);
        cafe0.addRecipe(recipe0);
        // Undeclared exception!
        try {
            cafe0.removeRecipe((String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        Cafe cafe0 = new Cafe("7hv?[02}FK", 3509, 3509);
        cafe0.printMenu();
        cafe0.printMenu();
        // Undeclared exception!
        cafe0.printMenu();
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        Recipe recipe0 = new Recipe((String) null, 329.204414495);
        Cafe cafe0 = new Cafe((String) null);
        cafe0.addRecipe(recipe0);
        // Undeclared exception!
        try {
            cafe0.placeOrder((String) null, (String) null, 329.204414495);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        Cafe cafe0 = new Cafe(";5Vt&']z9^i2");
        Recipe.Size recipe_Size0 = Recipe.Size.LARGE;
        Recipe recipe0 = new Recipe("X", 0.0, recipe_Size0, 3);
        cafe0.addRecipe(recipe0);
        cafe0.removeRecipe("X");
        // Undeclared exception!
        try {
            cafe0.getMenu();
            fail("Expecting exception: NegativeArraySizeException");

        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("uk.ac.sheffield.com1003.cafe.Cafe", e);
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Cafe cafe0 = null;
        try {
            cafe0 = new Cafe("~>4k)Qf\"Dr[R", (-1772), (-1772));
            fail("Expecting exception: NegativeArraySizeException");

        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("uk.ac.sheffield.com1003.cafe.Cafe", e);
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        Cafe cafe0 = new Cafe(";5Vt&']z9^i2");
        String string0 = cafe0.getName();
        assertEquals(";5Vt&']z9^i2", string0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Cafe cafe0 = new Cafe();
        Recipe recipe0 = new Recipe("C)[j7>6!", 0.0);
        cafe0.addRecipe(recipe0);
        cafe0.placeOrder("C)[j7>6!", "C)[j7>6!", 0.0);
        Order order0 = cafe0.serveOrder();
        assertNotNull(order0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Cafe cafe0 = new Cafe("YUCH6l'", 0, 0);
        Order order0 = cafe0.serveOrder();
        assertNull(order0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        Cafe cafe0 = new Cafe();
        Order order0 = cafe0.serveOrder();
        assertNull(order0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        Cafe cafe0 = new Cafe(";5Vt&']z9^i2");
        Recipe recipe0 = new Recipe(";5Vt&']z9^i2", 3);
        cafe0.addRecipe(recipe0);
        try {
            cafe0.placeOrder("\"2C3Q", "\"2C3Q", (-1274.9911978592077));
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("uk.ac.sheffield.com1003.cafe.Cafe", e);
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        Cafe cafe0 = new Cafe(";5Vt&']z9^i2");
        Recipe recipe0 = new Recipe(";5Vt&']z9^i2", 3);
        boolean boolean0 = cafe0.addRecipe(recipe0);
        boolean boolean1 = cafe0.placeOrder(";5Vt&']z9^i2", ";5Vt&']z9^i2", 0.0);
        assertFalse(boolean1 == boolean0);
        assertFalse(boolean1);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        Cafe cafe0 = new Cafe("YUCH6l'", 0, 0);
        try {
            cafe0.placeOrder("B'IZRlS", "B'IZRlS", 0.0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("uk.ac.sheffield.com1003.cafe.Cafe", e);
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        Cafe cafe0 = new Cafe();
        Recipe recipe0 = new Recipe("C)[j7>6!", 0.0);
        cafe0.addRecipe(recipe0);
        cafe0.printMenu();
        assertEquals("Cafe", cafe0.getName());
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        Cafe cafe0 = new Cafe();
        cafe0.printPendingOrders();
        assertEquals("Cafe", cafe0.getName());
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        Cafe cafe0 = new Cafe("YUCH6l'", 0, 0);
        cafe0.printPendingOrders();
        assertEquals("YUCH6l'", cafe0.getName());
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        Recipe recipe0 = new Recipe("bi|J", (-985.0504073727684));
        Cafe cafe0 = new Cafe();
        cafe0.addRecipe(recipe0);
        // Undeclared exception!
        try {
            cafe0.getMenu();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //
            verifyException("uk.ac.sheffield.com1003.cafe.Cafe", e);
        }
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        Cafe cafe0 = new Cafe("5{2j$X$'Nm^=F", 4187, 288);
        cafe0.getMenu();
        cafe0.getMenu();
        // Undeclared exception!
        cafe0.getMenu();
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        Cafe cafe0 = new Cafe();
        Recipe recipe0 = new Recipe("UDEFINED", 181.122);
        cafe0.addRecipe(recipe0);
        try {
            cafe0.removeRecipe("K");
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("uk.ac.sheffield.com1003.cafe.Cafe", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Cafe cafe0 = new Cafe(";5Vt&']z9^i2");
        Recipe recipe0 = new Recipe(";5Vt&']z9^i2", 3);
        cafe0.addRecipe(recipe0);
        boolean boolean0 = cafe0.addRecipe(recipe0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        Cafe cafe0 = new Cafe();
        Recipe recipe0 = new Recipe("C)[j7>6!", 0.0);
        cafe0.addRecipe(recipe0);
        cafe0.placeOrder("C)[j7>6!", "C)[j7>6!", 0.0);
        cafe0.printPendingOrders();
        assertEquals("Cafe", cafe0.getName());
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        Cafe cafe0 = new Cafe("YUCH6l'", 0, 0);
        Recipe.Size recipe_Size0 = Recipe.Size.LARGE;
        Recipe recipe0 = new Recipe("B'IZRlS", 124.7, recipe_Size0, 0);
        boolean boolean0 = cafe0.addRecipe(recipe0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        Cafe cafe0 = new Cafe();
        String string0 = cafe0.greeting();
        assertEquals("Welcome to Cafe", string0);
    }
}
