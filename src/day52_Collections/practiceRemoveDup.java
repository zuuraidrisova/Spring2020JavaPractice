package day52_Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class practiceRemoveDup {

    public static void main(String[] args) {

        String str = "ABABABCDEF";

       String b = removeDuplicates2(str);

        System.out.println(b);

       String a =  removeDuplicates(str);

        System.out.println(a);
    }

    public static String removeDuplicates(String str){

        String [] arr = str.split("");

        str = "";

       for(String each : new LinkedHashSet<>(Arrays.asList(arr))){

           str += each;
       }

        return str;
    }

    public static String removeDuplicates2(String str){

        String [] arr = str.split("");

        LinkedHashSet<String> noDuplicates = new LinkedHashSet<>(Arrays.asList(arr));

        String result = "";

        for(String each : noDuplicates){

            result += each;
        }

        return result;
    }
}
