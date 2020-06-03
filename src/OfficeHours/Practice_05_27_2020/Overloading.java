package OfficeHours.Practice_05_27_2020;
public class Overloading {
    /*

    Overriding:
        different implementation of the same method

        always in subclass, always class needs to be extended

        same name, same parameters, but functionality are different

        access modifier can be same or more visible

        return type must be same

        ONLY INSTANCE METHOD CAN BE OVERRIDDEN
        STATIC METHOD AND CONSTRUCTOR CANNOT BE OVERRIDDEN


OverLoading:
    * happens in SAME class
    * SAME method name
    * DIFFERENT parameter
    * Return type does NOT matter
    * Access modifier does NOT matter
    * Instance method CAN be overloaded
    * STATIC methods CAN be overloaded
    * Constructor CAN be overloaded
    * ALL METHODS CAN BE OVERLOADED

     */
    protected void method1(){

        System.out.println("method overridden");
    }

    public static void method2(){

        System.out.println("method with static");
    }

    public Overloading(){

        System.out.println("super class default constructor");
    }
}

class TestClass extends Overloading {

    @Override
    protected void method1(){

        System.out.println("method overridden");
    }
  //  @Override static cannot be overridden
   // public static void method2(){

   // }

    public TestClass(){

        super();
    }
}
