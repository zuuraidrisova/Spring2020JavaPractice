package day36_StaticBlocks;

public class StaticBlocksFlow {

    /*

    Static block is static initializer

    static{

        statements'

        }whatever is inside these blocks will get executed first, before any blocks
        even before main method

        static block can be placed anywhere, and it is only executed once


     */



    public static void main(String[] args) {

        method();// to execute custom methods we have to call it in main method

        System.out.println("Main method is executed!");
    }


    public static void method(){

        System.out.println("Custom method is executed");
    }

    static {

        System.out.println("Static block is executed");

    }
}
