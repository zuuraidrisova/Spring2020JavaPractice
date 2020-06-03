package Replit_Practices;

public class divideWithoutDivision {
    /*
    Write a method that can divide two numbers without using division operator
     */
    public static void main(String[] args) {

        divide(2,2);
    }

    public static void divide(int num1, int num2){

        if(num2 == 0){

            System.out.println("Invalid Number");
        }

        System.out.print(num1+" divided by "+num2+" is: ");

        int count = 0;

        while(num1 >= num2){

            num1 -= num2;

            count++;
        }

        System.out.println(count+" and remainder is "+num1);


    }
}
