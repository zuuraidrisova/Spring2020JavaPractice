package day51_Recap.Shape;

public abstract class Shape {
    /*
     1. create an abstract class named Shape
            variables: name(static)
            abstract methods: calculateArea(), calculatePerimeter();
                    both methods return double
     */
    public String  name;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}
