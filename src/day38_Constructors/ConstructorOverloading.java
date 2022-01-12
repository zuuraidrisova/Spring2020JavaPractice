package day38_Constructors;

public class ConstructorOverloading {

    // same method name, different parameters, or different data types
    //easy to use, readable, easy to maintain
    //we can have multiple constructors in a class bu using method overloading

}
class Dog{

    String name;
    String breed;
    int age;

    public Dog(){//constructor with no argument ==> default constructor

        this.name = "unknown";
        this.breed = "unknown";
        this.age = 0;

    }

    public Dog(String breed){//constructor with one parameter

        this.breed = breed;
        this.name = "unknown";
        this.age = 0;
    }

   /*
   compile error bcs we already have constructor with one String parameter

   public Dog(String name){

    }
    */

    public Dog(String breed, int age){//constructor with one parameter but different data type
        // or add another parameter

        this.name = "Unknown";
        this.breed = breed;
        this.age = age;
    }

    public String toString(){

        return "Breed: "+breed+" Name: "+name+" Age: "+age;
    }


}

class DogObjects{

    public static void main(String[] args) {

        Dog dog1 = new Dog();//default constructor

        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.age);

        System.out.println(dog1);

        System.out.println("====================================");

        Dog dog2 = new Dog("Husky");

        System.out.println(dog2.name);
        System.out.println(dog2.breed);
        System.out.println(dog2.age);

        System.out.println(dog2);

        System.out.println("====================================");

        Dog dog3 = new Dog("Poodle", 4);

        System.out.println(dog3.name);
        System.out.println(dog3.breed);
        System.out.println(dog3.age);

        System.out.println(dog3);

        System.out.println("====================================");

       // Dog dog4 = new Dog(5,"Husky");
        // we do not have constructor with this order of prmrts, so error

    }
}