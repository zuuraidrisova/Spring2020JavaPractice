package day38_Constructors;

public class constructorPractice {

    public  constructorPractice(){

        this(0.2);

        System.out.println("A");

       // this(0.2);//should be at the very first step
    }

    public constructorPractice(int a){

        this();//default constructor
        System.out.println("B");
    }

    public constructorPractice(double a){

       // this(); ==> defualt has constructor with double parameter, cannot contain itself
        //this(10.0); ==>  constructor cannot call it self
        System.out.println("C");
    }

    public static void main(String[] args) {

        constructorPractice obj = new constructorPractice(1);

    }

}
