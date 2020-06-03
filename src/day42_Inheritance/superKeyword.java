package day42_Inheritance;

class A{

   int a = 100;

   public A(double b){

       System.out.println("instance variable: "+a);
   }


}
public class superKeyword extends A {

    int a = 200;

    public superKeyword(){

        super(1.0);

        System.out.println("instance variable: "+super.a);
                        // super will refer to super class instance variable
    }

    public static void main(String[] args) {

        superKeyword obj = new superKeyword(); // 100  100

        System.out.println("====================");

        A obj2 = new A(0.9); // 100



    }


}
