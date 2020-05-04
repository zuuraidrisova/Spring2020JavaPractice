package day33_CustomClass;

public class CarObjects2 {

    public static void main(String[] args) {


        /*
        create 5 car objects , put them in array of cars, and use loop to print them
         */

        Car car1 = new Car();

        car1.brand = "Toyota";
        car1.model = "Rav4";
        car1.color = "black";
        car1.year = 2020;
        car1.mileage = 10000;


        Car car2 =  new Car();

        car2.brand = "Lexus";
        car2.model = "RX";
        car2.color = "black";
        car2.year = 2019;
        car2.mileage = 20000;


        Car car3 = new Car();

        car3.brand = "Mercedes";
        car3.model = "Classic";
        car3.color = "white";
        car3.year = 2018;
        car3.mileage = 100000;

        Car car4 = new Car();

        car4.brand = "Mini Cooper";
        car4.model = "Mini CountryMan";
        car4.color = "red";
        car4.year = 2019;
        car4.mileage = 50000;

        Car car5 = new Car();

        car5.brand = "Toyota";
        car5.model = "Camry";
        car5.color = "gold";
        car5.year = 2012;
        car5.mileage = 200000;


        Car [] cars = {car1, car2, car3, car4, car5};

        for(int i = 0; i < cars.length; i++){

            cars[i].getInfo();

        }

        System.out.println("===========================");

        for(Car each : cars){

            each.getInfo();
        }

        System.out.println("============================");







    }
}
