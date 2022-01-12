package day11_Scanner_Continue;
import java.util.Scanner;
public class nextLine_Practice {

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age =scan.nextInt();//30 + Enter keyword

        System.out.println("Your age is: ");

        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Your full name is: "+fullName);




    }
}
