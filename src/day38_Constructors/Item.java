package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {

    /*
    Custom class is a template, so it is better to create another class for using this class
    create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields

     */

    String name;
    double unitPrice;
    int quantity;


    public Item(String name, double unitPrice, int quantity){

     //this == refers to object instances, we can call instances

        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;


    }

    //instance methods should be created, because we are gonna use instance variables
    /*
    	instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and
				total cost info as calculated by calcCost()
     */

    public double calcCost(){

        return quantity * unitPrice;

    }

    // instance method : toString() to specify how we want to print our item information

    public String toString(){

        return "Item: "+name+", Unit price: $"+unitPrice+", Quantity: "+quantity+
                "\nTotal Cost of Item: $"+calcCost();
    }


}
class ShoppingList{
    /*
    create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
     */

    public static void main(String[] args) {

        Item object1 = new Item("apples",3.4,3);
        Item object2 = new Item("toilet paper", 25,2);
        Item object3 = new Item("tomato",1.4,5 );
        Item object4 = new Item("potato",6,3);
        Item object5 = new Item("coffee",5,1);

        System.out.println(object1.calcCost());//it prints total cost of only first object

        System.out.println("************************************************");

        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.addAll(Arrays.asList(object1,object2,object3,object4,object5));

        for(int i = 0; i < shoppingList.size(); i++){

            System.out.println(shoppingList.get(i));
        }

        System.out.println("************************************************");

        double total = 0;

        for(Item each : shoppingList){

            total += each.calcCost();
        }

        System.out.println("Order Total Price: $"+ total);

        System.out.println("************************************************");

        Item [] items = {object1,object2,object3,object4,object5};

        double totalCost = 0;

        for(int i = 0; i <  items.length; i++){

            totalCost += items[i].calcCost();
        }

        System.out.println("Order Total Price: $"+ totalCost);

        System.out.println("************************************************");

        for(int i = 0; i < items.length; i++){

            System.out.println(items[i]);
        }


    }
}