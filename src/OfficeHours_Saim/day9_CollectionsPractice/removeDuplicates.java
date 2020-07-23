package OfficeHours_Saim.day9_CollectionsPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;


public class removeDuplicates {
    /*
    Create a method that will accept a String and returns a version that
     removes duplicate instances of any character
        Ex: removeDup("AAABBBCCCD") ==> ABCD
     */

    public static void main(String[] args) {

       String noDup =  removeDuplicates("AAABBBCCCD");

        System.out.println(noDup);
    }

    public static String removeDuplicates(String str){

       return  new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString().replace("[","").replace("]","").replace(",","");

    }
}
