package Replit_Practices;
import java.util.Scanner;
public class OnlineBookMerchants {
        public static void main(String []args) {
            int freeBooks = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("Are you premium customer?");
            boolean isPremiumCustomer = scan.nextBoolean();

            if(isPremiumCustomer){
                System.out.println("Enter number of books you purchased: ");
                int nbooksPurchased = scan.nextInt();

                if(nbooksPurchased<5){
                    System.out.println("Sorry,Not enough books purchased");
                }else if(nbooksPurchased>=5 && nbooksPurchased<=7){
                    freeBooks+=1;
                }else if(nbooksPurchased>=8){
                    freeBooks+=2;
                }

            }
            if(! isPremiumCustomer) {
                System.out.println("Enter number of books you purchased: ");
                int nbooksPurchased = scan.nextInt();
                if (nbooksPurchased < 7) {
                    System.out.println("Sorry,Not enough books purchased");
                } else if (nbooksPurchased >= 7 && nbooksPurchased <= 11) {
                    freeBooks += 1;
                } else if (nbooksPurchased >= 12) {
                    freeBooks += 2;
                }
            }

            System.out.println("Free books you get: "+freeBooks);



        }//closing curly braces of main method

}//closing curly braces of class