package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class DevelopersObject {

    public static void main(String[] args) {

        Developers developer1 = new Developers();

        developer1.setDeveloperInfo("Leo", "Senior Developer", 130000, 90345);

        System.out.println(developer1);

        developer1.code("Java");
        developer1.fix();

        Developers developer2 = new Developers();

        developer2.setDeveloperInfo("Kiki", "Developer", 100000, 90456);

        System.out.println(developer2);

        developer2.code("Python");

        developer2.fix();

        System.out.println("=================================================");

        Developers [] devs = {developer1,developer2};
        // array of Developers ==> Developers is data type
        //array is ordered data structure, we can retrieve info by indexes

        for(int i = 0; i <  devs.length; i++){

            System.out.println(devs[i]);
        }

        System.out.println("=================================================");

        for(Developers each : devs){

            System.out.println(each.name +" "+each.salary);
        }

        System.out.println("=================================================");


        ArrayList<Developers> listDev = new ArrayList<>();

        listDev.addAll(Arrays.asList(devs));

        System.out.println(listDev);

        System.out.println("=================================================");

        System.out.println(listDev.size());

        System.out.println("=================================================");

        for(int i = 0; i < listDev.size(); i++){

            System.out.println(listDev.get(i).name);
        }

        System.out.println("=================================================");

        for(Developers each : listDev){

            System.out.println(each);
        }
        System.out.println("=================================================");













    }
}
