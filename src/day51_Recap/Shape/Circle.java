package day51_Recap.Shape;

public final class Circle extends Shape implements PI {
    /*
        4. create a final class named circle that can inherit from Shape and PI
                variable: radius
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius

            Area of Circle = PI * radius * radius
            Perimeter of Circle = 2 * radius * PI
     */

    public double radius;

    public Circle(double radius){

        this.name = "Circle";
        this.radius = radius;
    }

    @Override
    public double calculateArea(){

       double areaOfCircle = PI * radius * radius;

       return areaOfCircle;

    }

    @Override
    public double calculatePerimeter(){

        double perimeterOfCircle = 2 * radius * PI;

        return perimeterOfCircle;

    }

}
