package day43_MethodOverriding;

public class Rectangle extends Shape {
    /*

     create sub classes of Shape:
                Circle
                rectangle
                square
     give the instance variables that are needed to calculate the Area,
      perimeter, of those shapes

     area => inherited
     perimeter => inherited
     calculateArea() => inherited
     calculatePerimeter() => inherited
     */

    public double length;
    public double width;

    public Rectangle(double length, double width){

        this.width = width;
        this.length = length;

    }
   //Formula to identify Area of the rectangle:  width * length
    @Override
    public void calculateArea(){

        area = width * length;
        System.out.println("Area of the Rectangle: "+area);
    }

    // Formula to identify Perimeter of rectangle: (width + length) * 2
    @Override
    public void calculatePerimeter(){

        perimeter = (width + length) * 2;
        System.out.println("Perimeter of the Rectangle: "+perimeter);
    }




}
