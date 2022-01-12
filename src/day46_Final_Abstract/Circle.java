package day46_Final_Abstract;

public final class Circle extends Shape {

    public double radius;
    public final  static double pi = 3.14;

    public Circle(double radius){

        this.radius = radius;
    }

    @Override
    public  void area(){

        double area = radius * radius * pi;

        System.out.println("The Area of Circle is: "+area);
    }


}
