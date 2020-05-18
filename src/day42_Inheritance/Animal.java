package day42_Inheritance;

public class Animal {

    String name;
    String size;
    double weight;
/*

    public Animal(String name, String size, double weight){

        this.name = name;
        this.size = size;
        this.weight = weight;
    }

 */

    public void eat(String food){

        System.out.println(name+" is eating "+food);

    }
    public void move(){

        System.out.println(name+" is moving");
    }




}
