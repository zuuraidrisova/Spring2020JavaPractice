package Replit_Practices;
import java.util.Scanner;
public class VideoGameCoupons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int numberOfCoupons = scan.nextInt();
        int candies = numberOfCoupons/10;
        int gumballs = (numberOfCoupons%10)/3;

        if(numberOfCoupons>3){
            System.out.println("Number of Candies: "+candies);
            System.out.println("Number of Gumballs: "+gumballs);
        }else{
            System.out.println("Not enough coupons");
        }




    }
}
