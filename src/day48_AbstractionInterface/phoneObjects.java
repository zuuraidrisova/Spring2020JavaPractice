package day48_AbstractionInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class phoneObjects {

    public static void main(String[] args) {

        Iphone2 phone1 = new Iphone2("XR",850,"medium");

        System.out.println(phone1);

        Iphone2 phone2 = new Iphone2("9",900,"8 inches");

        System.out.println(phone2);

        Iphone2 phone3 = new Iphone2("XS",440, "small");

        phone1.faceTiming(2176845);
        phone1.calling(82134621);
        phone1.texting(7281534);

        Samsung2 phone4 = new Samsung2("10","medium",550);

        System.out.println(phone3);

        Samsung2 phone5  = new Samsung2("12","small",600);

        System.out.println(phone4);


        System.out.println("========================================");


        ArrayList<Iphone2> iphones = new ArrayList<>(Arrays.asList(phone1,phone2, phone3));


        for(int i = 0; i< iphones.size(); i++){

            System.out.println(iphones.get(i));
        }

        System.out.println("========================");

        for(Iphone2 each : iphones){

            each.calling(83164);
            System.out.println("***************");
            each.texting(211129);
            System.out.println("***************");
            each.faceTiming(919191);
        }

    }

}
