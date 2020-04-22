package day12_Scanner_JavaRecap;
import java.util.Scanner;
//import PackageName.className
public class Scanner_Next {
    public static void main(String[]args){
        //declare Scanner ScannerName =  new Scanner (System.in);
        //we use scanner variable name to call the methods of the scanner
        Scanner scan = new Scanner(System.in);
        /*
        String str = scan.next();//next() only takes the first word
        System.out.println(str);
        */

        String fullAddress =" ";

        System.out.println("Enter the number of building: ");
        short numberBuilding = scan.nextShort();
        fullAddress+=numberBuilding+" ";

        System.out.println("Enter the street name: ");
        String streetName = scan.next();
        fullAddress+=streetName+" ";

        System.out.println("Enter the road type: ");
        String roadType =scan.next();
        fullAddress+=roadType+", ";

        System.out.println("Enter the city, state and zip code: ");
        String city = scan.next();
        fullAddress+=city+" ";

        String state = scan.next();
        fullAddress+=state+", ";

        int zipCode = scan.nextInt();
        fullAddress+=zipCode;

        System.out.println("Your full address is: "+fullAddress);



    }
}
