package OfficeHours.Practice_05_27_2020;

public class MethodOverriding {

    public void method1(){

        System.out.println("Super class");
    }
}
class Test extends MethodOverriding{
    //subclass     superclass

    @Override
    public void method1(){

        System.out.println("Sub class");
    }

    public static void main(String[] args) {

      MethodOverriding obj1 = new MethodOverriding();

      obj1.method1();//super class

      Test obj2 = new Test();

      obj2.method1();//sub class
    }
}