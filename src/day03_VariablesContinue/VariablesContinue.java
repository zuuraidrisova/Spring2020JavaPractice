package day03_VariablesContinue;

public class VariablesContinue {

    public static void main(String [] args){
        boolean result1 = true;
        boolean result2 = false;

        /*
        >: greater
		>=: greater or equal
		<: less
		<=: less or equal
		== : equal
		!= : not equal
         */
        boolean result3 = 10 >9; //true statement so it will return true

        System.out.println(true == false );

        System.out.println("Muhtar" == "Good Guy");
        System.out.println("Muhtar" != "Good Guy");

        boolean r1 = true != true;//false
        System.out.println(r1);

        boolean r2 = "batch 17" == "batch 18";
        System.out.println(r2);// false
        System.out.println("=======================");

        char ch1 = 'A';

        System.out.println(ch1); // A

        char ch2 = 45000;
        System.out.println(ch2);

        char ch3 = 25000;
        System.out.println(ch3);//character will be printed

        char ch4 = 100;
        System.out.println(ch4);

        char ch5 = 'D';
        System.out.println(ch5);

        int num1 = 'D';
        System.out.println(num1);// unicode num 68 is corresponding to D

        char a1 = 'z';
        System.out.println(a1);
        //byte b1=a1; //char is larger than byte

        //short s1 = a1; // char is larger than short
        int i1 = a1; // int is larger than char






    }

}
