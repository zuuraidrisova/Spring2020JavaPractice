package day52_Collections;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class practiceRemoveDuplicates {

    public static void main(String[] args) {

        String [] arr = {"A","A","C","B","A"};

        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println(set);//keeps insertion order, predictable

        HashSet<String> set2 = new HashSet<>(Arrays.asList(arr));

        System.out.println(set2);//unpredictable, does not keep insertion order

    }
}
