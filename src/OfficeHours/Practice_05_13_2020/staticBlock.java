package OfficeHours.Practice_05_13_2020;

public class staticBlock {

    /*

    static{

    statement;
            }
     */

    static String str;

   static{ // used to initialize static variables,
        // usually when we need several steps to initialize like below

        str = "Cybertek";

        str = str.toUpperCase();

    }


}

class StaticTest{

    public static void main(String[] args) {

       // staticBlock.str = "Cybertek";
        //if we are using static variable str only within this class,
        // we can initialize it in main method, otherwise no
        System.out.println(staticBlock.str);
    }
}