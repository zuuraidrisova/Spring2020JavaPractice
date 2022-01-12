package day15_For_Loop;
import java.util.Scanner;
public class Initials_Practice {
    public static void main(String []args){
        /*
         write a program that asks user's first and last name,
         then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
         */
        Scanner scan =new Scanner (System.in);

        System.out.println("Please enter your first name: ");
            String firstName = scan.next();

        System.out.println("Please enter your last name: ");
            String lastName = scan.next();

        firstName = firstName.substring(0,1).toUpperCase();
        lastName = lastName.substring(0,1).toUpperCase();

        System.out.println("Your initials are: "+firstName.concat(lastName));

        String initials = ""+firstName.charAt(0) + lastName.charAt(0);
        System.out.println("Your initials are: "+initials.toUpperCase());

        String initials2 = firstName.substring(0,1).concat(lastName.substring(0,1));
        System.out.println("Your initials are: ".concat(initials2).toUpperCase());



    }
}
