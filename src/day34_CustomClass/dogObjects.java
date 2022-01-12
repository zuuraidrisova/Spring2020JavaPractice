package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class dogObjects {

    public static void main(String[] args) {

       Dog [] dogs =  {new Dog(), new Dog(), new Dog()};
/*

       dogs[0].breed = "Husky";
       dogs[0].size = "small";

        System.out.println( dogs[0].breed );
        System.out.println(dogs[0].size);

 */
        // dogs[0],dogs[1], dogs[2] ==> copies of instance variables

        dogs[0].setDogInfo("Husky","Toby","Small",
                "White", 4);

        System.out.println(dogs[0]);

        System.out.println("======================");

        dogs[1].setDogInfo("Alabay", "Ajdar", "Extra Big", "Brown", 3);

        System.out.println(dogs[1]);

        System.out.println("======================");

        dogs[2].setDogInfo("Poodle","Lucy","Miniature","White",2);

        System.out.println(dogs[2]);

        System.out.println("======================");

        ArrayList<Dog> listDogs = new ArrayList<>();

        listDogs.addAll(Arrays.asList(dogs));

        System.out.println(listDogs);

        System.out.println("======================");

        for(int i = 0; i < listDogs.size(); i++){

            System.out.println(listDogs.get(i));
        }

        Dog dog1 = new Dog();

        dog1.setDogInfo("Pomeranian", "Lil", "Small" , "White", 3);

        listDogs.add(dog1);

        System.out.println("======================");

        for(Dog each : listDogs){

            System.out.println(each);
        }

        System.out.println("======================");

        Predicate<Dog> age3 = a -> a.age == 3;

        listDogs.removeIf(age3);

        System.out.println(listDogs);

        System.out.println("======================");

        dogs[0].eat("meat");

        System.out.println("======================");

        dogs[2].drink("water");

        System.out.println("======================");

    }
}
