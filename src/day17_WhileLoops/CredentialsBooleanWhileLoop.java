package day17_WhileLoops;

import java.util.Scanner;

public class CredentialsBooleanWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your username: ");
        String username = input.next();

        System.out.println("Please enter your password: ");
        String password = input.next();

        boolean valid = username.equals("zidrisova") && password.equals("Chicago2017");
                            //validating the first username and password

        int count = 1;

        while( !valid ){// !true

            System.out.println("Please re-enter your credentials! ");

            System.out.println("Please enter your username: ");
            username = input.next();

            System.out.println("Please enter your password: ");
            password = input.next();


           valid = (username.equals("zidrisova") && password.equals("Chicago2017"));//reassigned
                //or we can create new variable or reassign back

            count++;

            if(count == 3 && ! valid ){//already have 3 attempts and u still have wrong credentials
                System.out.println("Your account is locked!");
                break;

            }//first if closing curly braces

        }//while loop closing curly braces

        if(valid){//credentials are correct

            System.out.println("Logged in successfully!");

        }//last if closing curly braces


    }
}
