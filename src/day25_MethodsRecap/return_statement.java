package day25_MethodsRecap;

public class return_statement {

    public static void main(String[] args) {

     /*   if (10 > 9) {
            return;
        }

        System.out.println("Hello");

      */
        method1();//exits just the current method, so
        method2();//exits everything in the program

        System.out.println("Hello");//it is gonna print in method1 == it is not gonna print in method2
    }
    public static void method1(){

        if(10 > 9){

            return;//exits the current method
        }
    }
    public static void method2(){

        if(10 > 9){

            System.exit(0);//exits the entire program
        }
        System.out.println("Hello Cybertek");

    }

}
