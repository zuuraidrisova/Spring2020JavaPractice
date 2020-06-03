package day46_Final_Abstract;

public class Rectangle extends Shape {

    public double width;
    public double length;

    public Rectangle(double width, double length){

        this.width = width;
        this.length = length;

    }

    @Override
    public void area(){

        double area = width * length;

        System.out.println("The Area of Rectangle is: "+area);
    }

}
