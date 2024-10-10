/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 15:29:22 GMT 2024
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
import uk.ac.sheffield.com1003.cafe.ingredients.Milk;
import uk.ac.sheffield.com1003.cafe.ingredients.Unit;

public class Milk_ESTest {

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Milk milk0 = new Milk(0);
        Milk milk1 = new Milk((-2915));
        boolean boolean0 = milk0.equals(milk1);
        assertEquals((-2915), milk1.getAmount());
        assertEquals("Milk", milk1.getName());
        assertFalse(boolean0);
        assertFalse(milk1.equals((Object) milk0));
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Milk milk0 = new Milk();
        milk0.name = null;
        // Undeclared exception!
        try {
            milk0.equals(milk0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Milk milk0 = new Milk(0);
        assertEquals(0, milk0.getAmount());

        milk0.amount = 0;
        milk0.amount = 0;
        milk0.amount = 2147483645;
        Milk.Type milk_Type0 = Milk.Type.ALMOND;
        Milk milk1 = new Milk(2147483645, milk_Type0);
        boolean boolean0 = milk0.equals(milk1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Milk milk0 = new Milk();
        Milk milk1 = new Milk();
        assertTrue(milk1.equals((Object) milk0));

        Unit unit0 = Unit.UNDEFINED;
        milk1.unit = unit0;
        boolean boolean0 = milk0.equals(milk1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        Milk milk0 = new Milk(0);
        Milk milk1 = new Milk();
        boolean boolean0 = milk0.equals(milk1);
        assertFalse(milk1.equals((Object) milk0));
        assertEquals(100, milk1.getAmount());
        assertFalse(boolean0);
        assertEquals("Milk", milk1.getName());
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        Milk milk0 = new Milk(0);
        Milk milk1 = new Milk();
        assertEquals("Milk", milk1.getName());

        milk1.name = "LU-*M1&oH>`Y4S@u";
        boolean boolean0 = milk0.equals(milk1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        Milk milk0 = new Milk(0);
        boolean boolean0 = milk0.equals("LU-*M1&oH>`Y4S@u");
        assertEquals(0, milk0.getAmount());
        assertEquals("Milk", milk0.getName());
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        Milk milk0 = new Milk(0);
        boolean boolean0 = milk0.equals((Object) null);
        assertEquals(0, milk0.getAmount());
        assertFalse(boolean0);
        assertEquals("Milk", milk0.getName());
    }

    @Test(timeout = 4000)
    public void test8() throws Throwable {
        Milk milk0 = new Milk();
        boolean boolean0 = milk0.equals(milk0);
        assertEquals("Milk", milk0.getName());
        assertTrue(boolean0);
        assertEquals(100, milk0.getAmount());
    }

    @Test(timeout = 4000)
    public void test9() throws Throwable {
        Milk milk0 = new Milk(0);
        String string0 = milk0.toString();
        assertEquals("Milk [unit=ML, amount=0, type=WHOLE]", string0);
        assertEquals("Milk", milk0.getName());
    }
}