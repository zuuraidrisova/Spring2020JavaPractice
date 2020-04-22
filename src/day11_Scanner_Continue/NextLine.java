package day11_Scanner_Continue;
import java.util.Scanner;
public class NextLine {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();//accepts the Enter
        //other methods don't accept the Enter
        System.out.println("Your full name is "+fullName);

        System.out.println("Enter your sentence: ");
        String s = scan.nextLine();

        System.out.println("You entered: "+s);


    }
}
