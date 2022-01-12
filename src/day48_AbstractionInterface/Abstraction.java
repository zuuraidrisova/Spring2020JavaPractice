package day48_AbstractionInterface;


interface A{
    //one java file can have multiple interfaces
    //as long as there is one public access modifier

    int method1();
}

interface B{

   abstract void method2();

}

interface C{

    abstract double method3(double a, double b);

}

public class Abstraction implements A, B, C {

    //subclass can implement more than one interface

    @Override
    public int method1(){

        int a = 10;
        int b = 12;

        return a + b;
    }

    @Override
    public void method2(){

        System.out.println();
    }

    @Override
    public double method3(double a, double b){

        return a + b;
    }

}
