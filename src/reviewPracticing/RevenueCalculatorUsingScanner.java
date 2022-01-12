package reviewPracticing;

import java.util.Scanner;

public class RevenueCalculatorUsingScanner {

    public static void main(String[] args) {

        /*
         Revenue can be calculated as the selling price of the product
         times the quantity sold,
          i.e. revenue = price × quantity.
           Write a program that asks the user to enter product price
            and quantity and then calculate the revenue.
            If the revenue is more than 5000 a discount is 10% offered.
             Program should display the discount and net revenue.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product price: ");

        double price = scan.nextDouble();

        System.out.println("Product price is: "+price+" $");

        System.out.println("Enter quantity: ");

        int quantity = scan.nextInt();

        System.out.println("Quantity is: "+quantity);

        double revenue = quantity * price;
        double discount = revenue * 0.10;
        double netRevenue = revenue - discount;


        if(revenue > 5000){

            System.out.println(discount +" is applied");
            System.out.println(netRevenue);

        }else{

            System.out.println(revenue);
            System.out.println("No discount applied");
        }

        scan.close();

    }
}
