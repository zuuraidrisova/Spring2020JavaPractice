package day26_MethodOverloading;

public class methodOverloading {

    public static void main(String[] args) {

      method();//original method
      method(10);//overloaded method

    }
    public static void method(){

        System.out.println("Original method");
    }
    public static void method(int a){

        System.out.println("Overloaded method by giving parameter");
    }
    public static void method(int a, int b){

        System.out.println("Overloaded method by giving number of parameters");
    }
    public static void method(double a){

        System.out.println("Overloaded method by giving different data type");
    }
}
