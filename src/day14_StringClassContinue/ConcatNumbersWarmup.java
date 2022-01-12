package day14_StringClassContinue;
import java.util.Scanner;
/*
. Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
 */
public class ConcatNumbersWarmup {

    public static void main(String []args){

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter first word: ");
             String num1 = scan.next();
        System.out.println("Enter second word: ");
             String num2 = scan.next();

        String output = num1.concat(num2).concat(num2).concat(num1);
        //for spaces between words concat(" "+num2)

        System.out.println(output);
    }
}
