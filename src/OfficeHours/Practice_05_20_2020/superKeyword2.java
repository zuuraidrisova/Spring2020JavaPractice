package OfficeHours.Practice_05_20_2020;


class Data{

    int a = 20;

    public void method(){

        System.out.println("super class instance method");
    }

}
public class superKeyword2 extends Data {

    int a = 30;

    public void method(){

        System.out.println("sub class instance method");
    }
    public superKeyword2(){

        super.method();
       // int k = super.a;
        System.out.println(super.a);

    }

    public static void main(String[] args) {

        superKeyword2 obj = new superKeyword2();

    }

}
