package day43_MethodOverriding;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);

        System.out.println(circle1.radius);//3

        circle1.calculateArea();

        circle1.calculatePerimeter();

        // radius * radius * 3.14;

        System.out.println("=====================================");

        Rectangle rectangle1 = new Rectangle(3,2);

        System.out.println(rectangle1.length);//3

        System.out.println(rectangle1.width);//4

        rectangle1.calculateArea();

        rectangle1.calculatePerimeter();

        // width * length;

        System.out.println("=====================================");

        Square square1 = new Square(6);

        System.out.println(square1.side);//7

        square1.calculateArea();

        square1.calculatePerimeter();

        // side * side;

    }
}
