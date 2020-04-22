package OfficeHours.Practice_18_03_2020;

public class Unary_Operators_Practice {
    public static void main(String[]args){
        //post increment and decrement
        //first passing the current value , then increase or decrease
        int a = 20;
        System.out.println(a++);//20
        System.out.println(a);

        int b=30;
        int c = b--; //c=30.b 29
        System.out.println(b);//29
        System.out.println(c);//30

        int d =40;
        int e= d++;//e=40, d=41
        System.out.println(e);//40
        System.out.println(d);//41

        //pre increment/ decrement
        //it increases/decreases the value immediately
        int x =200;
        System.out.println(++x);//201
        System.out.println(--x);//200

        int z= 100;
        z= z++ + --z - -z-- + ++z;//101,100,99,100==>200
        //100 + 100 - 100 + 100;//200
        System.out.println(z);

        int u = 900;//901,902,903
        int r = - ++u + ++u + -u++;
           //r=  -901 + 902 + -902;
            //r=1+ -902
        System.out.println(r);
        System.out.println(u);
    }
}
