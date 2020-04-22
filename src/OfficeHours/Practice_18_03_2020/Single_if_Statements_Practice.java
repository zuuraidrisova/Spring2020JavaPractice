package OfficeHours.Practice_18_03_2020;

public class Single_if_Statements_Practice {
    public static void main(String []args){
        /*single if statement
      to specify a block of Java code
      to be executed if a condition is true.
         */
        int a =100;
        int b =200;
        boolean aGreater = a>b;
        boolean bGreater = b>a;
       // boolean aEqualb = a==b;
        //boolean aEqualb = aGreater ==false && bGreater==false;
        boolean aEqualb = aGreater == bGreater;//one of boolean expressions are ok
        if(aGreater){
            System.out.println(a +" is greater number");
        }
        if(bGreater){
            System.out.println(b+" is greater number");
        }
        if(aEqualb){
            System.out.println(a+ " is equal to "+ b);
        }

    }
}
