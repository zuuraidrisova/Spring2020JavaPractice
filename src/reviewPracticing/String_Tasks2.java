package reviewPracticing;

import java.util.Scanner;

public class String_Tasks2 {

    public static void main(String[] args) {

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

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your username: ");
        String username = scan.next();

        System.out.println("Please enter your password; ");
        String password = scan.next();

        String validUsername = "cybertek.batch17@gmail.com";
        String validPassword = "JavaBeauties";


        if(username.endsWith("@gmail.com")){

            if(username.equalsIgnoreCase(validUsername) && password.equals(validPassword)){

                System.out.println("Logged In");

            }else if(username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)){

                System.out.println("Invalid Password");

            }else if(!username.equalsIgnoreCase(validUsername) && password.equals(validPassword)){

                System.out.println("Invalid Username");

            }else{

                System.out.println("Invalid username and password");
            }
        }else{

            System.out.println("It is not a valid email");
        }


        scan.close();


        /*
         write a program that can reverse the following string:
				String str = "Java";
				output: avaJ
			please provide two solutions:
						first solution, you MUST use substring method
						second solution, you MUST use charAt method
         */

        String str = "Java";
        String output = "";

        for (int i = str.length()-1; i >= 0; i--){

            output += str.charAt(i)+"";
        }

        System.out.println(output);
    }
}
