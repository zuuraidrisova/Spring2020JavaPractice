package day26_MethodOverloading;

import java.text.DecimalFormat;

public class MethodOverloading3 {
/*
first method: can find the sum of two int numbers
second method: can find the sum of two double numbers
 */
    public static void main(String[] args) {

        DecimalFormat DF = new DecimalFormat("0.00");
       int sum =  sum(10,20);

        System.out.println(sum);


       double sum1 = sum(4.3 , 20.1);

        System.out.println(DF.format(sum1));//formatted it to decimal , rounded it to 0.00

        double sum2 = sum(10,15.5);//makes it decimal , double sum method will get executed

        System.out.println(sum2);

        double sum3 = sum(25l, 30l);// double sum method will get executed

        System.out.println(sum3);

       int sum4 = sum((int)40l, (int)50l);//explicit casting//both become int now not long

        System.out.println(sum4);

}

    public static int sum(int a, int b){

        return a + b;
    }
    public static double sum(double a, double b){

        return a + b;
    }

}
