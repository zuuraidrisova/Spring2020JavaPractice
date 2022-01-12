package reviewPracticing;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {

    /*
    create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields

    instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice

     toString(): returns the name, unit price, quantity and total cost info
     as calculated by calcCost()
	  */

    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity){

        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){

        return quantity * unitPrice;
    }

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

        Item item1 = new Item("coffee",7,4);
        Item item2 = new Item("milk",3,1);
        Item item3 = new Item("honey",4,1);
        Item item4 = new Item("apples",5,2);
        Item item5 = new Item("bread",2,4);

        ArrayList<Item> items = new ArrayList<>();

        items.addAll(Arrays.asList(item1,item2,item3,item4,item5));

        double totalCost = 0;

        for (int j = 0 ; j <= items.size()-1; j++){

            System.out.println(items.get(j));
        }

        for (Item each : items){

            totalCost += each.calcCost();
        }

        System.out.println("totalCost = " + totalCost);
    }
}