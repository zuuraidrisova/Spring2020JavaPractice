package reviewPracticing;

import java.util.Scanner;

public class Scanner_Tasks {

    public static void main(String[] args) {

        /*
         write a program that asks user to enter num1 and num2, adn then prints
        the sum
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 2 numbers:  ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("sum = " + sum);


        /*
        write a program for the rate calculater: rateCalculator
        1. asks the user to enter salary (as integer)
        2. asks the user how many hours does she/he works
        in a week
        3. print the hourly rate of the employee
        assume that one year has 52 weeks
         */

        scanner = new Scanner(System.in);

        System.out.println("Please enter your salary below: ");

        double salary = scanner.nextDouble();

        System.out.println("How many hours do you work weekly: ");

        int hours = scanner.nextByte();

        double hourlyRate = salary / (hours * 52);

        System.out.println("hourlyRate = " + hourlyRate);

        /*
       write a program that asks user to enter three numbers, print out the
        maximum and minimum number
         */

        scanner = new Scanner(System.in);

        System.out.println("Please enter three numbers: ");

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if(n1 > n2 && n1 > n3){

            System.out.println(n1 +" is max number");

        }else if(n2 > n1 && n2 > n3){

            System.out.println(n2 +" is max number");

        }else{

            System.out.println(n3+" is max number");
        }

        /*
        2. Write a program that calculates the sum of maximum of 5 positive
        numbers entered by the user.
        If the user enters negative number or zero, it is skipped from calculation.
         */

        scanner = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        int a = scanner.nextInt();

        System.out.println("Please enter your second number: ");
        int b = scanner.nextInt();

        System.out.println("Please enter your third number: ");
        int c = scanner.nextInt();

        System.out.println("Please enter your fourth number: ");
        int d = scanner.nextInt();

        System.out.println("Please enter your fifth number: ");
        int e = scanner.nextInt();

        int sumOfAllPositive = 0;

        if(a > 0){

            sumOfAllPositive += a;

        }

        if(b > 0){

            sumOfAllPositive +=b;
        }

        if(c > 0){

            sumOfAllPositive += c;

        }

        if(d > 0){

            sumOfAllPositive += d;

        }

        if(e > 0){

            sumOfAllPositive+=  e;
        }

        System.out.println("sumOfAllPositive = " + sumOfAllPositive);

        /*
                2. write a program that can calculate the salary after tax
        needed information:
        employee' salary
        state tax
        federal tax
                 */

        scanner = new Scanner(System.in);

        System.out.println("Enter ur salary: ");
        double salaryEmployee = scanner.nextDouble();

        System.out.println("Enter state tax: ");
        double stateTax = scanner.nextDouble();

        System.out.println("Enter federal tax: ");
        double federalTax = scanner.nextDouble();

        double totalTax = (stateTax * salaryEmployee) + (federalTax*salaryEmployee);
        double grossIncome = salaryEmployee - totalTax;

        System.out.println(grossIncome);


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

        scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");

        String name = scanner.next();

        System.out.println("Enter your last name: ");

        String lastName = scanner.next();

        System.out.println("Are you employeed? ");

        boolean employeed = scanner.nextBoolean();

        double salary1 = 0;

        if(employeed){

            System.out.println("Enter your salary: ");
            salary1 = scanner.nextDouble();

            System.out.println(salary1);

        }else{


            salary1 = 0;
            System.out.println(salary1);
        }


        scanner.close();
    }
}
