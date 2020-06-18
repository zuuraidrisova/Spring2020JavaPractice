package day49_Ploymorphism_Intro;

interface Animal{
    //super class can be reference type to child class

}
class Dog implements Animal{

}

class Cat implements Animal{

}

public class PolymorphismExample {

    public static void main(String[] args) {

       // Animal obj = new Animal();//we cannot create obj of interface
        Animal obj2 = new Dog();//we can create obj of child class and refer to child class
        Animal obj3 = new Cat();

       // Dog obj4 = new Cat(); must be is a relation

        Dog obj5 = new Dog();
        Cat obj6 = new Cat();


        Animal [] animalShow = {obj2, obj3, obj5, obj6};
        //animal is parent of dog obj and cat obj

    }
}
