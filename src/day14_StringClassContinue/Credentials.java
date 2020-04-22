package day14_StringClassContinue;
import java.util.Scanner;
public class Credentials {
    public static void main(String []args){
        String validUsername ="cybertek";
        String validPassword ="cybertekschool";

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String username = scan.next();

        System.out.println("Please enter your password: ");
        String password = scan.next();

        boolean validCredentials = username.equals(validUsername) && password.equals(validPassword);

        if(validCredentials){
            System.out.println("Log in successfully");
        }else{
            System.out.println("Invalid Credentials");
        }

        //ternary
        String result  = (validCredentials)?"Log in successfully" : "Invalid Credentials";
        System.out.println(result);

    }
}
