package day36_StaticBlocks;

import OfficeHours.ClassObjectPractice.Tester;

public class StaticBlockPractice {

    static String name;

    static Tester tester1 = new Tester();

   // tester1.setTesterInfo("Muhtat", "SDET", 123, 130000);

    int insVariable;

    static {
        //gets executed as soon as class is loaded
        //static initialization block, means assigning static variables

        name = "Zuura";
        tester1.setTesterInfo("Muhtat", "SDET", 123, 130000);
        tester1.setTesterInfo("Zuura","SDET", 1432, 140000);

        //we never do such a thing like below in java
        StaticBlockPractice obj1 = new StaticBlockPractice();

        obj1.insVariable = 300;//do not use static block to initialize instance variable
    }

    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println(name);

        System.out.println(tester1);//TOP TO BOTTOM, Zuura will be printed

        StaticBlockPractice obj2 = new StaticBlockPractice();

        System.out.println(obj2.insVariable);
    }
}
