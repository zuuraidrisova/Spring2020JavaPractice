package day05_Unary_ShortHandOperators;

public class PostPre {
    public static void main(String []args){
        //pre: it changes the value immediately
        int a=100;
        System.out.println(++a);//101
        System.out.println(a);//101
        int b = 100;
        System.out.println(--b);//99
        System.out.println(b);//99
        //Post: first passes the current value, and then increases the value or  the decreases the value
        int c =100;
        System.out.println(c--);//100, now it passes the current value
        System.out.println(c);//99,now it decreases the value by one

        //porst&pre examples:
        int z =10;
        int x = ++z;
        System.out.println(x);//11
        System.out.println(z);//11
        int s = 10;
        int f = s++;
        System.out.println(f);
        System.out.println(s);

        double t1 = 3.5;
        double t2 = t1 --;//3.5
        System.out.println(t2);
        System.out.println(t1);

        int i =25;
        System.out.println(i++);//25, post increment will pass the current num
        System.out.println(i--);//26, the current value again
        System.out.println(i);//25





    }
}
