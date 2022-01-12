package day13_StringClass;
import java.util.Scanner;
public class Address {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a building number: ");
        String building = scan.next();

        scan.nextLine();

        System.out.println("Enter a street address: ");
        String street = scan.nextLine();

        System.out.println("Enter a city name: ");
        String city = scan.nextLine();

        System.out.println("Enter a state name: ");
        String state = scan.nextLine();

        System.out.println("Enter your zip code: ");
        String zipCode = scan.next();

        scan.nextLine();

        System.out.println("Enter your full name: ");
        String name = scan.nextLine();

        String ship = "Ship to:"+name+"\n\t\t"+building
                +" "+street+"\n\t\t"+city+" "+state+" "+zipCode;

        System.out.println(ship);

        scan.close();
    }
}
