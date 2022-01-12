package day47_Abstraction;


abstract class A{


    public abstract void method();//abstract method

    public void method1(){//instance method

    }

}

public class abstract_vs_nonAbstract2 extends  A{

    //mandatory to override superclass's abstract methods
    @Override
    public void method() {

    }
    //both methods are instance now, one is overridden

}


abstract class B extends A{

    //we dont have to override because subclass is also an abstract class
    //because it is extended , we have one abstract and one instance method
}

class C extends B{

    //because we have extended class B
    // which in its term inherited all abstract methods of class A
    //we have to override all existing methods now, then it will compile


    @Override
    public void method() {

    }

}
