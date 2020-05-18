package day42_Inheritance;

public class Dog extends Animal {

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
