package test;

import main.Sales;
import org.junit.Test;

import static main.Sales.pieces;
import static org.junit.Assert.assertEquals;

/**
 * Tests the Sales Class.
 */
public class SalesTest {
    /**
     * Tests the setTallyOfFoods in class Sales.
     * Checks if the element in the int array matches the sum of index and newPiece.
     */
    @Test
    public void testTallyOfFoods() {
        pieces=new int[5];
        int[] piecesArray= new int[5];

        int index=1;
        int newPiece=2;

        piecesArray[index]=newPiece;
        Sales.setTallyOfFoods(index,newPiece);
        assertEquals(piecesArray[index], pieces[index]);

    }

    /**
     * Tests the setTotalPrice in class Sales and see if it matches to the computes total in the method.
     */
    @Test
    public void testTotalPrice() {
        Sales.setTotalPrice(450.0);
        assertEquals(450.0, Sales.getTotalPrice(),0.0);
    }
}