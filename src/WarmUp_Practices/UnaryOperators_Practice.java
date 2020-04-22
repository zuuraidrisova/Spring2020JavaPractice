package WarmUp_Practices;

public class UnaryOperators_Practice {

    public static void main(String []args){
        int x =2;
        int y= x++;
        System.out.println(y);
        System.out.println(x);
        System.out.println(--x);
        int x1 =8;
        int y1 =x1--;
        System.out.println(y1);

        int a =1;
        a =-a-- + a++ / -a-- * --a;
        System.out.println(a);

        int b =50;
        b =--b + b++ + b-- + b++;
        System.out.println(b);

        int c =4;
        int d = c*4 - c++;
        System.out.println(d);

        int evenNumber =198;
        boolean result =(evenNumber%2==0);
        System.out.println(result);

        byte w=30;
        int q = w+=w;
        System.out.println(q);

    }
}
