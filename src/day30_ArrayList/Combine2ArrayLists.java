package day30_ArrayList;

import java.util.ArrayList;

public class Combine2ArrayLists {


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);list.add(2); list.add(4);list.add(5);


        System.out.println("this is list 1 "+list);

        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list2.add(6); list2.add(7); list2.add(8);

        System.out.println("this is list 2 "+list2);

        ArrayList<Integer> combined = new ArrayList<Integer>();

        for(int i = 0; i < list.size(); i++){


            combined.add(list.get(i));

        }

        for(int i = 0 ; i < list2.size(); i++){

            combined.add(list2.get(i));
        }

        System.out.println("this is combined list of previous two "+combined);




    }
}