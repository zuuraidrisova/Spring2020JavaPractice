package Replit_Practices;
import java.util.Scanner;
public class GiftCard_Practice {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an item: ");
        String item = scan.nextLine();
        System.out.println("Enter item price: ");
        int itemPrice =scan.nextInt();
        int giftCard = 100;
        int pillow = giftCard-itemPrice;
        int blanket = giftCard-itemPrice;
        int socks = giftCard-itemPrice;
        int hat = giftCard-itemPrice;
        int pants = giftCard-itemPrice;
        int headphones= giftCard=itemPrice;
        int USBcable = giftCard-itemPrice;
        int charger = giftCard-itemPrice;
        int laptop = giftCard-itemPrice;
        int smartphone = giftCard-itemPrice;

        if(item.equals("Pillow")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+pillow+" $");
        }else if(item.equals("Blanket")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+blanket+" $");
        }else if(item.equals("Socks")){
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is: "+socks+" $");
        }else if(item.equals("Hat")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+hat+" $");
        }else if(item.equals("Pants")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+pants+" $");
        }else if(item.equals("Headphones")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+headphones+" $");
        }else if(item.equals("USB Cable")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+USBcable+" $");
        }else if(item.equals("Charger")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+charger+" $");
        }else if(item.equals("Laptop")){
            System.out.println("Sorry, not enough funds in your gift card!");
        }else if(item.equals("Smartphone")){
            System.out.println("Sorry not enough funds in your gift card!");
        }else{
            System.out.println("Invalid item!");
        }



    }

}
