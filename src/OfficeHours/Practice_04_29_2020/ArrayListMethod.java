package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayListMethod {

    public static void main(String[] args) {

        /*
          add(); --> adds objects into ArrayList  at the end each time

          add(index, object) -->  inserts Object at given index

          get(index); --> gets object at specified index

          set(index, object); --> replaces old value with new value at given index

          remove(index); --> removes object at specified index

          remove(object); --> deletes object itself

          clear(); --> clears all ArrayList

          indexOf(); --> finds and returns index position of first occurring  object as an int

          lastIndexOf(); --> returns index number of last occurring object as an int


         */

        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println(list);//empty

        System.out.println("===============");

        System.out.println(list.size());//0 bcs nothing

        System.out.println("===============");

        list.add(1);//add 1 to list
        list.add(2);//add 2 to list

        System.out.println(list);//now size is 2 bcs we added items

        System.out.println("===============");

        //size of ArrayList is auto-adjusted bcs ArrayList is dynamic
        //every time we add , size increases, but when we remove Objects size shrinks

        list.add(1,3);//adding 3 at index 1, next object will shift to next index

        System.out.println(list);

        System.out.println("===============");

        int num = list.get(2);

        System.out.println(num);

        System.out.println("===============");

       // Byte b = num; does not compile bcs Byte Wrapper Class accepts only byte

        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

        System.out.println(list2);

        System.out.println("===============");

        list2.add(2,"E");//inserts E at index 2

        System.out.println(list2);

        System.out.println("===============");

        for(int i =0; i < list2.size(); i++){

            System.out.println(list2.get(i));

        }

        System.out.println("===============");

        for(String each : list2){

            System.out.println(each);
        }

        System.out.println("===============");

        list2.set(3,"F");//replacing F with C at index 3

        System.out.println(list2);


        System.out.println("===============");

        int a = 1;

        list2.remove(a);//removes object at index 1

        System.out.println(list2);

        System.out.println("===============");

        boolean b =  list2.remove("F");//remove object "F" wherever it is
                //returns true bcs it was removed

        boolean c = list2.remove("Z");
                //returns false bcs Z does not exist

        System.out.println(b);
        System.out.println(c);

        System.out.println("===============");

        System.out.println(list2);

        System.out.println("===============");

        list2.clear();//clear all and sets size of ArrayList to 0

        System.out.println(list2); // []

        System.out.println("===============");

        System.out.println(list2.size());//size is 0

        System.out.println("===============");


        ArrayList<Character> list3 = new ArrayList<Character>();

        list3.add('A'); //0
        list3.add('B'); //1
        list3.add('C'); //2
        list3.add('D'); //3
        list3.add('E'); //4
        list3.add('C'); //5

        System.out.println(list3);

        System.out.println("===============");

        int n = list3.indexOf('C');//this should give us 2

        System.out.println(n);

        System.out.println("===============");

        int n1 = list3.lastIndexOf('C');//it should give 5

        System.out.println(n1);

        System.out.println("===============");

        list3.remove(list3.lastIndexOf('C'));

        System.out.println(list3);

























    }
}

