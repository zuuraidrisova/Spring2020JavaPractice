package day43_MethodOverriding;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);

        System.out.println(circle1.radius);//3

        circle1.calculateArea();//bug

        circle1.calculatePerimeter();//bug

        // radius * radius * 3.14;

        System.out.println("=====================================");

        Rectangle rectangle1 = new Rectangle(3,2);

        System.out.println(rectangle1.length);//3
        System.out.println(rectangle1.width);//4

        rectangle1.calculateArea();//bug
        rectangle1.calculatePerimeter();//bug

        // width * length;

        System.out.println("=====================================");

        Square square1 = new Square(6);

        System.out.println(square1.side);//7

        square1.calculateArea();//bug
        square1.calculatePerimeter();//bug

        // side * side;

    }
}
