package day43_MethodOverriding;

public class Square extends Shape {

    /*
     create sub classes of Shape:
                Circle
                rectangle
                square
     give the instance variables that are needed to calculate the Area,
      perimeter, of those shapes
     */

    public double side;

    public Square(double side){

        this.side = side;
    }

    //Formula to identify the Area of the square:    side * side
    @Override
    public void calculateArea(){

        area = side * side;
        System.out.println("Area of the Square: "+area);
    }

    //Formula to identify the Perimeter of Square: 4 * side
    @Override
    public void calculatePerimeter(){

        perimeter = side * 4;
        System.out.println("Perimeter of the Square: "+perimeter);
    }

}
