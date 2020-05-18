package day39_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class Car {
    /*
    create a class called Car:
				instance variable:
						brand, model, year, price
				add a constructor that can initialize brand of car
				add a constructor that can initialize brand and model of the car
								(apply constructor call to initalize the brand)
				add a constructor that can initialize the brand, model, year of the car
								(apply constructor call to initialize brand, model)
				add a constructor that can initialize brand, model, year and price of the car
								(apply constructor call to initialize brand, model, year)
				add toString method

				this is called chain rules
     */
    String brand;
    String model;
    int year;
    double price;

    public Car(String brand ){

        this.brand = brand;

    }
    public Car(String brand,String model){

        this(brand);
        this.model = model;

    }
    public Car(String brand, String model, int year){

        this(brand, model);
        this.year = year;

    }
    public Car(String brand, String model, int year, double price){

        this(brand, model, year);
        this.price = price;

    }

    public String toString(){

        return "Brand: "+brand+", Model: "+model+", Year: "+year+", Price: "+price;
    }
}

class CarObject{

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");

        System.out.println(car1);// only brand will be initialized, other variables will get default values

        Car car2 = new Car("Toyota", "Camry");

        System.out.println(car2);//only brand and model will be initialized
        //other instance variables will get default values

        Car car3 = new Car("Toyota", "Camry", 2020);

        System.out.println(car3);//only brand and model and year will be initialized
        //other instance variables will get default values

        Car car4 = new Car("Toyota", "Camry", 2020, 35000);

        System.out.println(car4);// we initialized all instance variables so no default values

        System.out.println(car4);

        System.out.println("==================================");

        ArrayList<Car> cars = new ArrayList<>();

        cars.addAll(Arrays.asList(car1, car2,car3, car4));

        for(int i = 0; i < cars.size(); i++){

            System.out.println(cars.get(i));
        }

        System.out.println("======================================");

        for(Car each: cars){

            System.out.println(each.model);
        }
    }
}