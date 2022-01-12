package day26_MethodOverloading;

import java.util.Arrays;

public class methodOverloading2 {

    public static void main(String[] args) {

        sumOfTwo(10,20);

        System.out.println("===================================");

        int total =  sum(10,20,30);
        System.out.println(total);


        int [] arr = {3,2,1};
        char [] arr1 = {'z','s','a'};
        double [] arr2 = {7.3, 1.2, 20.6};

        Arrays.sort(arr);//same method to sort int arr, overloaded
        Arrays.sort(arr1);//same method to sort char arr, overloaded
        Arrays.sort(arr2);//same method sort double arr, overloaded

        System.out.println(Arrays.toString(arr));

    }

    public static void sumOfTwo(int a, int b){

        System.out.println(a + b);
    }

    public static void sumOfThree(int a, int b, int c){

        System.out.println(a +b + c);
    }

    public static void sumOfFour(int a, int b, int c, int d){

        System.out.println(a + b + c + d);
    }


    //METHOD OVERLOADING  is readable, reusable and easy to remember, very flexible when we run

    public static int sum(int a, int b){

        return a + b;
    }
    public static int sum(int a, int b,int c){

        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d){

        return a + b + c + d;
    }


}
