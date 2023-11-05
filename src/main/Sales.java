package main;

/**
 * Sales Class manages and computes the total price and the tally of foods from the beginning and end of the program.
 * Uses the inherited foodInMenu array from the Menu Class.
 */

public class Sales extends Menu {
    public static int totalPrice;
    public static int[] pieces= new int[foodsInMenu.size()];

    /**
     * This method takes the index of the food in the array(foodInMenu) to match it to the int array(pieces),
     * so that the value of the piece will be successfully added and not misplaced.
     * @param index the index of the food in the foodInMenu array.
     * @param piece the desired number of pieces or quantity food of the customer.
     */
    public static void setTallyOfFoods(int index, int piece) {
        int temp=pieces[index];
        pieces[index]=piece+temp;
    }

    /**
     * This method computes the total amount of all foods ordered from the start and end.
     * @param totalPrice the total price of the current customer's order/s.
     */
    public static void setTotalPrice(double totalPrice) {
        Sales.totalPrice += totalPrice;
    }

    /**
     * Prints the total pieces of foods ordered and the computed overall price.
     */
    public static void getTallyOfFoods() {
        System.out.println("\n================================================");
        System.out.println("================  SALES REPORT  ================\n");
        for (int i=0;i< pieces.length;i++){
            System.out.println(foodsInMenu.get(i)+" = " + pieces[i]);
        }
    }

    /**
     * This method returns the overall or total price of the orders of all customers.
     * @return the total price computed.
     */
    public static double getTotalPrice() {
        System.out.print("\nTOTAL PRICE: ");
        return totalPrice;
    }
    

}
