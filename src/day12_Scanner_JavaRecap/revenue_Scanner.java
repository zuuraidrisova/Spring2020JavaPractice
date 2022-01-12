package day12_Scanner_JavaRecap;

import java.util.Scanner;
public class revenue_Scanner {
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
        System.out.println("Enter quantity of the product: ");
        int quantity = scan.nextInt();
        double revenue = price*quantity;
        double  discount = revenue * 0.10;
        double netRevenue = revenue-discount;

        if(revenue> 5000){
            System.out.println("Your net revenue is: "+ netRevenue);
            System.out.println("Apply 10% discount");
        }else{
            System.out.println("Your net revenue is: "+netRevenue);
            System.out.println("You do not have enough revenue.");
        }

    }
}
