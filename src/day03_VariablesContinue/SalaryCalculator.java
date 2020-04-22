package day03_VariablesContinue;

public class SalaryCalculator {

    public static void main (String []args){
/*
Task 08:
		Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
			ex:
				if:
					rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;
				then output will be:
					your salary is: 105600 USD
					your total tax is: 27456 USD
					your income after tax is: 78144 USD
				if:
					rate = 45.25;
					stateTax =0.045;
					federalTax = 0.25;
					weeklyHours = 45;
				then output will be:
					your salary is: 91260 USD
					your total tax is: 26921.7
					your income after tax: 64338.3 USD
 */

        double HourlyRate = 65;
        double stateTax = 0.04;
        double federalTax = 0.22;
        int weeklyHours = 45;
        int totalWeeks = 48;

        // salary = hourlyRate * weeklyHours * 52

        double yearlySalary = HourlyRate * weeklyHours * totalWeeks;
        //gross income before tax
        double totalStateTax = yearlySalary * stateTax;
        // totalStateTax = yearlySalary * stateTax
        double totalFederalTax = yearlySalary * federalTax;
        // totalfederalTax =yearlySalary * federalTax
        double salaryAfterTax = yearlySalary - (totalFederalTax + totalStateTax);

        System.out.println("Yout salary after tax is: " + salaryAfterTax + " $");
        System.out.println("Your gross income salary is: " + yearlySalary + " $");
        System.out.println("Your federal tax is: " + totalFederalTax + " $");
        System.out.println("Your state tax is: " + totalStateTax + " $");
        System.out.println("Your total tax is: " + (totalFederalTax+totalStateTax)+ " $");









    }
}
