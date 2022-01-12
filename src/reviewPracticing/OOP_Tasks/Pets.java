package reviewPracticing.OOP_Tasks;

public abstract class Pets {
    /*
      abstraction practice tasks:
	Task01:
		1. create an abstract class called Pets
				attributes: name, age, color, breed, gender
				methods:
					abstract methods: sleep, eat, speak
					instance method: toString
		2. create three sub classes (non-abstract) of pet:
								1. Dog
								2. Cat
								3. Tiger
				each class MUST have constructors to initialize the attributes
     */

    public String name;
    public int age;
    public String color;
    public String breed;
    public char gender;

    public abstract void sleep();

    public abstract void eat(String food);

    public abstract void speak();

    public String toString(){

        return "Name: "+name+", Age: "+age+", Breed: "+breed+", Color: "+color+", Gender: "+gender;
    };

}

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

        System.out.println(name+ " is sleeping");
    }

    @Override
    public void eat(String food){

        System.out.println(name+" is eating "+food);
    }

    @Override
    public void speak(){

        System.out.println(name+" speaks English");
    }
}

class Cat extends Pets{

    public Cat(String name, int age, String color, String breed, char gender){

        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
    }

    @Override
    public void sleep(){

        System.out.println(name+ " is sleeping");
    }

    @Override
    public void eat(String food){

        System.out.println(name+" is eating "+food);
    }

    @Override
    public void speak(){

        System.out.println(name+" speaks English");
    }
}

class Tiger extends Pets{

    public Tiger(String name, int age, String color, String breed, char gender){

        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
    }

    @Override
    public void sleep(){

        System.out.println(name+ " is sleeping");
    }

    @Override
    public void eat(String food){

        System.out.println(name+" is eating "+food);
    }

    @Override
    public void speak(){

        System.out.println(name+" speaks English");
    }
}

class petsObjects{

    public static void main(String[] args) {

        Cat cat = new Cat("katy",2,"brown","kiki",'f');

        System.out.println(cat);
        cat.eat("milk");
        cat.sleep();
        cat.speak();


        Dog dog = new Dog("dodo",3,"black","husky",'m');

        System.out.println(dog);
        dog.eat("meat");
        dog.sleep();
        dog.speak();

    }
}