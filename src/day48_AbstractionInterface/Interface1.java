package day48_AbstractionInterface;

public interface Interface1 {

    static final int num = 90;//

    int num1 = 80;//by default it is static and final and public at the same time

    public void method1(); //==> abstract method

    public static void method2(){//static method

        System.out.println("This is static method in Interface");

        System.out.println(num);

        System.out.println(num1);
    }

    public abstract void method3();//abstract method

    void method4();//abstract method

    public static void main(String[] args) {

        Interface1.method2();

    }

}
