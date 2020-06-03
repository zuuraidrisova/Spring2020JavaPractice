package day43_MethodOverriding;

public class Shape {

    /*
    create a class called ShapeActions:
                methods: calculateArea(), calculatePerimeter()
     */

    public double area;
    public double perimeter;


    public void calculateArea(){

        System.out.println("Area of the shape: "+area);


    }
    public void calculatePerimeter(){

        System.out.println("Perimeter of the shape: "+perimeter);
    }
    /*
                Area of the circle:    3.14 * radius * radius
                Area of the rectangle:  width * length
                Area of the square:    side * side
                Perimeter of circle:   3.14 * 2 * radius
                Perimeter of rectangle: (width + length) * 2
                Perimeter of Square: 4 * side


     */


}
