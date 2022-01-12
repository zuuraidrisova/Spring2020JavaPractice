package reviewPracticing;

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

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int number = scanner.nextInt();
        int result = 1;

        for (int i = number; i >= 1; i--){

            result *= i;
        }

        System.out.println(result);

        scanner.close();

        //    learn frequency of B in given String str = " AAABBBBCCCDDDEEE";

        String str = "AAABBBBCCCDDDEEE";

        int count = 0;

        for (int i = 0; i <= str.length()-1; i++){

            if (str.contains("B")){

                count++;

                str = str.replaceFirst("B", "");
            }
        }

        System.out.println("count = " + count);


    }
}
