package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class FindMaxMin {

    public static void main(String[] args) {

    /*
 primitive / Object

    byte ==> Byte ==>  parseByte()
    short ==> Short ==> parseShort()
    int == > Integer ==> parseInt()
    long ==> Long ==> parseLong()
    float ==> Float ==> parseFloat()
    double ==> Double ==> parseDouble()
    char ==> Character ==> charAt()
    boolean ==> Boolean ==>parseBoolean()

     */

    String str = "abc";

    char c = str.charAt(0);

    System.out.println(c);

    String str2 = "123";

    int num = Integer.parseInt(str2);

        System.out.println(num);

        int [] arr = {1,90,88,65,0,-1};

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > max){

                max = arr[i];
            }
        }

        System.out.println(max);


        String[] arr2 = {"1","2.5", "3", "3.5", "4.5"};

        double max1 = Double.MIN_VALUE;

        for(int i = 0; i < arr2.length; i++){

            double num1 = Double.parseDouble(arr2[i]);

            if(num1 > max1){

                max1 = num1;
            }
        }

        System.out.println(max1);

        double max3 = Double.MIN_VALUE;

        for(String each : arr2){

            double num2 = Double.parseDouble(each);

            if(num2 > max3){

                max3 = num2;

            }
        }

        System.out.println(max3);

        double min = Double.MAX_VALUE;

        for(int i = 0; i < arr2.length; i++){

           double num4 =  Double.parseDouble(arr2[i]);

           if(num4 < min){

               min = num4;
           }

        }

        System.out.println(min);

        double min1 = Double.MAX_VALUE;

        for(String each : arr2){

            double num5 = Double.parseDouble(each);

            if(num5 < min1){

                min1 = num5;
            }
        }

        System.out.println(min1);

    }
}
