package day52_Collections;

import java.util.*;

public class removeDuplicates {

    public static void main(String[] args) {

        String str = "zuuuuuuuuuuuraa";

        String noDup = removeDuplicates(str);

        System.out.println(noDup);

        removeDuplicates2(str);

    }

    public static String removeDuplicates(String str){ //unique values

        String noDuplicates = "";

        for(int  i = 0; i < str.length(); i++){

            int count = 0;

            for(int  j = 0; j < str.length(); j++){

                if(str.charAt(i) == str.charAt(j)){

                    count++;
                }
            }

            if(count == 1){

                noDuplicates += str.charAt(i);

            }
        }

        return noDuplicates;

    }


    public static void removeDuplicates2(String str){

        System.out.println(new LinkedHashSet<>(new ArrayList<>(Arrays.asList(str.split("")))));

    }


}

