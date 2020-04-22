package day04_JavaRecap;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class PrimitivePractice {

    public static void main (String []args ){
        //Data Type VariableName = Data;
        byte num1 = 127;
        short num2 = num1; //double>float>long>int>short>byte
        //byte num3 =num2; byte is too short to contain short

        int num4 = num2;
        long num5 = 99999999999l; // int ir preferred by java
        float num6 = 100l;

        System.out.println(num6);

        float num7 = 0.5f;
        System.out.println(num7);
        double num8 = 0.5f;//double can store float
        double num9 = 999999999l;//double can store long numbers
        double num10 = 100.5;//double is the largest
        System.out.println(num10);

        char ch1 = '$';//every single character has its own corresponding number
        System.out.println(ch1);
        char ch2 = 2500;
        System.out.println(ch2);
        int a1 = '8';
        System.out.println(a1);
        int a2 = 'z';
        System.out.println(a2);
        double d1 = 'z'+'8';
        System.out.println(d1);

        char ch3 = 178;
        System.out.println(ch3);
        char a4= 'z' + '8';
        System.out.println(a4);

        boolean bool1 = true;
        boolean bool2 = false;
        /*
        > : greater
				>= : greater or equal
				< : less
				<= : less or equal
				== : equal
				!= : not equal
				! : opposite
         */

        System.out.println(9>10);//false
        System.out.println(9>=9);//true
        System.out.println(9!=10);//true
        System.out.println('a'=='b');//false
        System.out.println('a'=='b'-1);//true, bcs they have corresponding numbers
        //System.out.println('a'=="b");// " does not match with '
        System.out.println("Zuura" == "Cuba");//false, they are not same
        System.out.println("Cuba" == "Good Guy");

        boolean r1 = !true;
        System.out.println(r1);
        System.out.println(!r1);







    }
}
