package day12_Scanner_JavaRecap;
import java.util.Scanner;
public class areaOfCircle_Scanner {
    public static void main(String []args){
        /*
        1. write a program that can calculate the area of circle
                needed information:
                                    1. radius of the circle
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = scan.nextDouble();
        double areaOfCircle = radius*radius*3.4;
        System.out.println("The area of the circle is: "+ areaOfCircle);


    }
}
