package InterviewQuestions;

import java.util.Scanner;

public class countJava {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int count = 0;

        for(int i = 0; i <= str.length() - 4; i++){

           String current = str.substring(i,i+4);

           if(current.equals("java")){

               count++;
           }

        }

        System.out.println(count);





    }
}
