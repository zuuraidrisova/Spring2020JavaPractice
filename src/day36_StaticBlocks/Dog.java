package day36_StaticBlocks;

public class Dog {

    String breed;
    String name;
    String size;
    String color;
    int age;

    public void setDogInfo(String breed, String name, String size, String color, int age){

        this.breed = breed;
        this.name = name;
        this.size = size;
        this.color = color;
        this.age = age;


    }

    public String toString(){

        return "My dog's name is "+name +", and its breed is "+breed+", its color is "+color
                +", its size is "+size+ ", its age is "+age;

    }

    public void bark(){

        System.out.println(name + " is barking");
    }

    public void eat(String food){

        System.out.println(name+" is eating "+food);
    }
}
