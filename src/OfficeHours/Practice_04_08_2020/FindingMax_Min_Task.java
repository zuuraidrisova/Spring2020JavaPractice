package OfficeHours.Practice_04_08_2020;
import java.util.Scanner;
public class FindingMax_Min_Task {
    public static void main(String[] args) {
        /*
        create a program that can ask user to enter a number three times
         */
        Scanner scan =new Scanner(System.in);

        //max number

        int max = -2147483648;//temporary value
        int i =1;//where loop starts
        while(i <= 3){//condition on how long it will start

            System.out.println("Enter a number: ");//asks user to enter a number
            int num1 =scan.nextInt();//number user entered must be integer
            if(num1 > max){//condition to find max number
                max =num1;//if num1 greater assign it to max value
            }
            i++;//makes condition false
        }
        System.out.println("max number is: " +max);

        System.out.println("====================");


        //min number and max number



        int Max = -2147483648;//temporary value
        int Min = 214748364;//temporary value

        int j =1;//where loop starts
        while(j <= 3){//condition on how long it will start

            System.out.println("Enter a number: ");//asks user to enter a number
            int num1 =scan.nextInt();//number user entered must be integer
            if(num1 > Max){//condition to find max number
                Max =num1;//if num1 greater assign it to max value
            }
            if(num1<Min){//condition to find min number
                Min = num1;//if num1 is less than min assign it to min
            }
            j++;//makes condition false
        }
        System.out.println("maximum number is: "+Max);
        System.out.println("minimum number is: "+Min);

    }
}
