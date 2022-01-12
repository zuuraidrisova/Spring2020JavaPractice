package day44_Exceptions;

public class Unchecked {

    public static void main(String[] args) {

        System.out.println("Test started");

         // System.out.println(9 / 0);
        //everything compiled fine, we can run, but we have runtime exception

       String str = "Cybertek";

      //  System.out.println(str.charAt(-1));
        //index out of range exception

        int [] arr = {1,2,3};

        System.out.println(arr[10]);
        // array out of bound exceptions

        System.out.println("test completed");
        // we will not be able to complete remaining codes, because of exceptions


    }
}
