package day18_NestedLoops;
import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
/*
write a program that can return the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
 */
//this works until 31, because int cannot store more than that number, it will exceed its range


        Scanner scan =new Scanner(System.in);

        System.out.println("Enter a number:");

        int num = scan.nextInt();//5

        int result = 1;//

        while(num >= 1){//condition...as long as num is greater or equal to 1

            result *= num;//result = result*num;

            num--;//it should decrease num value so loop exits at some point

        }

        System.out.println(result);



    }
}
