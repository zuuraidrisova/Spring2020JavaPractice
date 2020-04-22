package day11_Scanner_Continue;
import java.util.Scanner;
public class Warm_up_SalaryCalculator {
    public static void main(String[]args){
        /*
          2. write a program that can calculate the salary after tax
                needed information:
                                employee' salary
                                state tax
                                federal tax
         */
       Scanner input  = new Scanner (System.in);
        System.out.println("Enter your salary: ");
       int salary = input.nextInt();
        System.out.println("Enter state tax: ");
       double stateTax = input.nextDouble();
        System.out.println("Enter federal tax: ");
       double federalTax = input.nextDouble();
        double totalTax = (stateTax * salary) + (federalTax*salary);
        double grossIncome = salary - totalTax;
        System.out.println("Your earnings after tax is: "+ grossIncome+" $");
        System.out.println("Total tax paid is: "+totalTax);




    }
}
