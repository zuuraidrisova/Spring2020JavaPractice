package day12_Scanner_JavaRecap;
import java.util.Scanner;
public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full address: ");
        String fullAddress = scan.nextLine();
        System.out.println("Your full address is: "+fullAddress);

        System.out.println("Building number: ");
        int num =scan.nextInt();

        scan.nextLine();//used to take Enter key word

        System.out.println("Enter your street: ");
        String street = scan.nextLine();

        System.out.println("Enter the zip code: ");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your city, and state: ");
        String cityState = scan.nextLine();

        String address = num+" "+street+", \n"+cityState+" "+zipCode;
        System.out.println(address);

        scan.close();
        //closes the scanner
        //after closing, we cannot use it again, we have to declare a new scanner
        // this is to save memory and make java work quicker


    }
}
