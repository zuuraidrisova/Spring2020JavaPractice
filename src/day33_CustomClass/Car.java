package day33_CustomClass;

public class Car {

    String brand; // object variable; instance variable, we dont have to initialize
    String model;
    String color;
    int year;
    double mileage;


    public void start(){

        System.out.println(brand +" "+model+ " is started");
    }

    public void drive(){

        System.out.println("Driving "+brand+" "+model);
    }

    public void getInfo(){

        System.out.println(year+" "+brand+" "+model+" "+color+" "+mileage);

    }




    public static void main(String[] args) {

        int a = 100; // a is local variable, we have to initialize


    }
}
