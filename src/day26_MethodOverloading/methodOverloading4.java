package day26_MethodOverloading;

public class methodOverloading4 {

    //we can overload main method as well, but we need to change parameters or data type
   //the original main method will get executed thou

    public static void main(String[] args) {

        System.out.println("String");

    }

    public static void main(double[] args) {

        System.out.println("Double");

    }

    public static void main(int[] args) {

        System.out.println("Int");

    }
}
