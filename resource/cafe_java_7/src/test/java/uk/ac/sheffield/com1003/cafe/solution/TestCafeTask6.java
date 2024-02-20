package uk.ac.sheffield.com1003.cafe.solution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.ac.sheffield.com1003.cafe.solution.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.solution.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.solution.ingredients.Water;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;
import static uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML;

public class TestCafeTask6 {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    protected Recipe createEspressoRecipe() {
        try {
            Recipe espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 2);
            espresso.addIngredient(new Coffee());
            espresso.addIngredient(new Water());
            return espresso;
        } catch (TooManyIngredientsException exc) {
            System.err.println(exc.getMessage());
            return null;
        }
    }

    protected Recipe createEspressoRecipeAlt() {
        try {
            Recipe espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 2);
            espresso.addIngredient(new Water());
            espresso.addIngredient(new Coffee());
            return espresso;
        } catch (TooManyIngredientsException exc) {
            System.err.println(exc.getMessage());
            return null;
        }
    }

    protected Recipe createEspressoRecipeIncomplete() {
        try {
            Recipe espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 2);
            espresso.addIngredient(new Water());
            return espresso;
        } catch (TooManyIngredientsException exc) {
            System.err.println(exc.getMessage());
            return null;
        }
    }

//    protected ArrayList<String> getOutLines() {
//        Stream<String> lines = outContent.toString().lines();
//        ArrayList<String> arrayList = new ArrayList<>();
//        lines.forEach(arrayList::add);
//        return arrayList;
//    }

    protected void resetOutLines() {
        outContent.reset();
    }

//    protected ArrayList<String> getErrLines() {
//        Stream<String> lines = errContent.toString().lines();
//        ArrayList<String> arrayList = new ArrayList<>();
//        lines.forEach(arrayList::add);
//        return arrayList;
//    }

    @Test
    public void testSyrupExists() throws Exception {
        try {
            Class.forName("uk.ac.sheffield.com1003.cafe.ingredients.Syrup");
        } catch (ClassNotFoundException e) {
            throw new Exception("Class Syrup does not exist");
        }
    }

//    @Test
//    public void testSyrupDefaultConstructor() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
//        Class<?> syrupClass = Class.forName("uk.ac.sheffield.com1003.cafe.ingredients.Syrup");
//        Object o = ConstructorUtils.invokeConstructor(syrupClass);
//        assertTrue(syrupClass.isInstance(o));
//    }
//
//    @Test
//    public void testSyrupDefaultConstructorSetsUnit() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
//        Class<?> syrupClass = Class.forName("uk.ac.sheffield.com1003.cafe.ingredients.Syrup");
//        Object o = ConstructorUtils.invokeConstructor(syrupClass);
//        Unit unit = (Unit)FieldUtils.readField(o, "unit", true);
//        assertEquals(ML, unit);
//    }
//
//    @Test
//    public void testSyrupContainsFlavourField() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
//        Class<?> syrupClass = Class.forName("uk.ac.sheffield.com1003.cafe.ingredients.Syrup");
//        Object o = ConstructorUtils.invokeConstructor(syrupClass);
//
//        Object flavour = FieldUtils.readField(o, "flavour", true);
//        assertNotNull(flavour);
//    }
//
//    @Test
//    public void testSyrupOverloadedConstructor() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
//        Class<?> syrupClass = Class.forName("uk.ac.sheffield.com1003.cafe.ingredients.Syrup");
//        Object o = ConstructorUtils.invokeConstructor(syrupClass, "caramel");
//        assertTrue(syrupClass.isInstance(o));
//
//        String flavour = (String)FieldUtils.readField(o, "flavour", true);
//        assertEquals("caramel", flavour);
//    }
//
//    @Test
//    public void testSyrupOverloadedConstructorSetsUnit() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
//        Class<?> syrupClass = Class.forName("uk.ac.sheffield.com1003.cafe.ingredients.Syrup");
//        Object o = ConstructorUtils.invokeConstructor(syrupClass, "caramel");
//        assertTrue(syrupClass.isInstance(o));
//
//        String flavour = (String)FieldUtils.readField(o, "flavour", true);
//        assertEquals("caramel", flavour);
//        Unit unit = (Unit)FieldUtils.readField(o, "unit", true);
//        assertEquals(ML, unit);
//    }
//
//    @Test
//    public void testSyrupToString() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
//        Class<?> syrupClass = Class.forName("uk.ac.sheffield.com1003.cafe.ingredients.Syrup");
//        Object o = ConstructorUtils.invokeConstructor(syrupClass, "caramel");
//        assertTrue(syrupClass.isInstance(o));
//        int amount = (int)FieldUtils.readField(o, "amount", true);
//        Unit unit = (Unit)FieldUtils.readField(o, "unit", true);
//        String s = (String)MethodUtils.invokeMethod(o, "toString");
//        assertEquals("Syrup [unit=" + unit + ", amount=" + amount + ", flavour=caramel]", s);
//    }
//
//    @Test
//    public void testSyrupToStringRelaxed() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
//        Class<?> syrupClass = Class.forName("uk.ac.sheffield.com1003.cafe.ingredients.Syrup");
//        Object o = ConstructorUtils.invokeConstructor(syrupClass, "caramel");
//        assertTrue(syrupClass.isInstance(o));
//        int amount = (int)FieldUtils.readField(o, "amount", true);
//        Unit unit = (Unit)FieldUtils.readField(o, "unit", true);
//        String s = (String)MethodUtils.invokeMethod(o, "toString");
//        assertTrue(s.toUpperCase().matches("SYRUP.*UNIT.*" + unit + ".*AMOUNT.*" + amount + ".*FLAVOUR.*CARAMEL.*"));
//    }

}
