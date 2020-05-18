package day42_Inheritance;

public class Fish extends Animal {

    public void swim(){// only unique for fish class so we declare it inside fish class
        //                  not parent class
        System.out.println(name+" is swimming");
    }
    public static void main(String[] args) {

        Fish fish1 = new Fish();

        fish1.name = "Dori";
        fish1.size = "medium";
        fish1.weight = 3;

        System.out.println(fish1.name +" is "+fish1.size+" and "+fish1.weight+" pounds");

        fish1.eat("worms");
        fish1.move();
        fish1.swim();

      //  fish1.bark(); we do not have this method in this fish sub class or parent class



    }
}
