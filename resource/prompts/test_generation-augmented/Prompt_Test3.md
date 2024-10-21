The task is to augment an existing test suite to make it cover as many cases as possible.

There are the classes that the test suite interact with:

```
package uk.ac.sheffield.com1003.cafe;

import uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException;
import uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException;

public class Cafe {
    private String name;
    private Recipe[] menu;
    private Order[] orders;

    private int indexNextOrderToPlace;
    private int indexNextOrderToServe;
    private int nRecipes;

    /**
     * Constructor that initialises name to "Cafe", menu
     * size to 10 and capacity (number of orders) to 100.
     */
    public Cafe() {
        this("Cafe");
    }

    /**
     * Constructor that takes cafe name as parameter, and
     * initialises menu size to 10 and capacity (number of orders) to 100.
     */
    public Cafe(String name) {
        this(name, 10, 100);
    }

    /**
     * Constructor that takes the cafe name, menu size and
     * capacity (number of orders) as parameters.
     */
    public Cafe(String name, int sizeMenu, int orderCapacity) {
        this.name = name;
        menu = new Recipe[sizeMenu];
        orders = new Order[orderCapacity];
        indexNextOrderToPlace = 0;
        indexNextOrderToServe = 0;
        nRecipes = 0;
    }

    /**
     * Returns greeting string
     *
     * @return "Welcome to <cafe name>"
     */
    public String greeting() {
        return "Welcome to " + getName();
    }

    /**
     * Getter for cafe name
     *
     * @return Cafe name
     */
    public String getName() {
        return name;
    }


    /**
     * Add the given recipe to the menu.
     *
     * @param newRecipe Recipe to be added to menu
     * @return Returns true if there is space in the menu and new recipe is successfully added; false otherwise
     */
    public boolean addRecipe(Recipe newRecipe) {
        int i = 0;
        boolean added = false;
        while (i < menu.length && !added) {
            if (menu[i] == null) {
                menu[i] = newRecipe;
                nRecipes++;
                added = true;
            } else
                i++;
        }
        return added;
    }

    /**
     * Find recipe with given name and remove it from the menu.
     * Assumes there are no duplicated recipe names.
     *
     * @param recipeName Name of the recipe to be removed
     */
    public void removeRecipe(String recipeName) throws RecipeNotFoundException {
        int i = 0;
        while (i < menu.length) {
            if (menu[i] != null && menu[i].getName().equals(recipeName)) {
                nRecipes--;
                menu[i] = null;
                return;
            } else
                i++;
        }
        throw new RecipeNotFoundException();
    }

    /**
     * Returns the current list of recipes in the menu excluding empty/null elements
     *
     * @return Array of recipes contained in the menu (excluding nulls)
     */
    public Recipe[] getMenu() {
        Recipe[] actualMenu = new Recipe[nRecipes];
        int next = 0;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] != null) {
                actualMenu[next] = menu[i];
                next++;
            }
        }
        return actualMenu;
    }

    /**
     * Print a list of orders not yet served in the following format
     * Pending Orders:
     * <Output of call to {@link Order#toString()}; one pending order per line>
     */
    public void printPendingOrders() {
        StringBuffer sb = new StringBuffer();
        String lineBreak = System.getProperty("line.separator");
        sb.append("Pending Orders:");
        int i = indexNextOrderToServe;
        while (i < orders.length && orders[i] != null) {
            sb.append(lineBreak);
            sb.append(orders[i].toString());
            i++;
        }
        System.out.println(sb);
    }

    /**
     * Print the full menu in the following format:
     * ==========
     * <Output of call to {@link Cafe#greeting()}>
     * Menu
     * ==========
     * <Recipe name> - <Recipe price>
     * ==========
     * Enjoy!
     */
    public void printMenu() {
        StringBuffer sb = new StringBuffer();
        String lineBreak = System.getProperty("line.separator");
        String sectionSep = "==========" + lineBreak;
        sb.append(sectionSep);
        sb.append(greeting());
        sb.append(lineBreak);
        sb.append("Menu");
        sb.append(lineBreak);
        sb.append(sectionSep);
        for (Recipe recipe : menu) {
            if (recipe != null) {
                sb.append(recipe.getName());
                sb.append(" - ");
                sb.append(recipe.getPrice());
                sb.append(lineBreak);
            }
        }
        sb.append(sectionSep);
        sb.append("Enjoy!");
        System.out.println(sb);
    }

    /**
     * Place an order for a given recipe name with a given amount of money.
     *
     * @param recipeName   The name of the recipe being ordered
     * @param amountPaid   Money handed when placing order
     * @param customerName Name of customer placing order
     * @return True if the recipe name exists in the menu and the amount paid is sufficcient; return false otherwise
     * @throws RecipeNotFoundException    if the recipe name does not exist in the menu
     * @throws CafeOutOfCapacityException if the cafe cannot take any more orders and is out of capacity
     */
    public boolean placeOrder(String recipeName, String customerName, double amountPaid) throws CafeOutOfCapacityException, RecipeNotFoundException {
        if (indexNextOrderToPlace >= orders.length)
            throw new CafeOutOfCapacityException();

        Recipe r = findRecipe(recipeName);
        if (r == null)
            throw new RecipeNotFoundException();

        if (r.getPrice() > amountPaid)
            return false;

        orders[indexNextOrderToPlace] = new Order(r, customerName, amountPaid);
        indexNextOrderToPlace++;
        return true;
    }

    /**
     * Find a recipe in the menu given a recipe name
     *
     * @param recipeName Name of the recipe to find
     * @return The recipe found or null otherwise
     */
    private Recipe findRecipe(String recipeName) {
        int i = 0;
        while (i < menu.length) {
            if (menu[i] != null && menu[i].getName().equals(recipeName))
                return menu[i];
            i++;
        }
        return null;
    }

    /**
     * If there is an order to serve, serves it ({@link Order#serve()}) and increments {@link Cafe#indexNextOrderToServe}
     *
     * @return The updated served order, or null of there is no order to serve.
     */
    public Order serveOrder() {
        if (indexNextOrderToServe >= orders.length)
            return null;
        Order o = orders[indexNextOrderToServe];
        if (o == null)
            return null;
        o.serve();
        indexNextOrderToServe++;
        return o;
    }
}
```

```
package uk.ac.sheffield.com1003.cafe;

import java.util.*;

import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.ingredients.Ingredient;

public class Recipe {
    public enum Size {SMALL, REGULAR, LARGE}

    ;
    private String name;
    private double price;
    private Size size;
    private Ingredient[] ingredients;

    public Recipe(String name, double price) {
        this(name, price, Size.REGULAR, 3);

    }

    public Recipe(String name, double price, Size size, int numberOfIngredients) {
        this.name = name;
        this.price = price;
        this.size = size;
        ingredients = new Ingredient[numberOfIngredients];
    }

    /**
     * Add ingredient to recipe if it does not already exist.
     * If ingredient with the same name already exists, replace it with the new one.
     *
     * @param ingredient Ingredient to be added to recipe.
     * @throws TooManyIngredientsException if the number of ingredients in the recipe would be exceeded
     */
    public void addIngredient(Ingredient ingredient) throws TooManyIngredientsException {
        int i = 0;
        while (i < ingredients.length) {
            if (ingredients[i] == null || ingredients[i].equals(ingredient)) {
                ingredients[i] = ingredient;
                return;
            } else
                i++;
        }
        if (i < ingredients.length)
            ingredients[i] = ingredient;
        else
            throw new TooManyIngredientsException();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    /**
     * Checks whether recipe is ready to be used.
     *
     * @return True if all ingredients of the recipe have been added and false otherwise
     */
    public boolean isReady() {
        for (Ingredient ingredient : ingredients) {
            if (ingredient == null)
                return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Recipe))
            return false;
        Recipe recipe = (Recipe) o;
        if ((recipe.price != price) || (size != recipe.size))
            return false;

        if (!isReady() || !recipe.isReady())
            return false;

        if (ingredients.length != recipe.ingredients.length)
            return false;

        for (int i = 0; i < ingredients.length; i++) {
            boolean found = false;
            for (int j = 0; j < ingredients.length; j++) {
                if (ingredients[i].equals(recipe.ingredients[j])) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, price, size);
        result = 31 * result + Arrays.hashCode(ingredients);
        return result;
    }
}
```

Here is the existing test suite.

```
package uk.ac.sheffield.com1003.cafe;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException;
import uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException;
import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


public class TestCafeTask3 {


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

    @Test
    public void testCafeOutOfCapacityExceptionExists() {
        try {
            Class.forName("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        } catch (ClassNotFoundException e) {
            fail("CafeOutOfCapacityException class does not exist");
        }
    }

    @Test
    public void testRecipeNotFoundExceptionExists() {
        try {
            Class.forName("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        } catch (ClassNotFoundException e) {
            fail("RecipeNotFoundException class does not exist");
        }
    }

    @Test
    public void placeOrder() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 1, 1);
        cafe.addRecipe(createEspressoRecipe());
        assertTrue(cafe.placeOrder("Espresso", "Jose", 3));
        Order[] orders = (Order[]) FieldUtils.readField(cafe, "orders", true);
        assertEquals(1, orders.length);
        Order o = orders[0];
        assertEquals("Order: Espresso; For: Jose; Paid: 3.0", o.toString());
        Object served = FieldUtils.readField(o, "orderServed", true);
        assertNull(served); // order has not been served yet
    }

    @Test
    public void placeOrderWithInsufficientFunds() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 1, 1);
        cafe.addRecipe(createEspressoRecipe()); // Price is 1.5
        assertFalse(cafe.placeOrder("Espresso", "Jose", 1));
        Order[] orders = (Order[]) FieldUtils.readField(cafe, "orders", true);
        assertNull(orders[0]);
    }

    @Test(expected = Exception.class)
    public void placeOrderForNonexistentRecipeThrowsException() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 1, 1);
        cafe.addRecipe(createEspressoRecipe()); // Price is 1.5
        cafe.placeOrder("Flat white", "Jose", 10);
    }

    @Test(expected = RecipeNotFoundException.class)
    public void placeOrderForNonexistentRecipeThrowsCorrectException() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 1, 1);
        cafe.addRecipe(createEspressoRecipe()); // Price is 1.5
        cafe.placeOrder("Flat white", "Jose", 10);
    }

    @Test
    public void placeOrderAndCheckIndexes() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 1, 1);
        cafe.addRecipe(createEspressoRecipe());
        assertTrue(cafe.placeOrder("Espresso", "Jose", 3));
        int indexPlace = (int) FieldUtils.readField(cafe, "indexNextOrderToPlace", true);
        int indexServe = (int) FieldUtils.readField(cafe, "indexNextOrderToServe", true);
        assertEquals(1, indexPlace);
        assertEquals(0, indexServe);
    }

    @Test
    public void serveNonexistentOrder() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 2, 2);
        cafe.addRecipe(createEspressoRecipe());
        Order o = cafe.serveOrder();
        assertNull(o);
        int indexPlace = (int) FieldUtils.readField(cafe, "indexNextOrderToPlace", true);
        int indexServe = (int) FieldUtils.readField(cafe, "indexNextOrderToServe", true);
        assertEquals(0, indexPlace);
        assertEquals(0, indexServe);
        Order[] orders = (Order[]) FieldUtils.readField(cafe, "orders", true);
        for (int i = 0; i < orders.length; i++) {
            assertNull(orders[i]);
        }
    }

    @Test
    public void placeAndServeOrder() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 2, 1);
        cafe.addRecipe(createEspressoRecipe());
        assertTrue(cafe.placeOrder("Espresso", "Jose", 3));
        Order o = cafe.serveOrder();
        Object served = FieldUtils.readField(o, "orderServed", true);
        assertNotNull(served); // order has been served
        int indexPlace = (int) FieldUtils.readField(cafe, "indexNextOrderToPlace", true);
        int indexServe = (int) FieldUtils.readField(cafe, "indexNextOrderToServe", true);
        assertEquals(1, indexPlace);
        assertEquals(1, indexServe);
        assertNull(cafe.serveOrder()); // cannot serve more orders
    }

    @Test(expected = Exception.class)
    public void placeOrderCapacityZeroThrowsException() throws RecipeNotFoundException, CafeOutOfCapacityException {
        Cafe cafe = new Cafe("Central Perk", 2, 0);
        cafe.addRecipe(createEspressoRecipe());
        cafe.placeOrder("Espresso", "Jose", 3);
    }

    @Test(expected = CafeOutOfCapacityException.class)
    public void placeOrderCapacityZeroThrowsCorrectException() throws RecipeNotFoundException, CafeOutOfCapacityException {
        Cafe cafe = new Cafe("Central Perk", 2, 0);
        cafe.addRecipe(createEspressoRecipe());
        cafe.placeOrder("Espresso", "Jose", 3);
    }

    @Test(expected = Exception.class)
    public void placeOrderOutOfCapacityThrowsException() throws RecipeNotFoundException, CafeOutOfCapacityException {
        Cafe cafe = new Cafe("Central Perk", 2, 1);
        cafe.addRecipe(createEspressoRecipe());
        cafe.placeOrder("Espresso", "Jose", 3);
        cafe.placeOrder("Espresso", "Mari-Cruz", 5);
    }

    @Test(expected = CafeOutOfCapacityException.class)
    public void placeOrderOutOfCapacityThrowsCorrectException() throws RecipeNotFoundException, CafeOutOfCapacityException {
        Cafe cafe = new Cafe("Central Perk", 2, 1);
        cafe.addRecipe(createEspressoRecipe());
        cafe.placeOrder("Espresso", "Jose", 3);
        cafe.placeOrder("Espresso", "Mari-Cruz", 5);
    }
}
```

Please keep the orginal test suite, and augment it by creating more tests into it.

Please do not create objects that are not included in the clasess.

Please do not add tests targeting the constructors of the classes.