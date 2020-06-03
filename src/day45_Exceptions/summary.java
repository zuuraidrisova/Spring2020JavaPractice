package day45_Exceptions;

public class summary {

    public static void main(String[] args) {

        System.out.println("Hello");

        /*
           in multi-catch,  parent exception cannot come before child exception
         */

        try{

            throw new NullPointerException();

        }catch(ArithmeticException e){

            System.out.println("ArithmeticException");

        }catch(ClassCastException e){

            System.out.println("ClassCastException");

        }catch(NullPointerException e){


            System.out.println("NullPointerException");

        }catch(RuntimeException e){

            System.out.println("RuntimeException");

        }catch (Exception e){

            System.out.println("Exception");

        }finally{

            System.out.println("Finally block runs no matter what");
        }

        System.out.println("Completed"); // because we handled the exception ,
        // we are able to print this line


    }
}
