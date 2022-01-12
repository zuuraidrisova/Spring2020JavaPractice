package day44_Exceptions;

public class TryCatch2 {

    public static void main(String[] args) {

        System.out.println("Hello");

        try {

            Thread.sleep(4000);
            System.out.println("Try block");
            //if try block message is executed it means try block was able to fix it

        }catch (InterruptedException e){

            System.out.println("Something went wrong");

            System.out.println("Catch block");
            
            //if these two statements get executed then try block was not able
            // to handle it, so it jumped to catch block
        }


        System.out.println("World");
    }
}
