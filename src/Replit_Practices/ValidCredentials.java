package Replit_Practices;

import java.util.Scanner;

public class ValidCredentials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username =  scan.next();
        System.out.println("Enter your password: ");
        String password = scan.next();

        boolean valid = username.equalsIgnoreCase("zidrisova") &&
                password.equalsIgnoreCase("chicago2017");

        int count = 1;

        while(! valid){

            System.out.println("Please re-enter your credentials");

            System.out.println("Please enter your username: ");
            username = scan.next();

            System.out.println("Please enter your password: ");
            password = scan.next();

            valid = username.equalsIgnoreCase("zidrisova")
                    && password.equalsIgnoreCase("Chicago2017");

            count++;

            if(count == 3  && ( !valid)){
                System.out.println("Your account is locked!");
                break;
            }

            if(valid){

                System.out.println("Logged in Successfully");
            }

        }







    }
}
