package day34_CustomClass;

public class dogObjects2 {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.setDogInfo("Alabay", "Ajdar", "Extra Big", "Brown", 3);

        Dog dog2 = new Dog();

        dog2.setDogInfo("Husky","Toby","Small", "White", 4);

        dog1.eat("chicken");
        dog1.drink("water");
        dog1.play("ball");

        System.out.println("===============================");

        dog2.eat("steak");
        dog2.drink("smoothie");
        dog2.play("barbie");

        Dog dog3 = new Dog();

        dog3.setDogInfo("Chihua Hua","Tuzik","Small","Brown",1);

        Dog dog4 = new Dog();

        dog4.setDogInfo("Poodle","Lucy","Miniature","White",2);

        System.out.println("===============================");

        String food1 = "fish";

        Dog [] dogs = {dog1, dog2, dog3, dog4};

        for(Dog each: dogs){

            each.eat(food1);
        }

        System.out.println();

        System.out.println("===============================");

        String toy = "piano";
        String drink = "coffee";
        String subject = "Java";

        for(int i = 0; i < dogs.length; i++){

            dogs[i].play(toy);
            dogs[i].drink(drink);
        }

        System.out.println("===============================");

        for(Dog each  : dogs){

            each.eat(food1);
            each.drink(drink);
            each.play(toy);
            each.study(subject);
        }

    }
}
