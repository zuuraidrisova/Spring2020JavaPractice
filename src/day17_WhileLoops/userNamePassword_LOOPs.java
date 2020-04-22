package day17_WhileLoops;
import java.util.Scanner;
public class userNamePassword_LOOPs {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String username = input.next();
        System.out.println("Please enter your password: ");
        String password = input.next();

            while(!(username.equals("zidrisova") && password.equals("Chicago2017"))){
            System.out.println("Please re-enter your credentials! ");
            System.out.println("Please enter your username: ");
            username = input.next();

            System.out.println("Please enter your password: ");
            password = input.next();
        }

        System.out.println("Logged in successfully!");
    }
}
