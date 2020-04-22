package WarmUp_Practices;
import java.util.Scanner;
public class replits {

        public static void main(String[] args) {
            //ENTER CODE HERE
            Scanner input = new Scanner (System.in);
            System.out.println("Enter price in cents:");
            int itemPrice = input.nextInt();
            int change = input.nextInt();
            int quarters= itemPrice - change;
            int dimes = itemPrice - change;
            int nickels = itemPrice - change;
            System.out.println("Your change is "+
                    quarters+" quareters, "+dimes+" dimes, and "
                    + nickels+" nickels.");
            if(itemPrice<25 && itemPrice>100){
                System.out.println("Invalid price!");
            }
            if(itemPrice%5==0){
                System.out.println("Invalid price!");
            }


        }

}
