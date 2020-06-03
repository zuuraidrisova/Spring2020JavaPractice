package OfficeHours.Practice_05_20_2020;

class test{

    public test(String a){

        System.out.println("constructor with string arg");
    }
    public test(int a){

        System.out.println("constructor with int arg");
    }
    public test(double a){

        System.out.println("constructor with double arg");
    }
}
public class Constructor2 extends test{

    public Constructor2(){

        super("h");
        System.out.println("default");
    }
    public static void main(String[] args) {

        Constructor2 obj = new Constructor2();

        test obj2 = new test(9);


    }

}
