package Replit_Practices;

import java.util.Scanner;

public class PartyLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        /*
        Imagine you have a party and need to form the list of the guests.
         (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

Example of the program:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda
         */
        String list = "";

        while(true){
            System.out.println("Please enter guest name:");
            String guest =  scan.next();
            list+= guest+", ";

            System.out.println("Do you want to enter new guest name:");
            String answer = scan.next();



            if(answer.equalsIgnoreCase("no")){

                list=list.substring(0,list.length()-2);
                System.out.println("Guest's list: "+list);
                break;
            }

        }






    }
}
