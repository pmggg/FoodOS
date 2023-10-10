package main;

/**
 * MainClass is in charge for maintaining the flow from the start to end.
 * @author Pamela Gayle Domingo
 */
public class MainClass{
    public static String toAddCustomer;     //Stores User's choice either Y or N.

    /**
     * Entry point for the program to run.
     * This will continuously loop to add customers if the instance variable toAddCustomer is set to "Y".
     * The total price and number of orders per food will be printed, if there are no more customers.
     * @param args-unused
     */
    public static void main(String[] args) {
        Menu.setFood();
        Menu.printMenu();
        new Sales();

        do{
            System.out.print("\nAdd Customer (Press Y/N): ");
            toAddCustomer =UserInput.stringInput();
            try{
                if(toAddCustomer.equalsIgnoreCase("Y")){
                    new Customer();         //creates an instance of the Customer Class
                }
                else if (toAddCustomer.equalsIgnoreCase("N")){
                    //prints the tallied orders and total price
                    Sales.getTallyOfFoods();
                    System.out.println(Sales.getTotalPrice());
                    System.out.println("\n================================================");
                    System.out.println("================================================\n");
                } else {
                    //throws exception if the user's input does not match Y or N
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong Input! \n");
                toAddCustomer="Y";      //sets the instance variable toAddCustomer so that the loop will continue to run.
            }
        }while (toAddCustomer.equalsIgnoreCase("Y"));
    }

    //FOR TDD ONLY
    public static void setToAddCustomer(String toAddCustomer) {
        MainClass.toAddCustomer = toAddCustomer;
    }

    public static String getToAddCustomer() {
        return toAddCustomer;
    }

}
