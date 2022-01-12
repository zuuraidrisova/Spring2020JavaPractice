package day37_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

       Car car1 = new Car("BMW","i8",2020,14000);
       Car car2 = new Car("Toyota","Camry", 2016,17500);
       Car car3 = new Car("Porsche","Taycan", 2022, 20020 );

        ArrayList<Car> listCars =  new ArrayList<>();

        listCars.addAll(Arrays.asList(car1,car2,car3));

        for(Car each : listCars){

            System.out.println(each.brand);
            System.out.println(each.model);
            System.out.println(each.year);
        }

    }
}
