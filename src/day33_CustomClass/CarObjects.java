package day33_CustomClass;

public class CarObjects {

    public static void main(String[] args) {


        Car car1 =  new Car();
        //Car ==> is reference to the class
        // car1 ==> is variable name
        // new ==> keyword to allocate memory to just created object
        // Car() ==> object


        System.out.println(car1.brand);// null now, because we have not initialized yet
        //instance variables == object variable...u can call them thru object name
        System.out.println(car1.model);// null still, no data there yet

        //we can  assign all like below:

        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2012;
        car1.color = "white";
        car1.mileage = 300000;

        System.out.println("My husband's car is "+car1.brand);
        System.out.println("The model of his car is "+car1.model);
        System.out.println("The year of the car is "+car1.year);
        System.out.println("Its color is "+car1.color);
        System.out.println("Its mileage is "+car1.mileage);

        System.out.println("==============================");

        Car car2 = new Car();

        car2.brand = "BMW";
        car2.model = "X5";
        car2.year = 2019;
        car2.color = "white";
        car2.mileage = 10000;

        System.out.println("The car I want is "+car2.brand);
        System.out.println("I want it to be "+car2.model);
        System.out.println("The year should be "+car2.year);
        System.out.println("I like my car to be color "+car2.color);
        System.out.println("My car should have mileage of "+car2.mileage);

       System.out.println("================================");

        car1.start();//will print object and it is function
        car2.start();

       System.out.println("=========================");

        car1.drive();
        car2.drive();

       System.out.println("=========================");

       car1.getInfo();

       System.out.println("===============================");

       car2.getInfo();

       System.out.println("===========================");

       Car car3 = new Car();

       car3.brand = "Mercedes";
       car3.model = "C class";
       car3.year = 2020;
       car3.color = "black";
       car3.mileage = 12000;

       car3.getInfo();
       car3.start();
       car3.drive();

       System.out.println("==============================");

       Car [] cars = {car1,car2,car3};
       //              0    1    2
       cars[0].getInfo();

       System.out.println("==============================");

       cars[1].getInfo();

       System.out.println("==============================");

       cars[2].getInfo();

    }
}
