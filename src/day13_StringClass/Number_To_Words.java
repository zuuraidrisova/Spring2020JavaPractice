package day13_StringClass;
import java.util.Scanner;
public class Number_To_Words {
    public static void main(String []args){
        /*
         write a java program that can convert any given numbers between 0 ~ 9 to words,
          if the number is greater than 9 or less than zero, out put should be "Invalid".
			MUST use Scanner and switch statement
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 0~9: ");
        int number = scan.nextByte();
        String words =" ";
        switch(number){
            case 0:
                words = "zero";
                break;
            case 1:
                words = "one";
                break;
            case 2:
                words ="two";
                break;
            case 3:
                words ="three";
                break;
            case 4:
                words ="four";
                break;
            case 5:
                words ="five";
                break;
            case 6:
                words ="six";
                break;
            case 7:
                words ="seven";
                break;
            case 8:
                words ="eight";
                break;
            case 9:
                words ="nine";
                break;
            default:
                words = "invalid";
                break;
        }
        System.out.println(words);


        String result = (number == 0 )? "zero": (number==1)? "one": (number ==2)? "two"
                :(number ==3) ? "three" : (number ==4) ? "four" : (number==5) ? "five"
                :(number==6) ? "six" : (number==7) ? "seven" : (number==8)? "eight"
                :(number==9)? "nine" : "invalid";
        System.out.println(result);


    }

}
