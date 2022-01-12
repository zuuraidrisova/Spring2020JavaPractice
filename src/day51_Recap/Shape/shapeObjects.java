package day51_Recap.Shape;

import java.util.ArrayList;
import java.util.Arrays;

public class shapeObjects {

    /*
      6. create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects
     */

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);

        Cylinder cylinder1 = new Cylinder(3.0,5);
        Cylinder cylinder2 = new Cylinder(2.5,4);

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.addAll(Arrays.asList(circle1,circle2,cylinder1,cylinder2));

        for(Shape each : shapes){

            System.out.println(each.name+" : "+each.calculateArea());
        }

        System.out.println("======================================================");

        double d  = ((Cylinder) shapes.get(2)).calculateVolume();
        //reference type is Shape, shape does not have the method, so downcasting works

        System.out.println(d);

        System.out.println("====================================================");

       // ((Cylinder)shapes.get(1)).calculateVolume();//must be IS A relation
        //circle cannot be referenced by cylinder
        //throws unchecked exception

        System.out.println("====================================================");

        Shape s1 = new Circle(6);

        System.out.println(( (Circle) s1 ).radius);

        Circle circle3 = (Circle) s1;

        System.out.println("====================================================");

        Shape shape1 = circle1; //upcasting --> automatically done

        Shape shape2 = new Cylinder(3,6);

        ( (Cylinder) shape2 ).calculateVolume();//downcasting, done manually

    }
}
