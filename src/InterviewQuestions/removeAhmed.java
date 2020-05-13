package InterviewQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class removeAhmed {
    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
     */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        for(int i = 0; i < list.size(); i++){

            System.out.println(list.get(i));
        }

        System.out.println("============================");

        list.removeIf(p -> p.equals("Ahmed"));

        for(String each : list){

            System.out.println(each);
        }

        System.out.println("============================");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(1,1,1,1,2,3,4,5,6,7));

        System.out.println(list1);

        System.out.println("============================");

        list1.removeAll(Arrays.asList(1));

        System.out.println(list1);



    }
}

