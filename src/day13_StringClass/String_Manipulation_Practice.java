package day13_StringClass;
import java.util.Scanner;
public class String_Manipulation_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name: ");

        String name = scan.nextLine();

        String firstName =  name.substring(0, name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" ")+1);

        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println("Your fist name is: "+firstName+"\n"+"Your last name is: "+lastName);



    }
}
