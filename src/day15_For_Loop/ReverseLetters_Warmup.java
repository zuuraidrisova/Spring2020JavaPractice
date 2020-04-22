package day15_For_Loop;
import java.util.Scanner;
public class ReverseLetters_Warmup {
    public static void main(String[] args) {
        /*
         write a program that can reverse the following string:
				String str = "Java";
				output: avaJ
			please provide two solutions:
						first solution, you MUST use substring method
						second solution, you MUST use charAt method
         */
        String str ="Java";
        System.out.println(str);
        str  = str.substring(3)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);
        System.out.println(str);

        String str1 = "Java";
        System.out.println(str1);

        str1 = ""+str1.charAt(3)+str1.charAt(2)+str1.charAt(1)+str1.charAt(0);
        System.out.println(str1);




    }
}
