package day34_CustomClass;

public class Dog {

    String breed;
    String size;
    String color;
    int age;
    String name;

    public void setDogInfo(String breed, String name, String size, String color, int age){

        // this keyword is used for calling object instances (instance variable)
        //this keyword can be ignored if parameter had different name than instance variable
        // this keyword refers to the object instances

        this.breed = breed;
        this.name = name;
        this.size = size;
        this.color = color;
        this.age = age;

    }

    public void eat(String food){

        System.out.println(name + " is eating " + food);

    }

    public void drink(String drink){

        System.out.println(name + " is drinking "+ drink);
    }

    public void play(String toy){

        System.out.println(name + " is playing "+ toy);
    }

    public void study(String subject){

        System.out.println(name + " is studying " + subject);
    }

    public String toString(){

        String result = "The breed of my dog is " +  breed
                 + "\nMy dog's name is " + name
                +"\nIt is " + size
                + "\nIts color is " + color
                +"\nIt is " + age + " years old";

        return result;

    }

}
