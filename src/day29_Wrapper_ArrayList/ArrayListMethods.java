package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        /*
   Methods:
          add() :  adds more non-primitives(objects) to the array

          get(index) :  gets the objects at the given index

          size() : same as length in array,  returns length or size of ArrayList as an int

         */

        ArrayList<Integer> scores = new ArrayList<Integer>();//now it is 0 size

        scores.add(10);//autoboxing size --> 1, 10 is int by default so primitive is being
                                            //assigned to its wrapper class which is autoboxing
        scores.add(20);//autoboxing size --> 2
        scores.add(30);//30 is int by default, and int is being assigned to Integer Wrapper class
                        //so it is autoboxing...and size is 3 now

        System.out.println(scores);

        Integer a =  scores.get(2);//we can assign it to an Integer

        int b = scores.get(2);// we can assign it to primitive data type int--> unboxing
        double c = scores.get(2);//we can assign it to primitive data type double-->unboxing

        System.out.println(a);

        System.out.println(c);

        //System.out.println(scores.get(100));//out of bound, bcs size is 3 now

        int size = scores.size();

        System.out.println(size);


    }
}
