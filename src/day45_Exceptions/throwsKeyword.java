package day45_Exceptions;

public class throwsKeyword {
    /*

    throws:
        used to indicate that method is going to throw some kind of exception

        it is another way(shorter cheaper way)of handling checked exception

        throws ==> means that method throws an exception, must be used in method signature

        but, when we want to use that method we need to handle it every single time

        the caller method is responsible again to handle exception

         by using throws keyword
     */

    public static void sleep() throws Exception{

        Thread.sleep(3000);
       /*
       try{
            //try catch is one way to handle Thread.sleep() methods exception
            Thread.sleep(3000);

        }catch (Exception e){

        }
        */
    }

    public static void sleep2(){

       try{
            //try catch is one way to handle Thread.sleep() methods exception
            Thread.sleep(3000);

        }catch (Exception e){

        }

    }


    public static void sleep3() throws Exception{

        //the caller must always handle that exception again
        Thread.sleep(1000);
        /*
        it means every time when we use a method which throws the exception
         we need to specify throws keyword again
         you need to handle it anywhere you use it. throws doesn’t really handle it,
          it just allows you to compile
         */

    }

    public static void method() throws Exception{

        String []arr = {"A"};

        main(arr);

    }

    public static void method2() throws Exception{

        method(); //so everytime we need to use throws keyword
    }


    public static void main(String[] args) throws Exception {

        System.out.println("Cybertek");

        sleep2();

        System.out.println("Java");

        sleep();

        System.out.println("Hello");

        sleep3();

    }







}
