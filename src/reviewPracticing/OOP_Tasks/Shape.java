package reviewPracticing.OOP_Tasks;

public class Shape {
    /*
            1. create a class called Shape
        vairables: area,
        perimeter
        methods:
        calculateArea(), calculatePerimeter()

        2. create sub classes of Shape:
        Circle
        Rectangle
        Square

         give the instance variables that are needed
        to calculate the Area, perimeter, of those shapes

         Area of the circle:    3.14 * radius * radius
                Area of the rectangle:  width * length
                Area of the square:    side * side
                Perimeter of circle:   3.14 * 2 * radius
                Perimeter of rectangle: (width + length) * 2
                Perimeter of Square: 4 * side

        //create constructor to initialize instance variables in each class

             */

    public double area;
    public double perimeter;

    public void calculateArea(){

        System.out.println("The area of shape is "+area);
    }

    public void calculatePerimeter(){

        System.out.println("The perimeter of shape is "+perimeter);
    }

}
class Rectangle extends Shape{

    //Area of the rectangle:  width * length
    //Perimeter of rectangle: (width + length) * 2

    public double width;
    public double length;

    public Rectangle(double width, double length){

        this.width = width;
        this.length = length;
    }

    @Override
    public void calculateArea(){

        area = width * length;
        System.out.println("The area of rectangle is "+area);
    }

    @Override
    public void calculatePerimeter(){

        perimeter = (width + length) * 2;
        System.out.println("The perimeter of rectangle is "+perimeter);
    }

}

class Square extends Shape{

    // Area of the square:    side * side
    //  Perimeter of Square: 4 * side

    public double side;

    public Square(double side){

        this.side = side;
    }

    @Override
    public void calculateArea(){

        area = side * side;
        System.out.println("The area of square is "+area);

    }

    @Override
    public void calculatePerimeter(){

        perimeter = side * 4;
        System.out.println("The perimeter of square is "+perimeter);
    }

}

class Circle extends Shape{

    // Area of the circle:    3.14 * radius * radius
    //Perimeter of circle:   3.14 * 2 * radius
    public static double pi = 3.14;
    public double radius;

    public Circle(double radius){

        this.radius = radius;
    }

    @Override
    public void calculateArea(){

        area = radius * radius * pi;
        System.out.println("The area of circle is "+area);

    }

    @Override
    public void calculatePerimeter(){

        perimeter = radius * 2 * pi;
        System.out.println("The perimeter of circle is "+perimeter);

    }

}

class ShapeObjects{

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4,4);

        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Circle circle = new Circle(5);

        circle.calculateArea();
        circle.calculatePerimeter();

        Square square = new Square(2);

        square.calculateArea();
        square.calculatePerimeter();
    }
}