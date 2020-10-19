package day52_Collections;

import java.util.*;

public class lists {

    public static void main(String[] args) {

        //List has:  ArrayList, LinkedList, Vector (and Vector has Stack in it)

        // List: implemented by ArrayList, LinkedList, Vector

        //List<Integer> list0 = new List<Integer>(); will create a compile error
            //because list is an interface, we cannot create an object from interface

        List<Integer> list1 = new ArrayList<>();
        // ==> polymorphism when parent is reference type for its child

        list1.add(12); //==> add() method is overridden method comes from ArrayList

       // ArrayList is a singly linked list, it is much faster in retrieving data
        int a = list1.get(0);

        System.out.println(a);

        System.out.println("=========================");

        List<String> list2 = new LinkedList<>();
        // ==> polymorphism when parent is reference type for its child

        System.out.println("=========================");

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);

        Vector<Integer> vector= new Vector<>();

        vector.add(10);

        Stack<Integer> stack = new Stack<>();

        stack.add(10);//synchronized,

        System.out.println("=========================");

        Stack<String> names = new Stack<>();

        names.add("Alina");
        names.add("Sary");
        names.add("Zuura");

        System.out.println(names);

        String me = names.pop(); //last in was Zuura, she will first out ==>removed

        System.out.println(me);

        System.out.println(names);






    }


}
