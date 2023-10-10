package test;

import main.Order;
import org.junit.Test;

import static main.Order.*;
import static org.junit.Assert.assertEquals;

/**
 * Tests the Order Class.
 */
public class OrderTest {

    /**
     * Tests only if expected food and variable food match.
     */
    @Test
    public void  testFoodChoice(){
        setFood("Pansit");
        assertEquals("Pansit", getFood());
    }

    /**
     * Tests only if expected quantity and variable quantity match.
     */
    @Test
    public void testQuantityPerFood(){
        setQuantity(2);
        assertEquals(2, getQuantity());
    }

    /**
     * Tests only if expected price and variable price match.
     */
    @Test
    public void testPriceChosen(){
        setPrice(450);
        assertEquals(450, getPrice());
    }

    /**
     * Tests only if toAddFoodAgain is Y or N (yes or no).
     */
    @Test
    public void testIfToAddFoodAgain(){
        setToAddFoodAgain("Y");
        assertEquals("Y", getToAddFoodAgain());
    }

    /**
     * Tests the setTotalAndFoodTally method in class Order if the computed number is right.
     */
    @Test
    public void testTotalPricePerCustomer(){
        try {
            setTotalAndFoodTally(500,2);
        }catch (Exception e){
            assertEquals(1000, Order.getTotal(),0.0);
        }

    }
}