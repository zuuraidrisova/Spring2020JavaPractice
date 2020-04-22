package Replit_Practices;
import java.util.Scanner;
public class EqualsJavaPython {
    public static void main(String[] args) {
        /*
        Given a string, print out true if the number
        of appearances of "java" anywhere in the string is equal to the number
        of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
         */

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int count = 0;
        int count1 =0;
        for(int i = 0; i  <= sentence.length()-1; i++){

            if( sentence.contains("java")){
                count++;
                sentence = sentence.replaceFirst("java","");

            }
            if(sentence.contains("python")){
                count1++;
                sentence = sentence.replaceFirst("python","");

            }


        }

        if(count == count1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
