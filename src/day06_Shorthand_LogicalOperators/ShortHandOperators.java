package day06_Shorthand_LogicalOperators;

public class ShortHandOperators {
    public static void main(String []args){
        //addition and concatenation
        int x =20;
        x +=10;// x=x+10 (30)
        System.out.println(x);
        x +=60; //x =x +60 (90)
        System.out.println(x);
        String schoolName = "Cybertek";
        schoolName+=12345;//concatenates
        System.out.println(schoolName);
        System.out.println('a'+'b');//97+98=195


        char ch1 ='a';//97
          ch1+='b';//98
        //char ch1 = 195;this num has character from ASCII
        System.out.println(ch1);//character

        int num ='z';//num z from Ascii is 122
          num+='x';//num = num(122)  +120
        //num num=242
        System.out.println(num);

        //substraction
        //x=20
        //x-=10 (10)--> x =x-10
        int A=100;
            A-=90;
        System.out.println(A);
        int B=200;
            B-=A;//B=B-A
        System.out.println(B);

        //multiplication
        //x =2;
        //x*=3; x=x*3 (6)
        int a =2;
           a*=3;
        System.out.println(a);

        int b = a*=10;//now a value is 6
        //b =a=a*10=60
        System.out.println(b);//60
        System.out.println(a);//60

        int a1 =100;//200
        int b1= (a1 *=2) + ++a1;//() grouping is important
        //b1=200+201
        //b1=401
        System.out.println(b1);

        int x1 =10;
        int y =x1+=10*2;//x1=x1+20
        System.out.println(y);

        int q=20;
        int p =q*=20*3;
        System.out.println(p);

        //division
        int num1 = 300;
            num1/=2;//num1=num1/2
        System.out.println(num1);

        int num2 = 400;
            num2 /=20+10;//num2=num2/30
        System.out.println(num2);

        int num3=300;
            num3 %=10+20;//num+=30
        System.out.println(num3);

        int n1=400;
            n1%=3*5;//n1%=15
        System.out.println(n1);









    }
}
