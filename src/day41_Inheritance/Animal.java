package day41_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class Animal {

    public String name;
    public String size;
    public double weight;
/*

    public Animal(String name, String size, double weight){

        this.name = name;
        this.size = size;
        this.weight = weight;
    }

 */

        public  String toString(){

            return name+" "+size+" "+weight;
        }

    public void eat(String food){

        System.out.println(name+" is eating "+food);

    }

    public void move(){

        System.out.println(name+" is moving");
    }

}

class Dog extends Animal {

    /*
   now  dog class inherited all features of animal class
     */
    public void bark(){ // only unique for dog class so we declare it inside dog class
        //                  not parent class

        System.out.println(name+" is barking");

    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Sasha";
        dog1.size = "small";
        dog1.weight = 12;

        System.out.println(dog1.name + " is "+dog1.size+" and "+dog1.weight+" pounds");

        dog1.move();

        dog1.eat("meal");

        dog1.bark();

    }

}

class Fish extends Animal {

    public void swim(){// only unique for fish class so we declare it inside fish class
        //                  not parent class
        System.out.println(name+" is swimming");

    }
    public static void main(String[] args) {

        Fish fish1 = new Fish();

        fish1.name = "Dori";
        fish1.size = "medium";
        fish1.weight = 3;

        System.out.println(fish1.name +" is "+fish1.size+" and "+fish1.weight+" pounds");

        fish1.eat("worms");

        fish1.move();

        fish1.swim();

        //  fish1.bark(); we do not have this method in this fish sub class or parent class


    }
}

class AnimalObjects{

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Sasha";
        dog1.size = "small";
        dog1.weight = 12;

        Fish fish1 = new Fish();

        fish1.name = "Dori";
        fish1.size = "medium";
        fish1.weight = 3;


        ArrayList<Animal> animals = new ArrayList<>();

        animals.addAll(Arrays.asList(dog1,fish1));

        for(Animal each : animals){

            System.out.println("each = " + each);
        }


        for (int i = 0; i < animals.size(); i++){

            animals.get(i).eat("milk");
            animals.get(i).move();
        }
    }
}