package day04_JavaRecap;

public class ArithmeticOperators {

    public static void main(String []args){
        int a = 10/3;////we need exact value 3.3333
        System.out.println(a);
        double a1 = 10/3;
        System.out.println(a1);
        double d = 10/4;
        System.out.println(d);//d =2.0
        double d1 = 10.0/4;
        System.out.println(d1);//2.5
        System.out.println(10/4.0);//2.5
        float f1 =10/4f;//now it gives 2.5
        System.out.println(f1);
        //10/4=2.5 what it should give, but it gives 2.0

        //remainder: numerator -(denominator*result of whole number)
        //10/4= 2.5....0.5 is remainder
        //remainder 10-(4*2) =2
        System.out.println(10%4);


        boolean evenNumber = 25%2 ==0;
        //if 25/2 has a remainder of 0, it is even number
        System.out.println(evenNumber);
        System.out.println(25%2);

        boolean oddnumber =22%2 != 0;
        System.out.println(oddnumber);//false
        //0!=0  false, bcs it is equal to

        System.out.println(10%2==0);

        System.out.println("10 is even number "+ (10%2 == 0));
        System.out.println("11  is even number "+ (11%2 ==0));
        System.out.println("25 is odd number "+ (25%2 != 0));
        System.out.println("25 is even number "+ (25%2 == 0));//
        System.out.println("25 is even number "+ !(25%2 != 0));//
    }
}
