package day42_Inheritance;

class B{


   public B(int a){

       System.out.println("int");
   }
    public B(double a){

        System.out.println("double");
    }
    public B(long a){

        System.out.println("long");
    }


}



public class inheritance2 extends B {

    public inheritance2(String a){

        super(12L);
        System.out.println("String");
    }

    public static void main(String[] args) {


        inheritance2 OBJ = new inheritance2("hello");

    }
}
