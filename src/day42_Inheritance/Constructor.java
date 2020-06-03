package day42_Inheritance;

class Test{//super class

    public Test(){
        System.out.println("super class' default constructor");
    }
}

public class Constructor extends Test {//sub class

    //at least one parent class constructor must be called in child class
    // if constructor in parent class is default constructor, it is called automatically


    public Constructor(){

        System.out.println("sub class' default constructor");
    }

    public static void main(String[] args) {

        Constructor obj = new Constructor();
        //it runs first super class constructor then sub class constructor

        System.out.println("====================");

        Test obj2 = new Test();
        //it runs only super class constructor, because it is parent class
        //parent class cannot inherit anything




    }


}
