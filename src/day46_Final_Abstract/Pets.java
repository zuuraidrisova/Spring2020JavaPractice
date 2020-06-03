package day46_Final_Abstract;

public abstract class Pets {
    /*
    1. create an abstract class called Pets
				attributes: name, age, color, breed, gender
				methods:
					abstract methods: sleep, eat, speak
					instance method: toString
     */

    public String name;
    public  int age;
    public String color;
    public String breed;
    public char gender;



    public abstract void sleep();

    public abstract void eat(String food);

    public abstract void speak();


    public String toString(){

        return name+" "+breed+" "+color+" "+age+" "+gender;
    }
}
/*
2. create three sub classes (non-abstract) of pet:
								1. Dog
								2. Cat
								3. Tiger
				each class MUST have constructors to initialize the attributes
 */

class Dog extends Pets{


    public Dog(String name, int age, String color, String breed, char gender){

        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;

    }

    @Override
    public void sleep(){

        System.out.println(name +" is sleeping 4 hours");
    }
    @Override
    public void eat(String food){

        System.out.println(name+" is eating "+food);
    }
    @Override
    public void speak(){

        System.out.println(name+" can speak English");
    }
}

class Cat extends Pets{

    public Cat( String name, int age, String color, String breed, char gender){

        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
    }
    @Override
    public void sleep(){

        System.out.println(name+" can sleep forever");
    }
    @Override
    public void eat(String food){

        System.out.println(name+" eats "+food);
    }
    @Override
    public void speak(){

        System.out.println(name+" can speak Russian");
    }

}

class Tiger extends Pets{

    public Tiger(String name,int age, String color, String breed, char gender ){

        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
    }
    @Override
    public void sleep(){

        System.out.println(name+" sleeps 8 hours a day");
    }
    @Override
    public void eat(String food){

        System.out.println(name+" eats "+food);
    }

    @Override
    public void speak(){

        System.out.println(name+" can speak Kyrgyz");
    }
}