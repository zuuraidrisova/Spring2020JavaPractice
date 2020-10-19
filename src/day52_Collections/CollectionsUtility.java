package day52_Collections;

import java.util.*;

public class CollectionsUtility {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,9,1,6,8,2,5,4,3,7,0));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        System.out.println("======================================");

        //remove duplicates from arrayList and print out in ascending order

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,3,2,1,4,6,5,7,7,9,9,8));

        System.out.println(list2);

        Set<Integer> noDuplicates = new TreeSet<>();

        noDuplicates.addAll(list2);

        list2 = new ArrayList<>(noDuplicates);

        System.out.println(list2);

        System.out.println("====================================");

        LinkedList<Integer> list3 = new LinkedList<Integer>();

        list3.addAll(Arrays.asList(10,10,30,40,20,50,60,50));

        System.out.println(list3);

        Set<Integer> noDup = new TreeSet<>(list3);

        System.out.println(noDup);

        System.out.println("===================================");

        //remove duplicates from arrayList and print out in ascending order

        ArrayList<Integer> list4 = new ArrayList<>();

        list4.addAll(Arrays.asList(1,3,2,1,4,6,5,7,7,9,9,8));

        list4 = new ArrayList<>(new TreeSet<>(list4));

        System.out.println(list4);

        System.out.println("=====================================================");

        //remove duplicates from arraylist without changing insertion order

        ArrayList<Integer> list5 = new ArrayList<>();

        list5.addAll(Arrays.asList(6,6,6,5,5,5,4,4,4));

        list5 = new ArrayList<>(new LinkedHashSet<>(list5));

        System.out.println(list5);

        System.out.println("=============================================");

        ArrayList<String> letters = new ArrayList<>();

        letters.addAll(Arrays.asList("A","A","B","C","B","D"));

        boolean b = Collections.frequency(letters,"A") == 1;

        System.out.println(b);






    }
}
