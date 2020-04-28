package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class MethodsArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<Integer>();

        //add(): adds values to ArrayList by order, at the end of ArrayList

        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        //get(index) ; gets value at given index

        int num = list.get(0);

        System.out.println(num);//returns 4

        //add(index, value) ; adds value at given index

        list.add(1,3);
            // index at 1 add value 3

        System.out.println(list);

        //set(index, value); changes or replaces element at the given index

        list.set(1,9);//now at index 1 new element 9 will be replaced

        System.out.println(list);

        //remove(index) ; removes the element at given index and resizes  the ArrayList

        list.remove(0);//we have element 4 at index 0 , and size of ArrayList  is 4
        // now after removing we do not have element 4 at index 0 and size of ArrayList is 3

        System.out.println(list);

        //size() ;  returns the number of elements as int

        int number = list.size();//because we removed 4 at index 0, now size is 3

        System.out.println(number);

        //isEmpty(); checks if ArrayList is empty or not, if it is empty returns true otherwise false

        boolean a = list.isEmpty();//returns true bcs our ArrayList is not empty

        System.out.println(a);

        //contains(index) ; checks if element is inside the ArrayList, if yes returns true otherwise false

       boolean b =  list.contains(6);//returns true bcs our ArrayList contains 6

        System.out.println(b);

        //indexOf() ; returns the index of the first occurrence of element

        int num2 = list.indexOf(6);//element 6 is at index of 2, so it will return 2

        System.out.println(num2);

        //clear() ; removes all elements from this ArrayList

        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list2.add(2); list2.add(4);

        System.out.println(list2);// we have 2 elements at list2

        list2.clear();//now it will clear list2

        System.out.println(list2);

        //toString() ; returns ArrayList as a string

        System.out.println(list);//toString method is hidden


        //equals() checks whether two ArrayLists are equal or not, returns boolean

        boolean c =  list.equals(list2);//compares two lists and returns  false
        //because list2 is empty and other one has elements

        System.out.println(a);






    }
}
