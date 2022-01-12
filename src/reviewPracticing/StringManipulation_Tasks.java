package reviewPracticing;

import java.util.Scanner;

public class StringManipulation_Tasks {

    public static void main(String[] args) {

        String s1 = "Java";

        System.out.println(s1.concat(" is a programming language"));

        System.out.println(s1);

        s1 = s1.concat(" is a programming language");

        System.out.println(s1);


        /*
     Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"
     */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String str1 = scan.next();

        System.out.println("Enter second word: ");
        String str2 = scan.next();

        System.out.println("Enter third word: ");
        String str3 = scan.next();

        int str1Length = str1.length();
        int str2Length = str2.length();
        int str3Length = str3.length();

        if(str1Length == str2Length && str2Length == str3Length){

            System.out.println("All words are same length");

        }else if(str1Length == str2Length && str1Length != str3Length){

            System.out.println("Not Same nor Different lengths");
        }else{

            System.out.println("All different length");
        }


        /*
. Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
 */

        scan = new Scanner(System.in);

        System.out.println("Enter two words below: ");

        String a = scan.next();
        String b = scan.next();

        String result = a.concat(b).concat(b).concat(a);

        System.out.println("result = " + result);

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

              scan = new Scanner(System.in);

        System.out.println("Enter your username: ");

        String username = scan.next();

        System.out.println("Enter your password: ");

        String password = scan.next();

        String validUsername = "cybertek";
        String validPassword = "cybertekschool";


        if( !(username.isEmpty() || password.isEmpty())){

            if (username.equalsIgnoreCase(validUsername)
                    && password.equalsIgnoreCase(validPassword)){

                System.out.println("Logged In");

            }else if(username.equalsIgnoreCase(validPassword) &&

                    (!password.equalsIgnoreCase(validPassword))){

                System.out.println("Invalid Password");

            }else if(password.equalsIgnoreCase(validPassword)
                    && (!(username.equalsIgnoreCase(validUsername)))){

                System.out.println("Invalid Username");

            }else{

                System.out.println("Invalid username and password");
            }


        }else{

            System.out.println("Please enter your credentials");
        }

        scan.close();


    }
}
