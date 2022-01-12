package day40_Encapsulation;

public class nestedClass {

    /*
    statics:
         variables
         blocks
         methods
         class

         nested class can be static,
         if it is inner class then  yes it can be static
         it it is outer class it cannot be static

         nested class is class in another class

         if we have multiple static variables we can group them in static class

     */
    static int a;

    static class data{
        //this is nested class,
        //this inner class becomes member of outer class
        //shared by all objects of outer class

        static int b = 100;
        static int c = 200;

       static {

           a = 300;

        }

    }

    public static void main(String[] args) {

        System.out.println(data.b);
        System.out.println(data.c);

    }
}
