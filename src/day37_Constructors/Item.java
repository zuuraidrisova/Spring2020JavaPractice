package day37_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {
    /*
    create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
	  */

    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity){

        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;

    }
    /*
    instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
     */
    public double calcCost(){

        return quantity * unitPrice;
    }

   // toString(): returns the name, unit price, quantity and total cost info
    // as calculated by calcCost()

     public String toString(){

        return "Name: "+name +" Unit price: "+unitPrice+" Quantity: "+quantity+" Total cost: "+calcCost();
    }

}


/*
	create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
 */

class ShoppingList{

    public static void main(String[] args) {

        Item object1 = new Item("coffee", 8.9,1);
        Item object2 = new Item("milk", 5.5,2);
        Item object3 = new Item("eggs", 6, 1);
        Item object4 = new Item("blueberries", 5.7, 3);
        Item object5 = new Item("salmon", 32,3);


        ArrayList<Item> shoppingList = new ArrayList<>();

        shoppingList.addAll(Arrays.asList(object1,object2,object3,object4, object5));

        for(int i = 0; i < shoppingList.size(); i++){

            System.out.println(shoppingList.get(i));
        }

        System.out.println("============================================");

        int total = 0;
        for(Item each : shoppingList){

            total += each.calcCost();

        }


        System.out.println(total);

    }
}