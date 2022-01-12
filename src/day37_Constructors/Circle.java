package day37_Constructors;

public class Circle {

    /*
    Create a class called Circle
            instance variables:
                    radius, pi, diameter
            add a constructor that can initialize the radius of the circle
            instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): can return the perimeter of the circle as double
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

        return pi * (radius * radius);

    }

    public double perimeter(){

        return  diameter * radius * pi;

    }

    public String toString(){

        return "The area of circle is : "+ area() +
                "\nThe perimeter of circle is: "+perimeter();
    }


}

class Area{

    public static void main(String[] args) {

        Circle object1 = new Circle(3);

        System.out.println(object1);

    }
}
