package day44_Exceptions;

public class sleep {
    /*

    Thread.sleep(long milliseconds); ==> makes the current execution thread to wait
                                        for specific amount of time

     */
    public static void wait(double seconds){

        try{

            Thread.sleep((long)(seconds * 1000));

        }catch (Exception e){


           String msg =  e.getMessage();
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {

        System.out.println("Please");

        wait(2.3);

        System.out.println("Hello");

        wait(3.3);

        System.out.println("WORLD");
    }
}
