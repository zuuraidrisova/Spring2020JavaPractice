package day46_Final_Abstract;

public class Triangle extends Shape {

    public double base;
    public double height;

    public Triangle(double base, double height) {

        this.base = base;
        this.height = height;

    }

    @Override
    public void area(){

        double area = base * height  * 1/ 2;

        System.out.println("The Area of Triangle is: "+area);
    }
}
