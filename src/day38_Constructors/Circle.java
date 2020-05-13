package day38_Constructors;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
    /*
     Create a class called Circle
            instance variables:
                    radius, pi, diameter
            add a constructor that can initialize the radius of the circle
            instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): cna return the perimeter of the circle as double
                    toString(): returns the info of the circle
            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r
     */
    double radius;
    static double pi = 3.14;
    double diameter;

    public Circle(double radius){

       this.radius = radius;
       this.diameter = radius * 2;

    }

    public  double area(){

        return pi * radius * radius;
    }

    public double perimeter(){

        return diameter * radius * pi;
    }

    public String toString(){

        return "radius of the circle is: "+radius+", area of circle is: "
                +area()+", perimeter of circle is: "+perimeter();

    }

}

class CircleObject{

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        //df.format() --> to round to second 00

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = scan.nextDouble();

        Circle circle1 = new Circle(radius);


        System.out.println(circle1);

        System.out.println("=====================================");

        System.out.println(df.format(circle1.area()));// df.format() --> to round to second 00
        System.out.println(df.format(circle1.diameter));
        System.out.println(df.format(circle1.perimeter()));

    }
}