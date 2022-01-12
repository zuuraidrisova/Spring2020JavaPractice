package reviewPracticing.collectionsFramework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {

    //  1. write a program that can remove the duplicated characters from String

    public static void main(String[] args) {

        String str = "zuuurrrrrrraaaaa";

        String noDup = noDuplicates(str);

        System.out.println(noDup);

    }
    public static String noDuplicates(String str){

        String noDup = "";

        String[] strings = str.split("");

        Set<String> set = new HashSet<>(Arrays.asList(strings));

        for (String each:  set){

            noDup += each;

        }

        return noDup;

    }

}
