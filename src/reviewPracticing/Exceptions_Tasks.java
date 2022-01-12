package reviewPracticing;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import day44_Exceptions.Exceptions;

public class Exceptions_Tasks {

    /*
     Write a method called "wait" that causes the current executing thread to sleep
     for the specific number of seconds
     parameters: double seconds
     */

    public static void waitPlease(double seconds){

        try {

            Thread.sleep((long) (seconds * 1000));


        }catch (Exception e){

            System.out.println("Something went wrong");
            e.getMessage();
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {

        System.out.println("Please");

        Exceptions_Tasks.waitPlease(4);

        System.out.println("Please");
    }
}
