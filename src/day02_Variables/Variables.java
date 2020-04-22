package day02_Variables;

public class Variables {
    public static void main(String [] args){
        /*
        declare variables:
        Data type variableName = Data;
         */
        byte l =4;
        byte w =2;
        byte area = 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);

        // byte num1 = 130; wrong bcs exceeds the range of byte
        // byte num = 2.4; byte, short, int, long only accept whole numbers
        short num3 = 1000;
        System.out.println(num3);
        //short num4 = 400000; exceeds the range of short

        System.out.println(12345);//by default compiler takes it as int primitive
        int n1 = 20000;
        int n2 =100000000;
        System.out.println(n1);
        System.out.println(n2);

        //long n3 = 99999999999; out of int range
        long n4 = 300000000000000l; //by adding l we forcefully tell the compiler that is is not int but long data type
        System.out.println(n4);

        long n5 =19;

        //int num = 7; larger one cannot be assigned to smaller one
        // double>float>long>int>short>byte

        short s1 = 10;
        //byte b1 =s1;//short is larger than byte

        int i1=s1;
        //byte sb2 =i1; larger cannot be assigned to smaller one


        System.out.println(3.5);
        double d1 = 3.5;

        float f1 = 4.5f;
        //float f2 = 4.5; //double is larger than float, so we need f to forcefully declare it a float
        System.out.println(f1);
        System.out.println("==============================================");

        float pi = 3.14f;

        double pi2 = 3.14d;
        System.out.println(pi2);

        int a1 = 3000;
        double d2 = a1;
        System.out.println(d2);


    }

}
