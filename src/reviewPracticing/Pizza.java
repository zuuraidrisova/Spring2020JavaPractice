package reviewPracticing;

public class Pizza {
       /*
    create a custom class for pizza that should contain the following:
				instance variables:
					  	size (either small, medium, large)
					  	number of cheese topping
					  	number of pepperoni toppings
				instance method:
						customizeOrder(): allows user to set the size and toppisngs of the pizza
						calcCost(): returns the total cost as double
						toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
				Pizza cost is determined by:
						Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
						Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
						Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping

     */

       String size;
       int numberOfCheese;
       int numberOfPepperoni;

       public void customOrder(String size, int numberOfPepperoni, int numberOfCheese){

           this.size = size;
           this.numberOfCheese = numberOfCheese;
           this.numberOfPepperoni = numberOfPepperoni;

       }

       public double calcCost(){

           double cost = 0;

           if (size.equalsIgnoreCase("small")){

               cost += 10;

               cost = cost +(numberOfPepperoni * 1.5) + (numberOfCheese*1);

           }else if (size.equalsIgnoreCase("medium")){

               cost += 12;
               cost = cost +(numberOfPepperoni * 1.5) + (numberOfCheese*1);

           }else if (size.equalsIgnoreCase("large")){

               cost += 14;
               cost = cost +(numberOfPepperoni * 1.5) + (numberOfCheese*1);

           }else{

               System.out.println("please choose the right size");
           }

           return cost;


       }


       public String toString(){

           String result =  "I want " + size + " pizza "+"with " + numberOfCheese +
                   " cheese toppings and " + numberOfPepperoni + " pepperoni toppings "
                   + "and price is $ " + calcCost() ;

           return  result;
       }
}

class PizzaObject{

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        Pizza pizza3 = new Pizza();
        Pizza pizza4 = new Pizza();

        pizza1.customOrder("small",4,4);
        pizza2.customOrder("large",2,4);
        pizza3.customOrder("medium",1,3);
        pizza4.customOrder("medium",5,0);

        Pizza[] pizzas = {pizza1,pizza2,pizza3,pizza4};

        for (Pizza eachPizza : pizzas){

            System.out.println(eachPizza);
        }

    }
}