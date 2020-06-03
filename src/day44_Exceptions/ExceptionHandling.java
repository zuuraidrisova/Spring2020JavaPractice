package day44_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str = "Cybertek";

        try{

            System.out.println(str.charAt(100));

        }catch (RuntimeException e){

            //getMessage() ==> is an instance method of RuntimeException class

           String msg =  e.getMessage();

            System.out.println(msg);

        }
        System.out.println("===============================================");

        String result = "";
        try{

            System.out.println(100 / 0);
            System.out.println("Try block");

        }catch (ArithmeticException e){

            //whenever unchecked block occurred then always catch block will run

            System.out.println("Catch block");
            result =  e.getMessage();

        }
        System.out.println(result);

        System.out.println("Completed");


    }

    /*
    testCase:

        step1
        step2
        step3 ==> Exception occurred , we will not be able to run the rest of the steps,
                    so we have try and catch block to handle it
        step4
        step5
        etc...
     */
}
