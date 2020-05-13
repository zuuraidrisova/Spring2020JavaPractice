package day38_Constructors;

public class constructorCalls {
    /*
    Constructor is special method to create objects of a class and to initialize objects

   1. Only constructor can call other constructors
   2. But you cannot call constructor by its name, it should be called thru this() keyword
   3. Constructor call should be called at first step, at the very beginning
   4. Constructor cannot call more than one constructor.
   5. Constructor cannot call itself or contain itself


        this. ==> calls instance variables
        this() ==> calls constructors

     */

    public constructorCalls() {//default constructor

        method1();//constructor can call other methods, static or instance
        method2();//constructor can call other methods, static or instance


    }

    public constructorCalls(int a){

       // constructorCalls(); cannot call by its name

        this();//it is calling default constructor


    }

    public static void method1(){

       // method2(); ==> cannot call it because it is not static method

       // constructorCalls();other methods cannot call constructor
    }

    public void method2(){


    }





}