package OfficeHours_Saim.day8_Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class countLetters {
/*
Create a method that will accept a String and be print how many times each
 characters is found in the String

Ex: String s = "apple";
    a - 1
    p - 2
    l - 1
    e - 1
 */

    public static void main(String[] args) {

        countLetters("apppppppppleee");
    }

    public static void countLetters(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < str.length(); i++){

            char key = str.charAt(i);

            if( ! map.containsKey(key)){

                map.put(key, 1);

            }else {

                map.put(key, map.get(key) + 1);

            }
        }

        //printing
        for(Character key: map.keySet()){

            System.out.println(key+" = "+map.get(key));
        }

    }





}
