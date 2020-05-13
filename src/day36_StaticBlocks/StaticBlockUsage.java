package day36_StaticBlocks;


import day34_CustomClass.Testers;

public class StaticBlockUsage {

    static int a;
    static int b;//static variable

    static Testers tester1 = new Testers();

    static Testers tester2 = new Testers();

    static {//in order to initialize tester2 we need static block

        tester2.setTestersInfo("Zuura", 19823, "SDET",130000 );
    }


    public static void main(String[] args) {

        tester1.setTestersInfo("Jean", 12345, "SDET", 120000);
        //if we initialize tester info here, it is gonna be used only within this class
        //we initialize tester info inside main if only we are sure we want to use it inside this class

        System.out.println(tester1);

    }

    static {

        a = 100;//inside  static block we can initialize static variables
        b = 200;
        // c = 300; static only accepts static

        if(100 > 200){//when we have conditions to initialize static variables
            //if 100 is greater i want to initialize it to a

            a = 100;

        }else{//otherwise to b

            b = 200;
        }




    }

}
