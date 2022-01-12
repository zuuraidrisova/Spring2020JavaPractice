package day36_StaticBlocks;

public class Test {

    public static void main(String[] args) {

        System.out.println( StaticBlockUsage.tester1);
        //it is value is none because tester1 is initialized under main method,
        // so it is not possible to use it in another class

        System.out.println(StaticBlockUsage.tester2);
        //because we initialized tester2 info inside static block and outside main
        //it will run anywhere, but only once

        System.out.println(StaticBlockExample.name);// prints null, because initialized inside main method

        System.out.println(StaticBlockExample.num);

        System.out.println(StaticBlockExample.name2);//prints Muhtar bcs initialized outside main

        System.out.println(StaticBlockExample.num2);

        System.out.println(StaticBlockExample.tester);


    }
}
