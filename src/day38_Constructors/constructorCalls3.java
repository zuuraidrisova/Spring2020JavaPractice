package day38_Constructors;

public class constructorCalls3 {


    public constructorCalls3(){

        this(1);// only one constructor inside another constructor at a time
        System.out.println("Default constructor");
    }

    public constructorCalls3(int a){

      //  this(); this current constructor already contained in default, so when you call
        //  it will give you current constructor

        System.out.println("Constructor with int argument");
    }

    public constructorCalls3(String str){

       // this("hello"); cannot call itself, but can call any other constructor
    }

    public void method(){

       // constructorCalls3(); cannot be called in other methods
    }

    public static void main(String[] args) {

        constructorCalls3 obj = new constructorCalls3();

    }

}
