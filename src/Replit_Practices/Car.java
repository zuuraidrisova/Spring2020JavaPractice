package Replit_Practices;

public class Car {
    /*
     1. Complete the Car.java class:

Include the following class variables:
* make
* model
* numberOfDoors
* topSpeed
* price
All class variables should be declared case sensitive

Write four constructors:
* The main constructor that can initialize all variables
* A secondary constructor that does not include numberOfDoors, which should default to 4
* A secondary constructor that does not include make and model; both default to "unknown"
* A secondary constructor that does not include topSpeed or price; default to 90 and 0
 respectively.
     */
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    int price;

    public Car(String make, String model, int numberOfDoors, int topSpeed, int price){

        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;

    }

    public Car(String make, String model,int topSpeed, int price){

        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;
        numberOfDoors = 4;

    }
    public Car(int numberOfDoors, int topSpeed, int price){

        this.numberOfDoors = numberOfDoors;
        this.price = price;
        this.topSpeed = topSpeed;
        make = "unknown";
        model = "unknown";

    }
    public Car(String make, String model, int numberOfDoors){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        topSpeed = 90;
        price = 0;

    }
}
