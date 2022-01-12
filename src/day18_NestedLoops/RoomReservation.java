package day18_NestedLoops;

import java.util.Scanner;
public class RoomReservation {

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

        int price =0;

        while(true){

            System.out.println("WELCOME TO HILTON INTERNATIONAL!!!");

           System.out.println("Do you want to reserve a room with King bed, Queen bed OR Single bed? :");

            String answer = scan.nextLine();

            while( ! (answer.equalsIgnoreCase("King Bed") ||
                    answer.equalsIgnoreCase("Queen Bed") ||
                    answer.equalsIgnoreCase("Single Bed"))){
                System.out.println("Invalid entry!Please re-enter? ");
                answer = scan.nextLine();

            }

            if(answer.equalsIgnoreCase("King Bed")){
                price+=120;

            }else if(answer.equalsIgnoreCase("Queen Bed")){
                price+=100;

            }else if(answer.equalsIgnoreCase("Single Bed")){
                price+=80;

            }

            System.out.println("Your room total is: "+price+" $");

            System.out.println("Do you want to reserve another room?");
            String reply = scan.next();

            while(!(reply.equalsIgnoreCase("Yes")

                    || reply.equalsIgnoreCase("No"))){

                System.out.println("Invalid reply!");

                System.out.println("Do you want to reserve another room?");

                reply = scan.next();
            }

            if(reply.equalsIgnoreCase("Yes")){

                answer = scan.nextLine();

            }

            if(reply.equalsIgnoreCase("NO")){

                System.out.println("Thank you for staying with us!");

                System.out.println("Your total price is: "+price+" $");

                break;
            }


        }



    }
}
