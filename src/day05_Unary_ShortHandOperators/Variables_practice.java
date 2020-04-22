package day05_Unary_ShortHandOperators;

public class Variables_practice {
    public static void main(String []args){
        //whole numbers: long, int, short, byte
        //decimals: double, float
        int a1 =100;
        float f1 =(long)a1;
        //f1 =100;//100.0
        System.out.println(f1);
        long l1 = (long) f1;
        // l1 =100;
        
        
        //local variables
        String name;
        //System.out.println(name);
        name ="Cybertek";//in java first come first served
        System.out.println(name);



    }

}
