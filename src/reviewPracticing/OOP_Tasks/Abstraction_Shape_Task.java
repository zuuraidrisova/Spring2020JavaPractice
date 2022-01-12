package reviewPracticing.OOP_Tasks;

public abstract class Abstraction_Shape_Task {
    /*
    ex2:
    Shape: ==> generic class
        area(); ==> marked abstract, without body

    Triangle:
        area(); ==> base * height * 1/2

    Circle:
        area(); ==> radius * radius *pi;

    Square:
        area(); ==> side * side

     */

    public abstract void area();

}

class Triangle extends Abstraction_Shape_Task{

    public double base;
    public double height;

    public Triangle(double base, double height){

        this.base = base;
        this.height = height;
    }

    @Override
    public void area(){

        System.out.println(base * height * 1/2);
    }
}

class Squares extends  Abstraction_Shape_Task{

    public double side;

    public Squares(double side){

        this.side = side;
    }

    @Override
    public void area(){

        System.out.println(side * side);
    }
}

class Circ extends Abstraction_Shape_Task{

    public final static double pi = 3.14;
    public double radius;

    public Circ(double radius){

        this.radius= radius;
    }

    @Override
    public void area(){

        System.out.println(radius * radius * pi);
    }
}

class Rectang extends Abstraction_Shape_Task{

    public double width;
    public double length;

    Rectang(double width, double length){

        this.width = width;
        this.length = length;
    }

    @Override
    public void area(){

        System.out.println(width * length);
    }
}

class shapeObjects{

    public static void main(String[] args) {

        Triangle tr = new Triangle(3,6);

        tr.area();

        Circ cr = new Circ(2);

        cr.area();

        Rectang rc = new Rectang(2,4);

        rc.area();

        Squares sq = new Squares(4);

        sq.area();

    }
}