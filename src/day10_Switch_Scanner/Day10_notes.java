package day10_Switch_Scanner;

public class Day10_notes {
    /*
            03/24/2020
        Topics: Switch statement
        Local variables
        Scanner Intro
        package name: day10_Switch_Scanner
        Warm up task:
        1. Wash your hand
        2. write a program that can display the days based on the numbers 1 ~
        7
        MUST USE NESTED IF
        precondition: valid number for the day
        3. write a java program that can convert numbers between 0 ~ 9 to
        words, if the number is greater than 9 or less than zero, out put
        should be "Invalid".
        DO NOT USE IF STATEMENTS
        4. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
        28 days: 2
        30 days: 4,6, 9, 11
        31 days: 1,3,5,7,8,10,12
        MUST USE NESTED IF
        Switch statement:
        syntax:
        switch(expression){
        case  caseValue1:
        statement;
        break;
        case  caseValue2:
        statement;
        break;
        case  caseValue3:
        statement;
        break;
        default:
        statement;
        break;
        }
        switch statement' expression cannot be boolean
        caseValues MUST be matching with the switch statement's
        expressions
        caseValue MUST be unique
        default: gets executed if none of case are matching
        break statement: used for exiting the switch statement' block
        if we do not give break statement, then the next available code
        fragments in switch will be executed
        switch does not accept: long, float, double, boolean
        Local variable: variables that are declared within a block
        cannot be used outside its the block
        MUST be initialized before we use them
        Scanner class: has the methods to help us to get the user input
        presented in "java.util" package
        in order to use the scanner first we will have to import it:
        syntax:   import pckageName.className;
        import java.util.Scanner;
        import statement MUST be places between class name and package
        name:
        package A;
        import java.util.Scanner;
        public classB{
        }
        declare scanner:
        Scanner   variableName  =  new  Scanner(System.in);
        variableName: will be reference to scanner object
        though variableName we can call the methods of scanner
        methods of Scanner:
        nextByte(): allows user to enter byte value, takes it as byte
        primitive
        nextShort(): allows user to enter short number, takes it as short
        primtive
        nextInt(): allows user to enter int number, takes it as int primtive
        task:
        write a program that asks user to enter num1 and num2, adn then prints
        the sum
        write a program for the rate calculater: rateCalculator
        1. asks the user to enter salary (as integer)
        2. asks the user how many hours does she/he works
        in a week
        3. print the hourly rate of the employee
        assume that one year has 52 weeks
        write a program that asks user to enter three numbers, print out the
        maximum and minimum number
        number_scanner
        tomorrow' office hour: 2pm ~5pm
        review topics: explicit casting
        `              If statements
        Ternary
     */
}
