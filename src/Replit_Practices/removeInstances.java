package Replit_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class removeInstances {

    public static void main(String[] args) {

        /*

        This method gets an arraylist of Integers and a number(Integer).
        it returns an arraylist.

It removes any instance of the number it gets from the arraylist.

for example:

romoveInst([1,1,2,3,1,4],1)
returns: [2,3,4]

romoveInst([3,4,3,3],4)
returns: [3,3,3]

         */

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1,2,3,1,4));

        Integer a = 1;

        removeInstances(list,a);

        System.out.println(list);
    }

    public static ArrayList<Integer> removeInstances(ArrayList<Integer> list, Integer number){

      list.removeAll(Arrays.asList(number));


        return list;
    }
}
