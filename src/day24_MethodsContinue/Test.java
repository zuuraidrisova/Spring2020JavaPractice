package day24_MethodsContinue;

import java.util.Arrays;
import resources.Library;

public class Test {

    public static void main(String[] args) {

        String str = "Zuura";

        String reversed =  Library.reverse(str);

        System.out.println(reversed);

        int [] arr = {100,300,500,1500,870};

        int [] arr2 = Library.sortDescending2(arr);

        System.out.println(Arrays.toString(arr2));




    }
}
