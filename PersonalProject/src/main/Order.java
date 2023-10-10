package main;

/**
 * Order Class is responsible for taking the customer's food, quantity, and price choices.
 * Uses the inherited foodInMenu array from the Menu Class.
 */
public class Order extends Menu{
    public static int quantity, price;
    public static double total;
    public static String food, toAddFoodAgain;

    //In every new entered customer, the total is set to 0;
    public Order() {
        total=0;
    }

    public static void setCustomerFood(){
        System.out.print("Food: ");
        food=UserInput.stringInput();

        /*
           If the food entered by the user exists in the array created in the Menu Class,
           the program will proceed to ask the user to input numbers for the quantity and price of the food.
         */
        if(foodsInMenu.contains(food.toUpperCase())){
            System.out.print("Quantity: ");
            quantity=UserInput.integerInput();

            System.out.print("Price: ");
            price=UserInput.integerInput();
            setTotalAndFoodTally(price,quantity);
        }else {
            System.out.println("Food not in Menu.");
            return;         //will return to the caller to ask the user to add an order again.
        }
        //Asks the user if to add order again.
        toAddFoodAgain = UserInput.stringInput();
    }

    /**
     * This method examines if neither the parameters are zero before adding them to the tally of foods and total computed price.
     * @param price the price chosen by the customer in the Menu.
     * @param quantity the desired number of pieces of the current order.
     */
    public static void setTotalAndFoodTally(int price, int quantity) {
        int tempTotal=price*quantity;
        if (tempTotal!=0) {
            total+=tempTotal;       //sets the total price for the current customer
            Sales.setTallyOfFoods(foodsInMenu.indexOf(food.toUpperCase()), quantity);
            Sales.setTotalPrice(total);     //passes the current customer's total price to the overall total price for the whole program.
        }
    }

    /**
     * @return the total price for one customer only.
     */
    public static double getTotal() {
        return total;
    }

    //FOR TDD ONLY
    //Setters
    public static void setFood(String food) {
        Order.food = food;
    }

    public static void setQuantity(int quantity) {
        Order.quantity = quantity;
    }

    public static void setPrice(int price) {
        Order.price = price;
    }

    public static void setToAddFoodAgain(String toAddFoodAgain) {
        Order.toAddFoodAgain = toAddFoodAgain;
    }

    //Getters
    public static String getFood() {
        return food;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static int getPrice() {
        return price;
    }

    public static String getToAddFoodAgain() {
        return toAddFoodAgain;
    }
}

