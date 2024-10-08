/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 15:50:16 GMT 2024
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

public class Water_ESTest {

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Water water0 = new Water();
        Water water1 = new Water(2);
        boolean boolean0 = water1.equals(water0);
        assertFalse(water0.equals((Object) water1));
        assertFalse(boolean0);
        assertEquals(2, water1.getAmount());
        assertEquals("Water", water1.getName());
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Water water0 = new Water();
        water0.name = null;
        // Undeclared exception!
        try {
            water0.equals(water0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Water water0 = new Water();
        Unit unit0 = Unit.UNDEFINED;
        water0.unit = unit0;
        Water water1 = new Water();
        boolean boolean0 = water0.equals(water1);
        assertEquals(30, water1.getAmount());
        assertFalse(boolean0);
        assertEquals("Water", water1.getName());
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Water water0 = new Water();
        Water water1 = new Water(2);
        boolean boolean0 = water0.equals(water1);
        assertEquals("Water", water1.getName());
        assertEquals(2, water1.getAmount());
        assertFalse(water1.equals((Object) water0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        Water water0 = new Water();
        Water water1 = new Water();
        assertEquals("Water", water1.getName());

        water1.name = "(";
        boolean boolean0 = water0.equals(water1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        Water water0 = new Water();
        Object object0 = new Object();
        boolean boolean0 = water0.equals(object0);
        assertEquals("Water", water0.getName());
        assertFalse(boolean0);
        assertEquals(30, water0.getAmount());
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        Water water0 = new Water();
        boolean boolean0 = water0.equals(water0);
        assertEquals(30, water0.getAmount());
        assertTrue(boolean0);
        assertEquals("Water", water0.getName());
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        Water water0 = new Water();
        boolean boolean0 = water0.equals((Object) null);
        assertEquals("Water", water0.getName());
        assertEquals(30, water0.getAmount());
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test8() throws Throwable {
        Water water0 = new Water();
        String string0 = water0.toString();
        assertEquals("Water", water0.getName());
        assertEquals("Water [unit=ML, amount=30]", string0);
    }
}
