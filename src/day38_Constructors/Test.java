package day38_Constructors;

public class Test {

    public Test(){//constructor is used to create object and to initialize instance variable

        System.out.println("Constructor");
    }

    {//instance block gets executed if object is created and called thru it
        //used to initialize instance variables

        System.out.println("Instance block");
    }


    static {// static block gets executed first and once only, it is used to initialize static variable

        System.out.println("Static block");
    }


    public static void main(String[] args) {

        /*
        static block gets executed first
        instance block gets executed
        constructor gets executed

         */
    // static does not depend on the object, no object still static block can run


        new Test();// instance variable, constructor

        System.out.println("Hello");//top to bottom
    }
}

