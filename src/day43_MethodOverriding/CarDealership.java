package day43_MethodOverriding;

public class CarDealership {

    public static void main(String[] args) {

        Tesla tesla1 = new Tesla();

        tesla1.start();

        System.out.println("==============================");

        Honda honda1 =  new Honda();

        honda1.start();

        System.out.println("==============================");

        Jeep jeep1 = new Jeep();

        jeep1.start();

        System.out.println("==============================");

        Bmw bmw1 = new Bmw();

        bmw1.start();

    }

}
