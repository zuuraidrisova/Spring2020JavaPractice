package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class objectMemory {

    int a =1000; // instance variable go to Heap memory

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));//all objects go to Heap memory
        //but name of variable list goes to Stack memory

        System.out.println(list);

        ArrayList<Integer> list2 = list;//same object, so only one object is created in Heap

        System.out.println(list2);

        System.out.println("================================");

        list2.remove(2);//bcs  list and list2 are same, if we remove one object from one
        //another gets rid of the object as well

        System.out.println(list);
        System.out.println(list2);

        System.out.println("================================");


        String str1 = new String("Cybertek");

        System.out.println(str1);

        System.out.println("================================");

        String str2 = str1;//same object as str1, go to Heap memory, create one object

        System.out.println(str2);

        System.out.println("================================");

        str1 = str1.toUpperCase();//now it created another object, by reassigning it

        System.out.println(str1);//reassigning makes str a new string
        System.out.println(str2);//












    }
}
