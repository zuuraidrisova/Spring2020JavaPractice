package day05_Unary_ShortHandOperators;

public class UnaryOperators {
    public static void main(String []args){
        int a = 10;// positive 10
        int a1 = +a;//+ this is not necessary, by default it is already positive
        System.out.println(a);
        System.out.println(a1);

        int a2 = -10;
        boolean result = a2 > 0;
        boolean result2 = a2 < 0;
        System.out.println(a2);
        System.out.println(result);
        System.out.println(result2);

        int x1 =-10;
        int y1 =-x1;
        //negative to negative makes it positive
        System.out.println(y1);//10

        int x2 =+20;
        int y2 = -x2;
        //negative and positive makes it negative
        System.out.println(y2);//-20

        int x3 =+20;
        int y3 = +x3;
        //positive to positive makes it positive
        System.out.println(y3);

        int z =100;
        System.out.println(++z);//101, increases the value by 1 immediately
        System.out.println(z);
        int z1 =100;
        System.out.println(--z1);//99, decreases the value by 1 immediately
        System.out.println(z1);


        int P=  100;
        System.out.println(P++);//100, first passes the current value
        System.out.println(P);//101, now it is value increased
        int P1 =100;
        System.out.println(P1--);//100, first passes the current value
        System.out.println(P1);//99, now decreases the value by one

    }
}
