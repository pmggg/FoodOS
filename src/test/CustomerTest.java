package test;

import main.Customer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the Customer Class.
 */
public class CustomerTest {

    /**
     * Tests if the given customer details match.
     */
    @Test
    public void shouldAddCustomerDetails(){
        Customer customer = new Customer("Y", "Juan", "Bayan", "09123456789");
        assertEquals("Y", customer.getToAddFood());
        assertEquals("Juan", customer.getName());
        assertEquals("Bayan", customer.getAddress());
        assertEquals("09123456789", customer.getPhone());
    }

}