package day48_AbstractionInterface;

public interface Interface_VariablesMethods {

    public static final int  a = 100;
    //variables we give in interface are final and static by default, also public
    //final means cannot be re-initialized
    //static means only one copy
    //public means accessible to all classes

    int b = 200;

    public static void method1(){

        System.out.println("this is static method in interface");
    }

    void method2();//==> abstract method by default public

    public default void method3(){

        //special methods to enable lambda expressions
        //can only be created in interface and can be inherited
    }


    public static void main(String[] args) {

        System.out.println(a);

        System.out.println(Interface_VariablesMethods.b);//can be called by interface name

        Interface_VariablesMethods.method1();

    }


}
