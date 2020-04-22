package day18_NestedLoops;
import java.util.Scanner;
public class NestedLoop3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        while(true) {
            System.out.println("Enter two numbers: ");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            System.out.println("Addition of two numbers: " + (num1 + num2));
            System.out.println("Would you like to continue?");
            String answer = scan.next();


            System.out.println("Addition of two numbers: " + (num1 + num2));
            while(!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No"))){
                System.out.println("Invalid entry!please re-enter yes or no!?");
                answer=scan.next();//to stop the infinite loop
            }
            if(answer.equalsIgnoreCase("Yes")){

            }

            if(answer.equalsIgnoreCase("No")){
                System.out.println("Thank you for using calculator");
                break;

            }
        }
















    }
}
