package day52_Collections;

import java.util.ArrayList;

public class NullKeyword {

    static String str1 = "Cybertek";

    static ArrayList<Integer> List1 = new ArrayList<>();

    static String str2; //null, if not initialized it is not object yet
        //we have reference, but we do not have an object

    public static void main(String[] args) {

        System.out.println(str1.charAt(0));// C

        String str3 = null;
        Integer i = null;

       // WebElement webElement = null;

        List1.add(null);

        System.out.println(List1);//list accepts null

       // System.out.println(str2.charAt(0));//Throws NullPointerException

        System.out.println("====================================");

        String number = "123";

        int num = Integer.parseInt(number);

        System.out.println(num);

        String [] arr = {null,"Cybertek", null};

        arr[1].toUpperCase();


        String name = "cybertek".toUpperCase();
         //   name = null;
            //    name = name.toUpperCase();

        System.out.println(name);



        System.out.println(arr.length);//size is 3, because reserves a spot






    }
}
