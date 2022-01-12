package day12_Scanner_JavaRecap;
import java.util.Scanner;
public class Salary_Scanner {
    public static void main(String []args){
        /*
        ask the user enter salary
        ask the user enter full name
        ask the user to enter company name
        ask the user to enter SSN
        ask the user to enter JobTitle
     */
        Scanner scan =new Scanner(System.in);
        System.out.println("Please, enter salary: ");
        double salary = scan.nextDouble();

        scan.nextLine();

        System.out.println("Please, enter your full name: ");
        String name = scan.nextLine();

        System.out.println("Enter you company: ");
        String company = scan.nextLine();

        System.out.println("Enter your SSN: ");
        long SSN = scan.nextLong();

        scan.nextLine();

        System.out.println("Enter your job title: ");
        String jobTitle = scan.nextLine();

        System.out.println("Full name is "+name);
        System.out.println("Job title is "+jobTitle);
        System.out.println("Company name is "+company);
        System.out.println("SSN is "+SSN);
        System.out.println("Salary is $ "+salary);




    }
}
