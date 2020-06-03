package day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class tryCatch {

    public static void main(String[] args) {

        System.out.println("Test started");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));//max index is 4
        //out of bound exception, because we don't have index 10

        try{//try to fix it, if not it will go jump to catch block

            System.out.println(list.get(10));

        }catch (IndexOutOfBoundsException e){
            //we can give all these three
            //Exception ==> RuntimeException ==> IndexOutOfBoundsException
            //grandpa           dad                     son

            System.out.println("Something went wrong");// we can give description in this block
        }

        System.out.println("Test completed");






    }
}
