package day29_Wrapper_ArrayList;

public class WrapperClass {

    public static void main(String[] args) {

        /*

        WRAPPER classes are important because collection and map data structures

                        do not accept primitive data types, they accept only

                        objects, so wrapper class helps us convert primitive data types

                        into objects.

        byte -- > Byte
        short --> Short
        int --> Integer
        long --> Long
        float --> Float
        double --> Double
        char --> Char
        boolean --> Boolean




         */

        int a = 100;//primitive data type of int

        Integer b = a; //wrapper class of int

        short s1 = 200;//primitive data type of short

        int n = s1;

      //  Integer c = s1;// compiler error because Integer is only for int data type

        Integer n2 = n;//compiles bcs Integer  is only for int

        int a1 = 20;

        float f1 = a1;

       // Float f2 = a1; Float does not accept int, Float accepts only float

        Integer i = 200;

        int a2 = i;

        Byte b1 = 127;

        int a3 = b1;//Byte wrapper class can be assigned to any larger primitive data type

        System.out.println(a3);



















    }
}
