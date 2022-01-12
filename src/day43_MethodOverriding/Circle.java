package day43_MethodOverriding;

public class Circle extends Shape {

    /*
     create sub classes of Shape:
                Circle
                rectangle
                square
     give the instance variables that are needed to calculate the Area,
      perimeter, of those shapes
     */

    public double radius;
    public static double pi = 3.14;//number PI is  global, so we declare it as static

    // we can create constructor to initialize on object
    //constructor is used to create an object, so we can initialize our instance
    //variable as soon as we create

    public Circle(double radius){

        this.radius = radius;

    }

    // formula to identify  Area of the circle:    3.14 * radius * radius
    @Override
    public void calculateArea(){

        area = radius * radius * pi;
        System.out.println("Area of the Circle: "+area);

    }

    //formula to identify  Perimeter of circle:   3.14 * 2 * radius
    @Override
    public void calculatePerimeter(){

       perimeter =  radius * 2 * pi;

        System.out.println("Perimeter of the Circle: "+perimeter);
    }

}
