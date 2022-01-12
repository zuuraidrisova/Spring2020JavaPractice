package reviewPracticing;

public class Car {

    String model;
    String brand;
    double mileage;
    int year;
    String color;

    public void start(){

        System.out.println(brand+" "+model+" is starting");
    }

    public void drive(){

        System.out.println(brand+" is driving");
    }

    public void getInfo(String brand, String model, double mileage, int year, String color){

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;

    }

    public String toString(){

        String result = year+" "+brand+" "+model+" "+color;

        return result;
    }


}

class CarObjects {

    public static void main(String[] args) {

              /*
            create 5 car objects , put them in array of cars, and use loop to print them
             */

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.getInfo("toyota","camry",18396,2020, "white");
        car2.getInfo("toyota","prius",100000,2000, "black");
        car3.getInfo("toyota","rav4",76000,2010, "red");
        car4.getInfo("lexus","c100",10000,2012, "gold");
        car5.getInfo("toyota","camry",25000,2008, "black");

        Car [] cars = {car1,car2,car3,car4,car5};

        for (Car each : cars){

            System.out.println(each);
        }

        for (int i = 0; i < cars.length; i++){

            cars[i].start();
        }

        for (Car each: cars){

            each.drive();
        }

    }
}