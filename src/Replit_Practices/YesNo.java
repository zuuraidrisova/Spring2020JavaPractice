package Replit_Practices;

import java.util.Scanner;

public class YesNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
           System.out.println("please enter Yes or No: ");
           String answer = scan.next();

           boolean valid = answer.equalsIgnoreCase("Yes")
                   || answer.equalsIgnoreCase("No");

           while(! valid){
               System.out.println("Please re-enter Yes or No?");
               answer =scan.next();

               if(answer.equalsIgnoreCase("Yes") ||
               answer.equalsIgnoreCase("No")){
                   break;
               }
           }

           if(answer.equalsIgnoreCase("Yes")){
               System.out.println(answer+" entered");
           }else{
               System.out.println(answer+" entered");
           }


    }
}
