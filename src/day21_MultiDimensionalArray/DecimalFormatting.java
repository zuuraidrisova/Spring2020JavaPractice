package day21_MultiDimensionalArray;

import java.text.DecimalFormat;

public class DecimalFormatting {

    public static void main(String[] args) {

        DecimalFormat DF  = new DecimalFormat("0.00");//we can specify how many numbers we want to round it up to

        double a = 10.0/3.0;

        System.out.println(a);//3.333333

        System.out.println(DF.format(a));//now it is 3.33

        System.out.println(DF.format(2.345678433));



    }
}
