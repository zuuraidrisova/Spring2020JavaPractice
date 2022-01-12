package day30_ArrayList;

import java.util.ArrayList;

public class IndexOf {

    public static void main(String[] args) {

        // indexOf(object) -->  returns index of given object as an int
        //lastIndexOf(object) --> returns index of last given object as an int

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1); // 0
        list.add(2); // 1
        list.add(1); // 2
        list.add(3); // 3

        int num = list.indexOf(1); // 1 has index of 0 , first matching
                //Integer = int; --> autoboxing
        System.out.println(num);

        int num1 = list.indexOf(100);//100 does not exist, so it will return negative number

        System.out.println(num1);

        int num2 = list.indexOf(3);// 3 has index of 3

        System.out.println(num2);


    }
}
