package test;

import main.MainClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the MainClass Class.
 */
public class MainClassTest {
    /**
     * Tests only if toAddCustomer is Y or N (yes or no).
     */
    @Test
    public void testToAddCustomerForNo() {
        MainClass.setToAddCustomer("Y");
        assertEquals("Y", MainClass.getToAddCustomer());
    }

    @Test
    public void testToAddCustomerForYes() {
        MainClass.setToAddCustomer("N");
        assertEquals("N", MainClass.getToAddCustomer());
    }
}