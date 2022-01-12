package day47_Abstraction;

class RegularClass{

    //it is a regular class
    //in regular class we can have everything, but we cannot have an abstract method

    int a = 100;

    static int b = 20;

    public RegularClass(){

        System.out.println("default constructor in a non-Abstract class");
    }


    public void instanceMethod(){

        System.out.println("this is an instance method in non-Abstract class");
    }


    public static void staticMethod(){

        System.out.println("this is static method in non-Abstract class");
    }

    {
        System.out.println("instance block in a non-abstract class");
    }

    static {

        System.out.println("static block in a non- abstract class");
    }

}

abstract class AbstractClass{

    // in an abstract class we can have everything and plus abstract methods

    int a = 100;

    static int b = 20;


    public AbstractClass(){

        System.out.println("constructor in an abstract class");
    }

    public void instanceMethod(){

        System.out.println("instance method in an abstract class");
    }


    public static void staticMethod(){

        System.out.println("static method in an abstract class");
    }

    public abstract void abstractMethod();//==> abstract method

    {
        System.out.println("instance block in an abstract class");
    }

    static {

        System.out.println("static block in an abstract class");
    }

}

public class abstract_vs_nonAbstract {

/*
    we cannot create an object from abstract class, because it is not concrete
    we can create an object only from non-abstract classes
 */

    public static void main(String[] args) {

        RegularClass obj = new RegularClass();//regular class

       // AbstractClass obj2 = new AbstractClass();
        // will give compiler error because it is an abstract class

    }
}
