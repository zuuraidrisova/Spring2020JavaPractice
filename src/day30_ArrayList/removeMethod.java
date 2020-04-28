package day30_ArrayList;

import java.util.ArrayList;

public class removeMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);//0
        list.add(2);//1
        list.add(3);//2
        list.add(4);//max index num is 3

        System.out.println(list);

        System.out.println("==============");

        list.remove(0);//we can directly give index

        System.out.println(list);

        System.out.println("==============");

         int a = 1;//or we can declare an int variable for indexes

         list.remove(a);

        System.out.println(list);

        System.out.println("==============");


        list.add(6);
        list.add(9);

        System.out.println(list);

        System.out.println("==============");

        Integer b = 6;//object 6 variable

        list.remove(b);//object 6 will be removed

        System.out.println(list);

        System.out.println("==============");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(10);
        list2.add(20);
        list2.add(30);

       // list2.remove(20);//index out of bound bcs max index is 2

        list2.remove(1);//it will remove 20 at index 1

        System.out.println(list2);

        System.out.println("==============");

        Integer c = 10;

       boolean d =   list2.remove(c);

        System.out.println(list2);

        System.out.println(d);

        //removes(object) --> removes the object and can return boolean














    }
}
