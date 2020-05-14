package OfficeHours.Practice_05_13_2020;

public class statics {

    int instanceVariable = 100;
    static int staticVariable = 200;

    public static void staticMethod(){

      //  instanceMethod(); ==> static accepts only static so compiler error

        System.out.println(staticVariable);

    }

    public void instanceMethod(){

        //instance methods can accept static methods and variables all of them
        staticMethod();

        System.out.println(staticVariable);
        System.out.println(instanceVariable);
    }

    public static void main(String[] args) {

       // System.out.println(instanceVariable);
        //cannot be called without creating an object

        staticMethod();
        System.out.println(staticVariable);


    }
}
