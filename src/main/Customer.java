package main;

/**
 * Customer Class takes care of the customer's information and desired orders.
 */
public class Customer extends Order{
    public String name, address, phone, toAddFood;

    public Customer() {
        System.out.println("\n===============  NEW CUSTOMER  ===============");
        System.out.print("Name: ");
        name=UserInput.stringInput();

        System.out.print("Address: ");
        address=UserInput.stringInput();

        System.out.print("Phone: ");
        phone=UserInput.stringInput();

        setOrder();
    }

    //Used for the CustomerTest Class only
    public Customer(String toAddFood,String name, String address, String phone) {
        this.toAddFood=toAddFood;
        this.name=name;
        this.address=address;
        this.phone=phone;
    }

    /**
     * This method will continuously ask the user to add an order unless the instance variable toAddFood is set to N.
     */
    public void setOrder() {
        do{
            System.out.print("\nAdd Order (Press Y/N): ");
            toAddFood=UserInput.stringInput();
            try{
                if(toAddFood.equalsIgnoreCase("Y")) {
                  setCustomerFood();        //calls another method from the Order Class
                } else if (toAddFood.equalsIgnoreCase("N")){
                    System.out.println("\nTotal Amount for "+ getName().toUpperCase()+" = "+total);
                    System.out.println("\n================================================");
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Wrong Input!");
                toAddFood="Y";      //sets to Y to continue the do-while loop.
            }
        }while (toAddFood.equalsIgnoreCase("Y"));
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getToAddFood() {
        return toAddFood;
    }
}
