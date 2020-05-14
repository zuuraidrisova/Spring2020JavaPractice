package OfficeHours.Practice_05_13_2020;

public class constructorOverloading {

    /*
    we can have multiple constructor in one class

    same method name but different parameter==>  different amount of parameter
                                                or pass different data type

     */


    public constructorOverloading(){

        System.out.println("constructor with no parameter");

    }

    public constructorOverloading(int a){


        System.out.println("constructor with int parameter");
    }


    public constructorOverloading(String str){

        System.out.println("constructor with string parameter");

    }


    public constructorOverloading(int a, double b, String n){


        System.out.println("constructor with multiple parameters of different data type");
    }

    public static void main(String[] args) {

        constructorOverloading obj = new constructorOverloading();
        constructorOverloading obj1 = new constructorOverloading(12);
        constructorOverloading obj2 = new constructorOverloading("hello");
        constructorOverloading obj3 = new constructorOverloading(12,2.2,"hello");


    }
}
