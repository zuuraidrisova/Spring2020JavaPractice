package day44_Exceptions;

public class wait {
    /*
     Write a method called "wait" that causes the current executing thread to sleep
     for the specific number of seconds
     parameters: double seconds
     */

    public void wait(double seconds){

        try {

            Thread.sleep(1000);

        }catch (Exception e){

            System.out.println("Something went wrong");
        }

    }

    public static void main(String[] args) {

    }

}
