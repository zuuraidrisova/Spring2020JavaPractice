package day35_StaticKeyword;

public class static_Methods {

    int a = 100;//instance variable
    static  int b = 200; //static variable

    public static void main(String[] args) {

       // System.out.println(a);//static only accepts static

        static_Methods obj = new static_Methods();

        System.out.println(obj.a);//only called thru the object name

        System.out.println(b);//can be called by itself
        System.out.println(static_Methods.b);//can be called thru the class name
        System.out.println(obj.b);// can be called thru the object, but gives warning,
        // because static is preferred to be called thru the class name

    }

    public void method(){

        System.out.println(a);//instance method accepts instance variable

        System.out.println(b);// because objects come from class,
        // static can be accepted in any other places, also called global variables

    }
}
