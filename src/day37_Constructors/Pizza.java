package day37_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {
    /*
    create a custom class for pizza that should contain the following:
				instance variables:
					  	size (either small, medium, large)
					  	number of cheese topping
					  	number of pepperoni toppings
			  	Add a constructor that can allow user to set the size and toppisngs of the pizza
				instance method:
						calcCost(): returns the total cost as double
						toString(): a String return method that's containing the pizza' size,
						quantity of each topping, and the pizza cost as calculated by calcCost()
				Pizza cost is determined by:
						Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
						Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
						Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping
     */

    String size;
    int numberOfCheese;
    int numberOfPepperoni;

    public Pizza(String size, int numberOfPepperoni, int numberOfCheese){

        this.size =size;
        this.numberOfCheese = numberOfCheese;
        this.numberOfPepperoni = numberOfPepperoni;


    }

    public double calcCost(){

        if(size.equals("small")){

            return (numberOfPepperoni * 1.5 ) + (numberOfCheese * 1) + 10;

        }else if(size.equals("medium")){

            return (numberOfCheese + numberOfPepperoni) * 2.5 + 12;

        }else{

            return (numberOfPepperoni + numberOfCheese ) * 2.5 + 14;
        }

    }

    public String toString(){

       return "Size : "+size+" Number of Cheese: "+numberOfCheese+" Number of Pepperoni: "

                +numberOfPepperoni + " Total cost : "+calcCost();

    }

}

   /*
	create a class called Order
			create five objects of the pizza
			create an arraylist of pizza and add those 5 objects into it
			calculate the total price of the order (use for each loop)
     */

class Order{

    public static void main(String[] args) {

        Pizza order1 = new Pizza("small",4,7);
        Pizza order2 = new Pizza("medium",12,10);
        Pizza order3 = new Pizza("large",9,3);
        Pizza order4 = new Pizza("small",5,4);
        Pizza order5 = new Pizza("medium",8,2);

        ArrayList<Pizza> listOfOrders = new ArrayList<>();

        listOfOrders.addAll(Arrays.asList(order1,order2,order3,order4,order5));

        for(int i = 0; i < listOfOrders.size(); i++){

            System.out.println(listOfOrders.get(i));
        }

        System.out.println("================================");

        int total = 0;

        for(Pizza each : listOfOrders){

            total += each.calcCost();
        }

        System.out.println(total);
    }
}