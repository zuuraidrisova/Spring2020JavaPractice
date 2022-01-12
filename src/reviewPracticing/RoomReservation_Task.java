package reviewPracticing;

import java.util.Scanner;

public class RoomReservation_Task {

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

        int cost = 0;

        while (true) {

            System.out.println("Which room do you want to reserve?");

            String room = scan.next();

            while (!(room.equalsIgnoreCase("king")

                    || room.equalsIgnoreCase("queen")

                    ||room.equalsIgnoreCase("single"))){


                System.out.println("Please re-enter your choice? ");

                room = scan.next();

            }

            if (room.equalsIgnoreCase("king")){

                cost += 120;

            }else if(room.equalsIgnoreCase("queen")){

                cost += 100;

            }else if(room.equalsIgnoreCase("single")){

                cost += 80;

            }

            System.out.println("Your cost is: "+cost+"$");
            System.out.println("Do you want to reserve another room?");
            String answer = scan.next();

            while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){

                System.out.println("Please enter yes or no? ");
                answer = scan.next();

            }

            if (answer.equalsIgnoreCase("yes")){

                System.out.println("Do you want king, queen or single?");

                room = scan.next();

            }

            if (answer.equalsIgnoreCase("no")){

                System.out.println("Your bill is " + cost + "$");
                System.out.println("Thank you for staying with us!");
                break;
            }



        }



    }
}
