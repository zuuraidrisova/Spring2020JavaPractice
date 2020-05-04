package day33_CustomClass;

public class Cat {

    String breed;
    String name;
    String color;
    int age;

    public void setCatInfo(String breedCat, String nameCat, String colorCat, int ageCat){

        breed = breedCat;
        name = nameCat;
        color = colorCat;
        age = ageCat;
    }

    public String toString(){

        String result = name+",breed is "+breed+",color is "+color+", "+age+" years old";

        return result;
    }


    public void sleep(){

        System.out.println(name+" is sleeping");

    }

    public void eat(String catFood){

        System.out.println(name+" is eating "+catFood);
    }

    public void drink(String drink){

        System.out.println(name+" is drinking "+drink);
    }


}
