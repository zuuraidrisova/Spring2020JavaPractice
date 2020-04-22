package OfficeHours.Practice_04_22_2020;

public class ReturnStatement {

    public static void main(String[] args) {

      /*  if(10 > 9){

            return;//this return statement exit the main method, any thing after this will not be executed
        }
        System.out.println("Hello");//this will not run

       */
        method1();//return inside this method will not effect the main method

        System.out.println("Hello");


    }
    public static void method1(){

        if(10 > 9){
            return;
           // System.exit(0);will exit the custom method, main method, whole program
        }
        System.out.println("Hello");//will not be printed bcs return statement will exit from this current method
    }
}
