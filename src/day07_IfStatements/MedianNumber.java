package day07_IfStatements;

/*
	4. write a java program that accepts three numbers and rteurn the mediam number
				(assume that none of them are equal)
 */
public class MedianNumber {
    public static void main(String []args){
        double x =10000000;
        double y =20000;
        double z =35600;
        boolean xMedian = (x>y && x<z) || (x<y && x>z);
        boolean yMedian = (y>x && y<z) || (y<x && y>z);
        boolean zMedian = (z>x && z<y) || (z<x && z>y);
        if(xMedian){
            System.out.println(x+ " is median number");
        }
        if(yMedian){
            System.out.println(y+" is median number");
        }
        if(zMedian){
            System.out.println(z+ " is median number");
        }
    }
}
