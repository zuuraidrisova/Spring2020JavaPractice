package day46_Final_Abstract;

public class finalKeyword {

   /*
   FINAL ==? NON-ACCESS-MODIFIER:

   final is constant, cannot be changed

        final variables: cannot reassigned
        finale methods: function cannot be changed, cannot be overridden

    final =	Attributes and methods cannot be overridden/modified
    final =	The class cannot be inherited by other classes

    If you don't want the ability to override existing attribute values,
    declare attributes as final:

    static block and instance initializer blocks cannot be final
    */

    final int instanceVariable = 300;
    //final instance variables need to be initialized right away

    final static int staticVariables = 1000;
    //final instance variables need to initialized immediately

    public static void main(String[] args) {


        final double pi = 3.14;
        //pi = 3.15;==> compile error because we cannot reassign final variables

        final String gender = "male";
      //  gender = "female";==> compile error because we cannot reassign final variables

        final int score;

        score = 100;

       // score = 200;==> compile error because we cannot reassign final variables

        System.out.println("========================================");

        finalKeyword obj1 = new finalKeyword();

       // obj1.instanceVariable = 400; ==> compile error because we cannot reassign final variables


        // obj1.staticVariables = 200; ==> ==> compileError because we cannot reassign final variables


    }
}
