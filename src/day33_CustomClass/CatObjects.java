package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {

    public static void main(String[] args) {

        Cat cat1 = new Cat();

        cat1.setCatInfo("British","Marko","gray",3);

        System.out.println(cat1);

        System.out.println("==============================");

        Cat cat2 = new Cat();

        cat2.setCatInfo("Siemes","Sasha","white",2);

        System.out.println(cat2);

        System.out.println("==============================");

        ArrayList<Cat> list = new ArrayList<>();

        list.addAll(Arrays.asList(cat1,cat2));

        System.out.println(list);

        System.out.println("==============================");

        for(Cat each : list){

            System.out.println(each);
        }
        System.out.println("==============================");

        for(int i = 0; i < list.size(); i++){

            System.out.println(list.get(i));
        }
        System.out.println("==============================");


        cat1.sleep();

        System.out.println("==============================");

        cat2.sleep();

        System.out.println("==============================");

        cat1.drink("milk");

        System.out.println("==============================");

        cat2.drink("water");

        System.out.println("==============================");

        cat1.eat("cat treats");

        System.out.println("==============================");

        cat2.eat("candies");

        System.out.println("==============================");


    }
}
