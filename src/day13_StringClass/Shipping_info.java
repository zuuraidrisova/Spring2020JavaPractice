package day13_StringClass;
import java.util.Scanner;
public class Shipping_info {
    /*
     write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
     */
   public static void main(String []args){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter your building number: ");
       String Bnumber = scan.next();

       scan.nextLine();

       System.out.println("Enter your  street address: ");
       String street = scan.nextLine();

       System.out.println("Enter the city name: ");
       String city = scan.next();

       System.out.println("Enter the state: ");
       String state =scan.next();

       System.out.println("Enter the zipcode: ");
       String zipcode = scan.next();

       scan.nextLine();

       System.out.println("Enter your full name: ");
       String fullname = scan.nextLine();

       String result =( "Ship to:" + fullname+ "\n\t\t"+ Bnumber
               +" "+street+" "+"\n\t\t"+city+" "+state+" "+zipcode);

       System.out.println(result);

   }
}
