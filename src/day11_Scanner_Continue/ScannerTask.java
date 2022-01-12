package day11_Scanner_Continue;
import java.util.Scanner;
/*
Task: Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employeeed status:
        salary:
 */
public class ScannerTask {

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.next();

        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        String fullName = name + " "+lastName;


        System.out.println("Are you employed? ");
        boolean employed = scan.nextBoolean();

        double salary = 0;
        if(employed == true){
            System.out.println("Enter your salary $: ");
            salary = scan.nextDouble();
        }

        System.out.println("Fullname is: "+ fullName);
        System.out.println("Employed: "+employed);
        System.out.println("Your salary is: "+salary);

    }
}
