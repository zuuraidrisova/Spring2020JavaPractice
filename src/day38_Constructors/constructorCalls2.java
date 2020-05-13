package day38_Constructors;

public class constructorCalls2 {


    public constructorCalls2(){

        System.out.println("Default Constructor");

    }

    public constructorCalls2(int a){

            this();
           // this("b"); only one constructor call inside another constructor

        System.out.println("Constructor with int argument");
    }

    public constructorCalls2(String str){

       // System.out.println("Gives compiler error, because constructor
        // call is done always at first step");

        this(10);

        System.out.println("Constructor with String argument");

    }

    public static void main(String[] args) {

        constructorCalls2 obj = new constructorCalls2("Hello");

        //chain relation == > constructor with string argument is
        // calling constructor with int argument and constructor with int argument
        // is calling default argument





    }

}
