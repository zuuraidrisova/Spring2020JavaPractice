package OfficeHours_Saim.day7_Exceptions;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String one = "cak";
        String two = "cba";

       boolean b =  isAnagram(one, two);

        System.out.println(b);

        boolean c = isAnagram2(one,two);

        System.out.println(c);

    }

    public static boolean isAnagram(String one, String two){

        if(one.length() !=  two.length()) return false;


        for(int i = 0; i < one.length(); i++){

            two = two.replaceFirst(""+one.charAt(i),"");

        }

        if(two.isEmpty()){

            return true;
        }else{

            return false;
        }
    }

    public static boolean isAnagram2(String one, String two){

        char [] ch = one.toCharArray();
        char [] ch2 = two.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        String str1 = Arrays.toString(ch);
        String str2 = Arrays.toString(ch2);

        if(str1.equals(str2)){

            return true;
        }else{

            return false;
        }
    }
}
