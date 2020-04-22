package day07_IfStatements;
/*
1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
    Write a program that declares three integers as angles and check whether a triangle is valid or not.
 */
public class ValidTriangle {
    public static void main(String []args){
        short angle1 = 30;
        short angle2 =50;
        short angle3 =60;
        int sumOfAngles  = angle1 + angle2 + angle3;
        boolean ValidTriangle = sumOfAngles ==180;
        if (ValidTriangle){
            System.out.println("This is valid triangle.");
        }
        if(!ValidTriangle){
            System.out.println("This is not valid triangle");
        }


    }
}
