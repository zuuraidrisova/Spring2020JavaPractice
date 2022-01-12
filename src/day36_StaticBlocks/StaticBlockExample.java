package day36_StaticBlocks;

import OfficeHours.ClassObjectPractice.Tester;

public class StaticBlockExample {

    static String name;
    static  int num;

    static String name2;
    static int num2;

    static Tester tester;

    static {

        name2 = "Muhtar";
        num2 = 200;

      tester = new Tester();
      tester.setTesterInfo("Kim", "SDET", 12345, 1200000);
    }

    public static void main(String[] args) {

       name = "Muhtar";//only inside this class, bcs it is initialized under main method
       num = 200;

        System.out.println(name);
        System.out.println(num);
    }
}
