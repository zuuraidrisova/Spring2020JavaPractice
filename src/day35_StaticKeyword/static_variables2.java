package day35_StaticKeyword;

public class static_variables2 {


    int insVar;// every single object has its own copy

    static int staticVar;//there is only one copy shared  by all objects..
    //static can be called thru class and object, bcs it belongs to both
    // static prefers to be called thru the class name

    public static void main(String[] args) {

        // 2 copies of instance variables, they have different copies
        // 1 copy of static variable

        static_variables2 obj1 = new static_variables2();
        obj1.insVar = 300;
        obj1.staticVar  = 400;

        static_variables2 obj2 = new static_variables2();


        System.out.println(obj1.insVar); // 300, sharing different value
        System.out.println(obj2.insVar); // 0, sharing different value

        System.out.println(obj1.staticVar); // 400,sharing same value
        System.out.println(obj2.staticVar); //400, sharing same value

        System.out.println(static_variables2.staticVar);// static can be called thru the class name

      // System.out.println(static_variables2.insVar);// instance variable can be called only thu the object,
        // but cannot be called thru the class name












    }











}
