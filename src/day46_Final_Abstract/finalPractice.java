package day46_Final_Abstract;

public class finalPractice {

    final int a = 10;
    final static int b = 20;

    {

        System.out.println(a);
       // a = 20; final cannot be reassigned
    }

    static {

        System.out.println(b);
      //  b = 30; final cannot be reassigned
    }

    public finalPractice(){


    }

    public final  void method1(){
        //the position of final keyword in method signature does not matter,
        //it can come before or after access modifiers

    }

    public final static void method2(){


    }

}

class test extends finalPractice{

    /*
    @Override
    public void method1(){


    }
     */

    private final int method1(int a){
        //final can be overloaded
        return 12;
    }







}