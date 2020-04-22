package Replit_Practices;
import java.util.Scanner;
public class SlicingNumbers {
    public static void main(String[] args) {
        /*
        In this task, you need to slice an integer
        and print numbers one by one from new line.

Create a scanner object

Example # 1
-Display prompt: Enter your number:
12345
-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5

Example # 2

-Display prompt: Enter your number:
45678
-Display prompt: 4
-Display prompt: 5
-Display prompt: 6
-Display prompt: 7
-Display prompt: 8
Use / and % operators
         */

        //WRITE YOUR CODE HERE
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = object.nextInt();

        int digit1 = num/10000;
        int digit2 = (num % 10000)/1000;
        int digit3 = (num % 1000)/100;
        int digit4 = (num% 100)/10;
        int digit5 = num % 10;

        System.out.println(digit1+"\n"+digit2+"\n"+digit3+"\n"+digit4+"\n"+digit5);






    }
}
