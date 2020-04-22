package day13_StringClass;
import java.util.Scanner;

public class Initials {
    public static void main(String[]args){
        /*
            write me a program that asks the user first and last names, then prints the initials.
            ex:
                input:
                    cybertek
                    school
                 output:
                    CS

         */
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter your fullname: ");
        String fullName = scan.nextLine();
        String firstName =fullName.substring(0,fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName =lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println("First name is: ".concat(firstName));
        System.out.println("Last name is: ".concat(lastName));

        String first = firstName.substring(0,1);
        String second = lastName.substring(0,1);

        System.out.println("Initial of first name is: ".concat(first));
        System.out.println("Initial of last name is: ".concat(second));

        System.out.println("Initials are: "+first.concat(second));


    }
}
