package day05_Unary_ShortHandOperators;

public class PrimitiveCasting {
    public static void main(String []args){
        //implicit casting, done automatically
        // small primitive to large
        int a =10;
        long b =a;
        //b=10L //implicit casting is done automatically
        int a1 =100;
        long b1 = (long)a1;// u can cast manually as well with (), it is not needed tho
        System.out.println(b);
       // int c =b1; //compile error, b1 is long now
       // int c1 =b1;

        //explicit casting
        //large primitive to small primitive, done manually
        //casting has to be same or smaller than data type
        int num=100;
        byte num2 = (byte)num;

        short num3 =(short)num;
        short num4 =(byte)num;

        double num5 =5.5;
        float num6 = (int)num5;
        //num6 =(int) 5.5
        //num6 =5;
        //num6 =5.0;
        System.out.println(num6 + 1);

        double d1 =10.5;
        long l1 =(long)d1;
        long l2 =(int)d1;//10
        System.out.println(l1);

        float f2 =60.5f;
        int i1 = (int) f2;// java prefers casting to the same data type ex: int to int

        long LargeNum = 99999999999l;
        int intNum =(int) LargeNum;
        System.out.println(intNum);

        int A = 100;
        short B = (byte)A;
        System.out.println(B);

        char ch1 ='A';
        short sh1=(short) ch1;
        System.out.println(sh1);

        char ch2 = 23456;
        double dbl1 =ch2;
        System.out.println(dbl1);// 23456.0

        int z1 = 10;
        double t1 =z1;//implicit casting automatically
        short s1 =(short)z1;//explicit casting manually





    }
}
