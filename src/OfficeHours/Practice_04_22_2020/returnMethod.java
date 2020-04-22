package OfficeHours.Practice_04_22_2020;

public class returnMethod {

    public static void main(String[] args) {

       // int a =  sum(1,10); ==>  compiler error bcs of void return type

        sum(12,20);//cannot assign to a new variable

        System.out.println("=======================");

        int total =  sum2(12,20); //can be assigned to a new variable

        System.out.println(total);

        System.out.println("=======================");

        String  str2 = "Anna";

        String result2 = reverse(str2);

        if(str2.equalsIgnoreCase(result2)){

            System.out.println("It is a palindrome");
        }else{

            System.out.println("It is not a palindrome");
        }

        System.out.println(result2);

        System.out.println("=======================");


        String str = "Cybertek";

        String result = "";

        for(int i = str.length()-1; i >= 0; i--){


            result += str.charAt(i);

        }

        System.out.println(result);

        System.out.println("=======================");

    }
    public static void sum(int a, int b){

        System.out.println(a + b);
    }

    public static int sum2(int a, int b){


        return a + b;
    }

    public static String reverse(String word){

        String result = "";

        for(int i = word.length()-1; i >= 0; i--){

            result += word.charAt(i);
        }

        return result;
    }
}
