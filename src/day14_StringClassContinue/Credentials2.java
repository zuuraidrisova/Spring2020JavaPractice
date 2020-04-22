package day14_StringClassContinue;
import java.util.Scanner;
public class Credentials2 {
    public static void main(String []args){
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
        System.out.println("Enter your username: ");
        String username = scan.nextLine();

        System.out.println("Enter your password: ");
        String password = scan.nextLine();

        boolean logedIN = username.equals("cybertek") && password.equals("cybertekschool");
        //both username and password are valid
        boolean invalidUsername = !username.equals("cybertek") && password.equals("cybertekschool");
        //username is incorrect and password is correct
        boolean invalidPassword = username.equals("cybertek") && !password.equals("cybertekschool");
        //password is invalid and username is correct

        if(!username.isEmpty() && !password.isEmpty()){//username and password are not empty
            if(logedIN){
                System.out.println("Logged In");
            }else if(invalidUsername){
                System.out.println("Password is correct, username is incorrect");
            }else if(invalidPassword){
                System.out.println("Username is correct, password is incorrect");
            }else{
                System.out.println("Invalid username and password");
            }

        }else{
            System.out.println("Please enter your credentials!");
        }







    }
}
