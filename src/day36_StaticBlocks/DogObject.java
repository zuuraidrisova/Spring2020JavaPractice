package day36_StaticBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {

    public static void main(String[] args) {

        Dog [] dogs = {new Dog(), new Dog(), new Dog(), new Dog()};

        dogs[0].setDogInfo("German shephard", "Klichko", "big","white",12);
        dogs[1].setDogInfo("Husky", "Kity", "medium","grey", 4);
        dogs[2].setDogInfo("Alabay", "Ghost", "big","brown",5);
        dogs[3].setDogInfo("Bulldog", "Ozzie","big","black",6);

        for(int i = 0; i < dogs.length; i++){

            System.out.println(dogs[i]);
        }

        System.out.println("=================================================");

        for(Dog each : dogs){

            System.out.println(each.name +" is "+each.age+" years old");
        }

        System.out.println("==========================================");

        for(Dog each : dogs){

            each.bark();
            each.eat("Meat");
        }

        System.out.println("==========================================");

        ArrayList<Dog> puppies = new ArrayList<>(Arrays.asList(dogs));

        for(Dog each : puppies){

            System.out.println(each.name +" is "+each.color);
        }

        puppies.removeIf(p -> p.color.equals("brown"));

        System.out.println("============================================");

        for(int i =0; i < puppies.size(); i++){

            System.out.println(puppies.get(i));
        }

        System.out.println("=============================================");

        System.out.println(puppies.size());

    }
}
