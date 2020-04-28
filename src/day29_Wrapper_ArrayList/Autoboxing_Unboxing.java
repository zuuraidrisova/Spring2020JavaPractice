package day29_Wrapper_ArrayList;

public class Autoboxing_Unboxing {

    public static void main(String[] args) {

        /*

        Autoboxing -->  assigning primitive data types to their own wrapper classes
                        converting primitives to objects

        Unboxing -->  converting objects into primitive data types

         */

        int a = 100;

        Integer b = a;//autoboxing --> making primitive an object


        Byte b1 = 98;//Wrapper class of Byte

        byte b2 = b1; //--> unboxing

        int i = b1;//we can assign Byte wrapper class to any bigger data type







    }
}
