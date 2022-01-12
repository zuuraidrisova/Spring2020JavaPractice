package day14_StringClassContinue;

import java.util.Scanner;

public class CredentialsPractice {

    public static void main(String[] args) {
               /*
        valid credentials are :
        username:cybertek
        password:cybertekschool

        precondition: username and password cannot be empty, if they are empty
                      output should be: Please enter your credentials

        if user entered both valid username and password ==>log in
        if valid password, invalid username ==> username is incorrect
        if valid username, invalid password ==> password is incorrect
        if both password and username invalid ==> invalid username and password
         */
               Scanner scan = new Scanner(System.in);
               System.out.println("Please enter your username: ");
               String userName = scan.next();
               System.out.println("Please enter your password: ");
               String password = scan.next();

            if(!(userName.isEmpty() && password.isEmpty())){

                if(userName.equals("cybertek") && password.equals("cybertek2020")){
                    System.out.println("You are logged in successfully!");

                }else if( !userName.equals("cybertek") && password.equals("cybertek2020")){
                    System.out.println("Username is incorrect!");

                }else if((userName.equals("cybertek"))&& (!password.equals("cybertek2020"))){
                    System.out.println("Password is incorrect!");

                }else{
                    System.out.println("Invalid username and password!");
                }
            }else{
                System.out.println("Please enter your credentials!");
            }


    }
}
