package day15_For_Loop;
import java.util.Scanner;
public class login_Practice {
    /*
    	2. Given :
			username: cybertek.batch17@gmail.com
			password: JavaBeauties
			write a program for the login functionality of the email.
				- username can be either in uppercase or lowercase
				- Password MUST be as it's
				- if the user name does not end with "@gmail.com":
						print "it's not a valid email"
				- if the username ends with "@gmail.com" but username or password does not match:
						print "invalid username or password"
     */
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String username = scan.next();
        System.out.println("Please enter your password: ");
        String password = scan.next();

        if(username.endsWith("@gmail.com")){
            if(username.equalsIgnoreCase("cybertek.batch17@gmail.com")
            || password.equals("JavaBeauties")){
                System.out.println("Loged in successfully!");
            }else{
                System.out.println("Incorrect username or password!");
            }
        }else{
            System.out.println("It is not a valid email!");
        }



    }
}
