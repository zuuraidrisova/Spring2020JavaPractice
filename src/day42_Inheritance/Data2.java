package day42_Inheritance;

public class Data2 extends AccessModifiers2 {

    // public, protected, default can be inherited

    public static void main(String[] args) {

       // all  variables can be called thru class name because they are static

        System.out.println(Data2.publicVar);
        System.out.println(Data2.protectedVar);
        System.out.println(Data2.defaultVar);

       // System.out.println(Data2.privateVar); ==> private can never be inherited

        System.out.println("===============================");

     // can be called directly too

        publicMethod();
        protectedMethod();
        defaultMethod();

       // privateMethod(); private  can never be inherited

        System.out.println("===============================");

        // all  methods can be called thru class name because they are static

        Data2.publicMethod();
        Data2.protectedMethod();
        Data2.defaultMethod();


    }
}
