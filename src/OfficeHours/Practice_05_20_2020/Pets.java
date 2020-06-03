package OfficeHours.Practice_05_20_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class Pets {
    /*

    custom class: pet
            variables:  name, age, color, size, breed, isPet, numberOfeyes
            methods:    eat, sleep, drink, toString

     */

    protected String name;
    protected int age;
    protected String color;
    protected String size;
    protected String breed;
    protected static boolean isPet = true;
    protected static short numberOfEyes = 2;

    public void setPetInfo(String name,int age,String color,String size,String breed){

        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
        this.breed = breed;
    }


    public void eat(String food){

        System.out.println(name +" eats "+food);
    }
    public void drink(String drink){

        System.out.println(name+" drinks "+drink);
    }
    public void sleep(int hours){

        System.out.println(name+" sleeps for "+hours+" hours");
    }
    public String toString(){

        return "Name: "+name+", Breed: "+breed+", Size: "+size+", Color: "+color+", Age: "+age+
           ", has "+numberOfEyes+" eyes";
    }

}

class Dog extends Pets{
    /*
     Dog:
        variables:  name, age, color, size, breed, isPet, numberOfeyes ==> inherited
        methods: eat, sleep, drink, toString,==> inherited
        only method  bark should be declared

     */
    public Dog(String name,int age,String color,String size,String breed){

        setPetInfo(name,age, color, size, breed);
    }

    public void bark(){

        System.out.println(name+" barks day and night");
    }

}
class Cat extends Pets{
    /*
     variables:  name, age, color, size, breed, isPet, numberOfeyes ==> inherited
        methods: eat, sleep, drink, toString,==> inherited

        only method scratch should be declared

     */
    public Cat(String name,int age,String color,String size,String breed){

        setPetInfo(name,age, color, size, breed);
    }

    public void scratch(){

        System.out.println(name+" scratches");
    }

}

class Bunny extends Pets{
    /*
    variables:  name, age, color, size, breed, isPet, numberOfeyes ==> inherited
        methods: eat, sleep, drink, toString, ==> inherited
         only method Dig should be declared

 constructor can call other methods, but if u want to call constructor itself,
 we cannot call them in custom methods.
     */
    public Bunny(String name,int age,String color,String size,String breed){

        setPetInfo(name,age, color, size, breed);
    }
    public void dig(){

        System.out.println(name+" digs");
    }
}

class House{

    public static void main(String[] args) {

        Dog dog1 = new Dog("Karabas",5,"black","large","Husky");// has a relationship
        Dog dog2 = new Dog("Rindik", 2, "White", "Huge","Kangal");
        Dog dog3 = new Dog("Ajdar",6,"white","large","Alabai");

        ArrayList<Dog> dogs = new ArrayList<>();

        dogs.addAll(Arrays.asList(dog1, dog2, dog3));

        for(int i = 0; i < dogs.size(); i++){

            System.out.println(dogs.get(i));
        }

        System.out.println("====================================");

        for(Dog each: dogs){

            System.out.println(each.name+" "+each.breed);
        }
        System.out.println("====================================");

        for(int i = 0; i < dogs.size(); i++){

            dogs.get(i).bark();
        }

        System.out.println("====================================");

       //existing constructor should be used
        Cat cat1 = new Cat("Muffin",7,"white","medium","Ragdoll");
        Cat cat2 = new Cat("Bonbon", 2, "Brown", "Small", "Abyssinian");
        Cat cat3 = new Cat("Donut", 4,  "brownie", "medium", "catwille");

        Cat [] cats = {cat1,cat2,cat3};

        for (int i = 0; i < cats.length; i++){

            System.out.println(cats[i]);
        }

        System.out.println("=====================================");


        for(Cat each : cats){

            System.out.println(each.name+" "+each.breed);
        }

        System.out.println("====================================");

        for(Cat each : cats){

            each.scratch();
        }


        System.out.println("====================================");

        Bunny bunny1 = new Bunny("Bug",3,"white","small","tiny");
        Bunny bunny2 = new Bunny("Pamuk",1,"white","small","Holland lop");
        Bunny bunny3 = new Bunny("Firfir", 2, "White", "Small", "Angora");

        ArrayList<Bunny> bunnies = new ArrayList<>(Arrays.asList(bunny1,bunny2, bunny3));

        for (int i = 0; i < bunnies.size(); i++){

            System.out.println(bunnies.get(i));
        }
        System.out.println("=====================================");

        for (Bunny each : bunnies){

            System.out.println(each.name+" "+each.breed);
        }
        System.out.println("====================================");

        for(Bunny each : bunnies){

            each.dig();
        }


    }
}