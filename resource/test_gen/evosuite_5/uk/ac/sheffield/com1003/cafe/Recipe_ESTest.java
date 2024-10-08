/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 16:05:35 GMT 2024
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
import uk.ac.sheffield.com1003.cafe.Recipe;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Milk;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

public class Recipe_ESTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Recipe recipe0 = new Recipe("5W8 it", (-22));
        Recipe recipe1 = new Recipe("5W8 it", 1056.3);
        boolean boolean0 = recipe0.equals(recipe1);
        assertFalse(boolean0);
        assertEquals(1056.3, recipe1.getPrice(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        Recipe.Size recipe_Size0 = Recipe.Size.REGULAR;
        Recipe recipe0 = new Recipe("Z(\\p&r6!ro8z", 0.0, recipe_Size0, 0);
        double double0 = recipe0.getPrice();
        assertTrue(recipe0.isReady());
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Recipe.Size recipe_Size0 = Recipe.Size.SMALL;
        Recipe recipe0 = new Recipe("uk.ac.sheffield.com1003.cafe.ingredients.Unit", 2091.4912, recipe_Size0, 1853);
        double double0 = recipe0.getPrice();
        assertEquals(2091.4912, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        Recipe recipe0 = new Recipe((String) null, (-4476.025367898861));
        recipe0.getName();
        assertEquals((-4476.025367898861), recipe0.getPrice(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Recipe recipe0 = new Recipe("", (-939.5508589763));
        recipe0.getName();
        assertEquals((-939.5508589763), recipe0.getPrice(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        Recipe.Size recipe_Size0 = Recipe.Size.REGULAR;
        Recipe recipe0 = null;
        try {
            recipe0 = new Recipe("", (-4), recipe_Size0, (-4));
            fail("Expecting exception: NegativeArraySizeException");

        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("uk.ac.sheffield.com1003.cafe.Recipe", e);
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        Recipe.Size recipe_Size0 = Recipe.Size.REGULAR;
        Recipe recipe0 = new Recipe(", decaf=", 0, recipe_Size0, 0);
        boolean boolean0 = recipe0.isReady();
        assertTrue(boolean0);
        assertEquals(0.0, recipe0.getPrice(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        Recipe recipe0 = new Recipe("", (-938.8756151508895));
        Recipe.Size recipe_Size0 = Recipe.Size.REGULAR;
        Recipe recipe1 = new Recipe("", (-938.8756151508895), recipe_Size0, 0);
        boolean boolean0 = recipe1.equals(recipe0);
        assertFalse(boolean0);
        assertEquals((-938.8756151508895), recipe1.getPrice(), 0.01);
        assertTrue(recipe1.isReady());
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Recipe recipe0 = new Recipe("", (-939.5508589763));
        Recipe recipe1 = new Recipe("", (-939.5508589763));
        assertFalse(recipe1.isReady());

        boolean boolean0 = recipe0.equals(recipe1);
        assertEquals((-939.5508589763), recipe1.getPrice(), 0.01);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        Recipe recipe0 = new Recipe("", (-939.5508589763));
        Recipe.Size recipe_Size0 = Recipe.Size.SMALL;
        Recipe recipe1 = new Recipe("", (-939.5508589763), recipe_Size0, 0);
        boolean boolean0 = recipe0.equals(recipe1);
        assertFalse(boolean0);
        assertTrue(recipe1.isReady());
        assertEquals((-939.5508589763), recipe1.getPrice(), 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Recipe recipe0 = new Recipe("", (-939.5508589763));
        Recipe recipe1 = new Recipe("", (-1064.4));
        boolean boolean0 = recipe0.equals(recipe1);
        assertFalse(boolean0);
        assertEquals((-1064.4), recipe1.getPrice(), 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Recipe.Size recipe_Size0 = Recipe.Size.REGULAR;
        Recipe recipe0 = new Recipe(", decaf=", 0, recipe_Size0, 0);
        boolean boolean0 = recipe0.equals(recipe_Size0);
        assertTrue(recipe0.isReady());
        assertEquals(0.0, recipe0.getPrice(), 0.01);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        Recipe recipe0 = new Recipe("", (-939.5508589763));
        boolean boolean0 = recipe0.equals(recipe0);
        assertTrue(boolean0);
        assertEquals((-939.5508589763), recipe0.getPrice(), 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        Recipe recipe0 = new Recipe("$VALUES", 0.0);
        Coffee coffee0 = new Coffee(3);
        recipe0.addIngredient(coffee0);
        boolean boolean0 = recipe0.isReady();
        assertEquals(0.0, recipe0.getPrice(), 0.01);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        Recipe.Size recipe_Size0 = Recipe.Size.REGULAR;
        Recipe recipe0 = new Recipe(", decaf=", (-182.68586), recipe_Size0, 0);
        Recipe recipe1 = new Recipe("yB", (-182.68586), recipe_Size0, 0);
        boolean boolean0 = recipe1.equals(recipe0);
        assertEquals((-182.68586), recipe1.getPrice(), 0.01);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        Recipe recipe0 = new Recipe("Uq* ", 621.7120463311794);
        Milk milk0 = new Milk();
        recipe0.addIngredient(milk0);
        recipe0.addIngredient(milk0);
        assertEquals(621.7120463311794, recipe0.getPrice(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        Recipe recipe0 = new Recipe("$VALUES", 0.0);
        Coffee coffee0 = new Coffee(3);
        recipe0.addIngredient(coffee0);
        Milk.Type milk_Type0 = Milk.Type.SKIMMED;
        Milk milk0 = new Milk(8, milk_Type0);
        recipe0.addIngredient(milk0);
        assertEquals(0.0, recipe0.getPrice(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        Recipe.Size recipe_Size0 = Recipe.Size.REGULAR;
        Recipe recipe0 = new Recipe(", decaf=", 0, recipe_Size0, 0);
        Water water0 = new Water(2);
        try {
            recipe0.addIngredient(water0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("uk.ac.sheffield.com1003.cafe.Recipe", e);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        Recipe.Size recipe_Size0 = Recipe.Size.SMALL;
        Recipe recipe0 = new Recipe("", (-1.0), recipe_Size0, 0);
        double double0 = recipe0.getPrice();
        assertTrue(recipe0.isReady());
        assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        Recipe.Size recipe_Size0 = Recipe.Size.REGULAR;
        Recipe recipe0 = new Recipe(", decaf=", 0, recipe_Size0, 0);
        recipe0.hashCode();
        assertEquals(0.0, recipe0.getPrice(), 0.01);
        assertTrue(recipe0.isReady());
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        Recipe.Size recipe_Size0 = Recipe.Size.REGULAR;
        Recipe recipe0 = new Recipe(", decaf=", 0, recipe_Size0, 0);
        recipe0.getName();
        assertTrue(recipe0.isReady());
        assertEquals(0.0, recipe0.getPrice(), 0.01);
    }
}
