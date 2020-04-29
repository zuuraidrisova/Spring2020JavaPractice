package OfficeHours.Practice_03_18_2020;

public class Short_Hand_Operators_Practice {
    public static void main(String []args){
        //+=:addition assignment
        int a =100;
        a+=200;//a=a+200; a=300
        System.out.println(a);
        a+=200*3;//a=a+200*3; a=900;
        System.out.println(a);

        //-=:subtraction assignment
        a=a-400;//a-=400; a=500;
        System.out.println(a);

        int b =300;
        b-=3*40;//b=300-3*40==>b=300-120;--> b=180;
        System.out.println(b);

        //*=: multiplication assignment
        int x =5;
        x*=3;//x=x*3-->x=15;
        System.out.println(x);

        x*=2+1;//x=x*3
        System.out.println(x);

        // /=:division assignment
        int n1 = 900;
        n1/=3;//n1=n1/3; n1=300;
        System.out.println(n1);

        n1/=3*5;//n1=n1/15--> n1=20;
        System.out.println(n1);

        // %=: remainder assignment
        //remainder: numerator-(denominator* whole number of result);
        int n =10;
        n %= 3;//n=n%3; n=1;
        System.out.println(n);

        int y=300;
        y%=3*5;//y=y%15; y=0;
        System.out.println(y);

        int t=400;
        t%=10*2; //t=t%20; t=0;
        System.out.println(t);





    }
}
