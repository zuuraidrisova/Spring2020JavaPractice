package day16_ForLoopContinueBreak;
import java.util.Scanner;
public class SumNumbersForLoopScanner {
    /*
    write a program that can calculate the sum of all
     numbers between 1 to any given number
		ex:
			input: 100
			output: 5050
			input: 50
			output: 1275
			input : 200
			output : 20100
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scan.nextInt();//10

        int sum = 0;

        for(int i = 1; i<=num; i+=1){ // imagine we give 6 1 + 2 + 3 +  4 +  5 + 6 = 21
            sum += i; //sum = sum+i ==>1

        }
        System.out.println(sum);

    }
}
