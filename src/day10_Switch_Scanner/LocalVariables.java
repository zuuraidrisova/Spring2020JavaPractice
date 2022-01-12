package day10_Switch_Scanner;

public class LocalVariables {
    public static void main(String []args){

        //local variables are variables declared within a block of code
        // declare variable: DataType variableName;
        int a = 2;//it can be used only within this block
        //local variables cannot be used outside of class and anywhere else
        //local variables must be initialized before use
        if(true){
            System.out.println(a);
            int b=10;

        }
       // System.out.println(b);//cannot be used outside its block {} so its not gonna print

        switch(3){
            case 1:
                int c =100;
            case 2:
              //  System.out.println(c);//the local varibale c belongs to case 1 so it is not gonna work

        }

        if(9>10){
            int t=100;
            System.out.println(t);
        }else if(11>10){
            int t =200;
        }else if(12>10){
            int t=300;
        }
        //System.out.println(t);//cannot be used outside, it is not gonna run

    }
}
