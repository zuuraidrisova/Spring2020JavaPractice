package day23_CustomMethods;

public class Methods {

    public static void main(String[] args) {

        printHelloCybertek();

        printHello5times();

        printBatch18();

        printHello5times();



    }
    public static void printHello5times(){

        for(int i = 0; i < 5 ; i++) {

            System.out.println("Hello World");
        }
    }


    public static void printHelloCybertek(){

        System.out.println("Hello, Cybertek");
    }


    public static void printBatch18(){

        System.out.println("Hello Batch 18!");
    }

    /*
    step 1: void method (without parameter)
    step2: void method (with parameter)
    step3: return method(without parameter)
    step4: return method (with parameter)
    step5: using the custom methods in different classes
     */

}
