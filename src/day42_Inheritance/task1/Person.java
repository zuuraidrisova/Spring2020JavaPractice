package day42_Inheritance.task1;

public class Person {

    /*
    create a class called Person
				attributes:  name, age, gender
				methods: eat, walk, sleep, setPersonInfo
     */
    public String name;
    public int age;
    public char gender;

    public void setPersonInfo(String name, int age, char gender){

        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void eat(String food){

        System.out.println(name+" is eating "+food);

    }
    public void walk(int hour){

        System.out.println(name+" is walking for "+hour+" hours");
    }
    public void sleep(){

        System.out.println(name+" is sleeping");
    }

    public void drink(String drink){

        System.out.println(name+" is drinking "+drink);
    }

}
