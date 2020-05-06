package WarmUp_Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class predicatePractice {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(list);

        //removing all odd numbers

        Predicate<Integer> oddNum = n -> n % 2 != 0;

        list.removeIf(oddNum);

        System.out.println(list);

        // removing all numbers less than 5

        Predicate<Integer> lessThan5 = n -> n < 5;

        list.removeIf(lessThan5);

        System.out.println(list);

        





    }
}
