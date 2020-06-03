package day44_Exceptions;

public class finallyBlock {

    public static void main(String[] args) {

        try{
            System.out.println(9 / 0); // unchecked exception

        }catch (ArithmeticException e){

            System.out.println("Catch block gets executed because it is unchecked exception");

        }finally{

            System.out.println("Finally block will get executed regardless any blocks above");

        }


    }
}
