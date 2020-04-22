package WarmUp_Practices;
import java.util.Scanner;
public class MaxNumber_For_If {
    public static void main(String[] args) {
        /*
        write a program that can ask the user "enter a number"
         five times and return the maximum number
         */
        Scanner scan = new Scanner(System.in);
        int maxNumber =0;
        for(int number= 1; number<=5;number++){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if(maxNumber<num){
                maxNumber=num;
            }
        }

        System.out.println("Maximum number: "+maxNumber);

    }
}
