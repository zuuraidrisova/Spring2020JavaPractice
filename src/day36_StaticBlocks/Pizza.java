package day36_StaticBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {
    /*
     create a custom class for pizza that should contain the following:
				instance variables:
					  	size (either small, medium, large)
					  	number of cheese topping
					  	number of pepperoni toppings
				instance method:
						customizeOrder(): allows user to set the size and toppisngs
						 of the pizza
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

    public double calcCost(){

        if(size.equals("small")){

           return  (numberOfPepperoni * 1.5) + (numberOfCheese * 1) + 10;

        }else if(size.equals("medium")){

            return  (numberOfPepperoni * 1.5 ) + (numberOfCheese * 1) + 12;

        }else{

            return (numberOfPepperoni * 1.5 ) + (numberOfCheese * 1) + 14;
        }
    }

    public void setPizzaInfo(String size, int numberOfCheese, int numberOfPepperoni){

        this.size =size;
        this.numberOfCheese = numberOfCheese;
        this.numberOfPepperoni = numberOfPepperoni;

    }

    public String toString(){

        return  "Size is  "+size +", Number of Pepperoni : "+numberOfPepperoni
                +", Number of Cheese : "+numberOfCheese+", Total cost : "+calcCost();
    }
}

class PizzaOrder{

    public static void main(String[] args) {

        Pizza order1 = new Pizza();

        order1.setPizzaInfo("small",5, 7);

        System.out.println(order1);

        System.out.println("================================================");

        Pizza order2 = new Pizza();

        order2.setPizzaInfo("medium", 9, 3);

        Pizza order3 = new Pizza();

        order3.setPizzaInfo("large", 4, 4);

        Pizza order4 = new Pizza();

        order4.setPizzaInfo("small",9, 6);

        ArrayList<Pizza> list = new ArrayList<>();

        list.addAll(Arrays.asList(order1,order2,order3,order4));


        for(int i = 0; i < list.size(); i++){

            System.out.println(list.get(i));
        }

        System.out.println("============================================");

        int total = 0;

        for(Pizza each : list){

            total += each.calcCost();

        }

        System.out.println(total);
    }
}