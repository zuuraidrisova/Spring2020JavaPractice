package day35_StaticKeyword;

public class Dog {

    String breed;
    int age;
    static boolean isPet;

    public static void main(String[] args) {



        Dog dog1 = new Dog();
        dog1.breed = "Husky";
        dog1.isPet = true;

        Dog dog2 = new Dog();
        dog2.breed = "Bulldog";

        System.out.println(dog1.breed);
        System.out.println(dog2.breed);

        System.out.println(dog1.isPet);
        System.out.println(dog2.isPet);







    }
}
