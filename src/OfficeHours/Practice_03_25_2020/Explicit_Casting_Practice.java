package OfficeHours.Practice_25_03_2020;

public class Explicit_Casting_Practice {
    public static void main(String []args){
        byte bNum = 100;
        short sNum = bNum;//implicit casting done automatic
        //because any smaller primitive types can always be assigned to larger types
        int iNum = 200;
        short num = (short)iNum;////Explicit casting MUST BE done manually
        //because larger data types to smaller ones must be assigned manually

        float fNum = (float)0.5;
        System.out.println(fNum);//0.5
        float fNum2 = (long)0.5;
        System.out.println(fNum2);//0.0

        //long, int, short, byte ==>only accept whole numbers
        long lNum = (long)4.5;//cannot be assigned to float and double
        System.out.println(lNum);//4
        System.out.println(9/2);//it will return 4 , bcs int/int
        System.out.println(9/2.0);//it will return 4.5, bcs whole number/ decimal
        System.out.println(9.0/2);//it will return 4.5, bcs decimal to whole number

        System.out.println(10.0/3);//will return 3.333 bcs decimal/whole number
        System.out.println(10/3.0);//will return 3.333 bcs whole number/decimal
        System.out.println(10/3);//will return 3, bcs int/int






    }
}
