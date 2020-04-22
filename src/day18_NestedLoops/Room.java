package day18_NestedLoops;
import java.util.Scanner;

public class Room {
    public static void main(String[] args) {
               /*
        write a program for the room reservation:
        king bed==?120$;
        queen bed ==> 100$;
        single bed ==> 80$;

        should ask which room do u want to reserve?

        if user provides invalid entry, please re-enter?!
        calculate the total price and display it

        do u want to reserve another room?
        if yes ==> repeat previous steps
        if no ==> your total price is +$$$

        if answer is either yes or no ==>please re-enter
         */

        Scanner scan = new Scanner(System.in);

        int price = 0;

        System.out.println("Welcome to Sheraton!");
        while(true){
            System.out.println("Which room would you like to reserve: " +
                    "with king bed, queen bed or single bed?");
            String answer = scan.nextLine();

            while(!(answer.equalsIgnoreCase("King bed")
                    || answer.equalsIgnoreCase("Queen bed") ||
            answer.equalsIgnoreCase("Single bed"))){
                System.out.println("Please re - enter your answer?!");
                answer = scan.nextLine();

            }

            if(answer.equalsIgnoreCase("King bed")){
                price += 120;
            }else if(answer.equalsIgnoreCase("Queen bed")){
                price += 100;
            }else if(answer.equalsIgnoreCase("Single bed")){
                price += 80;
            }

            System.out.println("Your price is: "+price+" $");

            System.out.println("Would you like to reserve another room?");
            String reply = scan.next();

            while( ! (reply.equalsIgnoreCase("Yes")
                    || reply.equalsIgnoreCase("No"))){

                System.out.println("Please answer with Yes or No?");
                System.out.println("Would you like ro reserve another room?");
                reply = scan.next();

            }
            if(reply.equalsIgnoreCase("Yes")){
                answer = scan.nextLine();
            }

            if(reply.equalsIgnoreCase("No")){
                System.out.println("Thank you for staying with us!");
                System.out.println("Your total is "+ price +" $");
                break;
            }



        }
















    }
}
