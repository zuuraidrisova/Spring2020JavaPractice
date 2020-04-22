package WarmUp_Practices;
import java.util.Scanner;
public class minNumber_For {
    public static void main(String []args){
        /*
         write a program that can ask the user "enter a number" five
         times and return the minimum number
				hint: you will need for loop and if statement
         */
        Scanner scan = new Scanner (System.in);

        int minNumber = 9999999;
        for(int number = 1; number<=5;number++){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if(minNumber>num){
                minNumber=num;
            }

        }
        System.out.println("Minimum number is: "+minNumber);










    }
}
