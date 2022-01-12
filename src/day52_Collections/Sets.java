package day52_Collections;

import java.util.*;

public class Sets {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        //if there is duplicated object, it will only store one
        names.add("Zuura");
        names.add("Zuura");
        names.add("Sha");
        names.add("Ozgur");

        System.out.println(names);

        System.out.println("===================================");

        String [] name = {"Alina","Alina","Zuura","Sary"};

        System.out.println(Arrays.toString(name));

        LinkedHashSet<String> noDuplicates =  new LinkedHashSet<>();

        noDuplicates.addAll(Arrays.asList(name));

        System.out.println(noDuplicates);

       // System.out.println(noDuplicates.get(1)); compile error, because no indexes

        System.out.println("========================================");

        Set<Integer> set1 = new TreeSet<>();

        set1.addAll(Arrays.asList(2,8,2,2,2,0,1,3,6,5,4,7,8));
        //TreeSet will remove duplicates and at the same time sort the set
        System.out.println(set1);

        System.out.println("===========================================");

       HashSet<String> hashSet = new HashSet<>();

       //hashSet accepts one null value
       hashSet.add(null);
       hashSet.add(null);

        System.out.println(hashSet);

        TreeSet<String> treeSet = new TreeSet<>();

        //treeSet does not accept null value
        treeSet.add(null);
        treeSet.add(null);

        System.out.println(treeSet);

    }
}
