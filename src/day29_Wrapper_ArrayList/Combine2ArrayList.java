package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class Combine2ArrayList {

    public static void main(String[] args) {
/*


        write a program that can combine two String arrays into one arrayList
        ex:
        arr1 = {"A", "B", "C"};
        arr2 = {"D", "E", "F", "G"};
        list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */
        String [] arr1 =  {"A", "B", "C"};

        String [] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < arr1.length; i++){

            list.add(arr1[i]);
        }

        System.out.println(list);

        for(int j = 0; j < arr2.length; j++){

            list.add(arr2[j]);
        }

        System.out.println(list);
    }
}
