package day46_Final_Abstract;

public class Square extends Shape {

    public double side;

    public Square(double side){

        this.side = side;
    }

    public void area(){

        double area = side * side;

        System.out.println("The Area of Square is: "+area);
    }



}
