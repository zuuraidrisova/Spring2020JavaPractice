package day12_Scanner_JavaRecap;
import java.util.Scanner;
public class Scanner_NextLine {

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");

        int num = scan.nextInt();//takes num and returns it

        System.out.println(num);

        scan.nextLine();//takes Enter keyword, get rid of Enter

        System.out.println("Enter your name: ");

        String name =scan.nextLine();//now it takes name

        System.out.println(name);

    }
}
