package uk.ac.sheffield.com1003.cafe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Milk;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EduTestLLM4 {
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

    protected ArrayList<String> getOutLines() {
        String[] lines = outContent.toString().split("\\r?\\n");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(lines));
        return arrayList;
    }

    protected void resetOutLines() {
        outContent.reset();
    }

    @Test
    public void printPendingOrderSingle() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 2, 1);
        cafe.addRecipe(createEspressoRecipe());
        cafe.placeOrder("Espresso", "Jose", 3);
        cafe.printPendingOrders();
        ArrayList<String> lines = getOutLines();
        assertEquals(2, lines.size());
        assertEquals("Pending Orders:", lines.get(0));
        assertEquals("Order: Espresso; For: Jose; Paid: 3.0", lines.get(1));
    }

    @Test
    public void printPendingOrdersMultiple() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 2, 2);
        cafe.addRecipe(createEspressoRecipe());
        cafe.placeOrder("Espresso", "Jose", 3);
        cafe.placeOrder("Espresso", "Mari-Cruz", 5);
        cafe.printPendingOrders();
        ArrayList<String> lines = getOutLines();
        assertEquals(3, lines.size());
        assertEquals("Pending Orders:", lines.get(0));
        assertEquals("Order: Espresso; For: Jose; Paid: 3.0", lines.get(1));
        assertEquals("Order: Espresso; For: Mari-Cruz; Paid: 5.0", lines.get(2));
    }

    @Test
    public void printPendingOrdersAfterServing() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 2, 2);
        cafe.addRecipe(createEspressoRecipe());
        cafe.placeOrder("Espresso", "Mari-Cruz", 5);
        cafe.placeOrder("Espresso", "Jose", 3);
        cafe.serveOrder();
        cafe.printPendingOrders();
        ArrayList<String> lines = getOutLines();
        assertEquals(2, lines.size());
        assertEquals("Pending Orders:", lines.get(0));
        assertEquals("Order: Espresso; For: Jose; Paid: 3.0", lines.get(1));
    }

    @Test
    public void printPendingOrderSingleRelaxed() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 2, 1);
        cafe.addRecipe(createEspressoRecipe());
        cafe.placeOrder("Espresso", "Jose", 3);
        cafe.printPendingOrders();
        ArrayList<String> lines = getOutLines();
        assertTrue(lines.stream().anyMatch(item -> item.toUpperCase().matches(".*PENDING.*ORDERS.*")));
        assertTrue(lines.stream().anyMatch(item -> item.toUpperCase().matches(".*ORDER.*ESPRESSO.*FOR.*JOSE.*PAID.*3.*")));
    }

    @Test
    public void printPendingOrdersEmpty() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 2, 2);
        cafe.printPendingOrders();
        ArrayList<String> firstPrint = getOutLines();
        resetOutLines();

        cafe.addRecipe(createEspressoRecipe());
        cafe.placeOrder("Espresso", "Mari-Cruz", 5);
        cafe.serveOrder();
        cafe.printPendingOrders();
        ArrayList<String> secondPrint = getOutLines();
        resetOutLines();

        cafe.placeOrder("Espresso", "Jose", 3);
        cafe.serveOrder(); // both orders served, no pending order left
        cafe.printPendingOrders();
        ArrayList<String> thirdPrint = getOutLines();
        resetOutLines();
        assertEquals(firstPrint, secondPrint);
        assertEquals(secondPrint, thirdPrint);
    }

    @Test(expected = TooManyIngredientsException.class)
    public void addTooManyIngredients() throws Exception {
        Recipe espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 2);
        espresso.addIngredient(new Coffee());
        espresso.addIngredient(new Water());
        espresso.addIngredient(new Milk()); // This should throw an exception
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void placeOrderForNonExistentRecipe() throws Exception {
//        Cafe cafe = new Cafe("Central Perk", 2, 1);
//        cafe.placeOrder("InvalidRecipe", "Jose", 3); // Non-existent recipe name
//    }

//    @Test(expected = NullPointerException.class)
//    public void placeOrderWithNullCustomerName() throws Exception {
//        Cafe cafe = new Cafe("Central Perk", 2, 1);
//        cafe.addRecipe(createEspressoRecipe());
//        cafe.placeOrder("Espresso", null, 3); // Null customer name
//    }

//    @Test(expected = IllegalArgumentException.class)
//    public void placeOrderWithNonPositiveQuantity() throws Exception {
//        Cafe cafe = new Cafe("Central Perk", 2, 1);
//        cafe.addRecipe(createEspressoRecipe());
//        cafe.placeOrder("Espresso", "Jose", -1); // Negative quantity
//    }
//
//    @Test(expected = IllegalStateException.class)
//    public void serveNonExistentOrder() throws Exception {
//        Cafe cafe = new Cafe("Central Perk", 2, 1);
//        cafe.serveOrder(); // No orders to serve
//    }
//
//    @Test(expected = IllegalStateException.class)
//    public void serveOrderBeforePlacingAnyOrders() throws Exception {
//        Cafe cafe = new Cafe("Central Perk", 2, 1);
//        cafe.placeOrder("Espresso", "Jose", 3);
//        cafe.serveOrder(); // Order served before another one is placed
//        cafe.serveOrder(); // Serve non-existent order
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void addRecipeWithEmptyName() throws Exception {
//        Recipe espresso = new Recipe("", 1.5, Recipe.Size.SMALL, 2);
//        espresso.addIngredient(new Coffee());
//        espresso.addIngredient(new Water());
//    }
//
//    @Test(expected = NullPointerException.class)
//    public void addNullIngredient() throws Exception {
//        Recipe espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 2);
//        espresso.addIngredient(null); // Null ingredient
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void addDuplicateIngredients() throws Exception {
//        Recipe espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 2);
//        espresso.addIngredient(new Coffee());
//        espresso.addIngredient(new Coffee()); // Duplicate coffee
//    }
}
