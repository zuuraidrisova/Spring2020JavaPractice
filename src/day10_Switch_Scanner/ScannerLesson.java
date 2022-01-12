package day10_Switch_Scanner;

import java.util.Scanner;

//Scanner class provides method to get the user input

public class ScannerLesson {

    public static void main(String[] args){

        //declare Scanner: Scanner variableName = new Scanner(System.in);
        //variableName will be reference to scanner object.
        // through variableName  we can call  the method scanner

        Scanner User = new Scanner(System.in);

        /* Methods of Scanner:
        => nextByte(): returns input as a byte
        => nextShort(); allows user to enter short number and takes it as short primitive
         */

        System.out.println("Enter a byte number: ");

        byte num1 = User.nextByte();

        System.out.println("You have entered: "+num1);

        if(num1 % 2==0){

            System.out.println(num1+ " is even number");

        }else{

            System.out.println(num1+" is odd number");

        }




    }
}
