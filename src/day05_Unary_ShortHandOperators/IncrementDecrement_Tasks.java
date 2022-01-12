package day05_Unary_ShortHandOperators;

public class IncrementDecrement_Tasks {
    public static void main(String []args){

        int a = 50;
        a = --a + a++ + a-- + a++;//197
        System.out.println(a);

        int x = 4;
        int y = x*4 -x ++;
        System.out.println(y);//12

        int b = 1;
        b = -b-- + b++ / -b-- * --b;
        //b = -1 + 0 / -1 * -1
        System.out.println(b);

        byte a9 = (byte) 200;
        double b9 = a/2.0  +  a++  +  --a *  a * 3  + 100;
        System.out.println(b9);

    }
}
