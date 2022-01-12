package day35_StaticKeyword;

public class static_Variables {

// local variables  == variables that declared inside a block
// instance variables == variables declared outside block, every single object has its own copy
// static variables == also declared outside the block, contain static keyword, only one copy

    int a2 = 100; //instance variable, can be used outside the block

    static int  a3 = 300;//static variable

    public static void main(String[] args) {

        int a1 = 100;//local variable, we cannot use outside the block

        static_Variables obj1 = new static_Variables();//has its own copy
        obj1.a2 = 1000; // instance variable

        System.out.println(obj1.a2);//gives 1000, because its own copy

        static_Variables obj2 = new static_Variables();//has its own copy
        obj2.a2 = 2000;//instance variable

        System.out.println(obj2.a2);//gives 2000, because its own copy

        obj1.a3 = 4000;
        obj1.a3 = 5000;

        System.out.println(obj1.a3);//it gives 5000, one copy shared by all objects
        System.out.println(obj2.a3);//it gives 5000, one copy

    }

}
