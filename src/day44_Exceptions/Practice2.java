package day44_Exceptions;

public class Practice2 {

    /*
    print Hello , wait 2 seconds
    print Cybertek, wait three seconds

    1. Write a method called "wait" that causes the current executing thread to sleep
     for the specific number of seconds
     parameters: double seconds
      */
    public static void main(String[] args) {

        System.out.println("Java");

        wait(2.5);

        System.out.println("Cybertek");

        wait(3.5);

        System.out.println("Test Completed");

    }

    public static void wait(double seconds){

        try {

            Thread.sleep((long)(seconds * 1000));
            //sleep thread accepts only long so we cast it explicitly

        }catch (Exception e){

        }

    }

}
