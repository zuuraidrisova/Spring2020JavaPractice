package day22_ArraysLoopsRecap;

import java.util.Arrays;
import java.util.Scanner;

public class JavaPython2 {
    public static void main(String[] args) {
          /*
        write a program that can return the number of appearances of "java" and "python"
         anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST
                use arrays and for each loop)
         */

          Scanner scan = new Scanner(System.in);

        System.out.println("Enter your sentence");
        String sentence = scan.nextLine();

        sentence = sentence.toLowerCase();//to ignore case sensitivity

        String [] str = sentence.split(" ");//splitting sentence into words and store in array of strings

        System.out.println(Arrays.toString(str));

        int countJava = 0;
        int countPython = 0;

        for(String each : str){

            if(each.contains("java")){
                countJava++;
            }
            if(each.contains("python")){
                countPython++;
            }
        }

        System.out.println(countJava);
        System.out.println(countPython);
    }
}
