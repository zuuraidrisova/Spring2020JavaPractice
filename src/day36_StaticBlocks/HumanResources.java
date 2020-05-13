package day36_StaticBlocks;

import day34_CustomClass.Developers;

public class HumanResources {

    static Developers developer1 = new Developers();//can be called thru the class name

    static Developers developer2 = new Developers();
   // developer2.setDeveloperInfo("Kristina", 13654, "Developer", 100900);
    //should always be initialized inside static block

    static Developers developer3 = new Developers();

    static Developers developer4 = new Developers();

    static Developers developer5 = new Developers();



    public static void main(String[] args) {

        developer1.setDeveloperInfo("Namik", 125343, "Developer", 120000);
    }


    static {

        developer2.setDeveloperInfo("Kristina", 13654, "Developer", 100900);
       developer3.setDeveloperInfo("Bob", 12465, "Developer", 123763);


    }
}
