package day50_PolymorphismContinue;

abstract class A{

    public abstract void method();

    public void method1(){
       //this is instance method in an abstract class
    }

}

interface I{

    public abstract void method2();//public and abstract are given by default

}

public class Abstraction extends A implements I {

        @Override
        public void method(){

            System.out.println("Overriding method from an abstract class");
        }

        @Override
        public void method2(){

            System.out.println("Overriding method from an interface");
        }

}


