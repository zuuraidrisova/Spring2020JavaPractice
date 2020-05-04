package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects3 {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setCarInfo("BMW","S class","white",2020);
        // i can set info giving parameters

        car1.getInfo();
        //printing data of car 1

        System.out.println("================================");

        Car car2 = new Car();

        car2.setCarInfo("Toyota","Corolla","black",2020);

        car2.getInfo();

        System.out.println("===========================");

        Car car3 = new Car();

        car3.setCarInfo("Audi","Q7","gray",2019);

        car3.getInfo();

        System.out.println("=============================");

        Car [] cars = {car1, car2, car3};

        for(int i = 0; i < cars.length; i++){

            cars[i].getInfo();
        }

        System.out.println("==============================");

        for(Car each : cars){

            each.getInfo();

        }
        System.out.println("=========================================");

        System.out.println(car1);

        System.out.println("=========================================");


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        // toString() : method gets executed automatically

        System.out.println(list);













    }
}
