package Replit_Practices;
import java.util.Scanner;
public class ShoppingList_Practice {
    /*
    In this assignment you will write a program to create a shopping
    list and prices.

You will use Scanner object and ask user to enter 3 items followed by
 its price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Create a Scanner object named scan.

Execution flow with example:

-Display prompt "Enter Item1 and its price:"
Tomatoes
5.5

-Display prompt "Enter Item2 and its price:"
Cheese
3.5

-Display prompt "Enter Item3 and its price:"
Apples
6.3

-calculate totalPrice for all items

-build the report variable by concatenating Strings and double values:

"Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3"
"Total price: 15.3"

- Print the value of report variable
     */

        public static void main(String[] args) {
            //WRITE YOUR CODE HERE:
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Item1, count and its price:");
            String item1 = scan.next();
            int count1 = scan.nextInt();
            double price1 = scan.nextDouble();
            System.out.println("Enter Item2, count and its price:");
            String item2 = scan.next();
            int count2 = scan.nextInt();
            double price2 = scan.nextDouble();
            System.out.println("Enter Item3, count and its price:");
            String item3 = scan.next();
            int count3 = scan.nextInt();
            double price3 = scan.nextDouble();

            double totalPrice = 0;
            if(count1>0 && count2>0){
                totalPrice = (price1*count1)+(count2*price2);
            }else if(count1>0 && count3>0){
                totalPrice = (count1*price1)+(count3*price3);
            }else{
                totalPrice =(count2*price2)+ (count3*price3);
            }

            String report = " ";
            if(count1>0 && count2>0 && count3==0){
                report = "Item1: "+item1+" Price: "+(price1*count1)+", Item2: "+item2+" Price: "
                        +(price2*count2);
            }else if(count1>0 && count2==0 && count3>0){
                report = "Item1: "+item1+" Price: "+(price1*count1)+", Item3: "+item3+" Price: "
                        +(price3*count3);
            }else{
                report = "Item2: "+item2+" Price: "+(price2*price2)+", Item3: "+item3+" Price: "
                        +(price3*count3);
            }

            System.out.println(report);
            System.out.println("Total price: "+ totalPrice);

        }
    }
