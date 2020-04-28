package day30_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod {


    public static void main(String[] args) {

        //add(index, object) : adds the object at the given index

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1); list.add(2);list.add(3);//simply adds elements at the end of list each time

        System.out.println(list);

        list.add(1,9);//inserts object at given index. and pushes the rest

        System.out.println(list);

        //list.add(10, 7); out of bound bcs our max index is 3



        //set(index) :  replaces object at given index

        list.set(3, 7);//element at index 3 we want to change with 7

        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("A");//A
        list2.add("B");//B

        list2.add(1,"C");//A C B
        list2.add(1, "D");// A D C B

        System.out.println(list2);//Bbc when you insert it pushes the rest to next index


        list2.set(3,"F");//now we are replacing element at index 3 with new F
        //A D C F

        System.out.println(list2);
















    }
}
