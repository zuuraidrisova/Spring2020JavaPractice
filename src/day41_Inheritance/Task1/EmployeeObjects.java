package day41_Inheritance.Task1;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {

    public static void main(String[] args) {

        Developer dev1 =  new Developer("Namik", "Senior Developer", 'M',120000, 90123);
        Developer dev2 =  new Developer("Zuura", "Senior Developer",'F',150000, 90234);
        Developer dev3 =  new Developer("Muhtar","Junior Developer",'M',120000, 90345);
        Developer dev4 =  new Developer("Sergy","Junior Developer", 'M',110000,90456);

        ArrayList<Developer> listDev = new ArrayList<>();

        listDev.addAll(Arrays.asList(dev1,dev2,dev3,dev4));

        for(int i = 0; i < listDev.size(); i++){

            System.out.println(listDev.get(i));
        }

        for(int i = 0; i < listDev.size(); i++){

            listDev.get(i).coding("Java");
        }

        for(Developer each : listDev){

            each.fixingBug();
        }

        System.out.println("=============================================================");

        Tester tester1 = new Tester("Esma","SDET",'F',120000,90888);
        Tester tester2 = new Tester("Eric","SDET",'M',120000, 90777);
        Tester tester3 = new Tester("Aika","QA",'F',100000,90111);

        ArrayList<Tester> listTest = new ArrayList<>();

        listTest.addAll(Arrays.asList(tester1,tester2,tester3));

        for(int i = 0; i < listTest.size();i++){

            System.out.println(listTest.get(i));
        }

        for(int j = 0; j < listTest.size(); j++){

            listTest.get(j).reporting();
        }
        for(Tester each : listTest){

            each.testing();
        }
        System.out.println("=============================================================");

        BusinessAnalyst ba1 = new BusinessAnalyst("Venera","BA",'F',130000, 90436);

        System.out.println(ba1);


    }
}
