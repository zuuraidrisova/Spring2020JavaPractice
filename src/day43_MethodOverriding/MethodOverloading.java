package day43_MethodOverriding;

public class MethodOverloading {

    /*
Method Overloading:

        Same method name but different parameters,
        Return type can be same or different, no matter
        Access modifier can be same or different

     */
    public void add(int a , int b){

        System.out.println(a + b );

    }

    public void add(int a, int b, int c){

        System.out.println(a + b + c);
    }

    public double add(double a, double b){

        return a + b;
    }

    protected float add(float a, float b){

        return a + b;
    }

}
