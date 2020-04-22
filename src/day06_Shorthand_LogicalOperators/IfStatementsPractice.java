package day06_Shorthand_LogicalOperators;

public class IfStatementsPractice {
    public static void main(String []args){
        int a =100;
        int b =200;
        if(a>b){//false, so statement is not going to get executed
            System.out.println(a+ "is greater than "+ b);
        }
        if(b>a){//true, so statement will be printed
            System.out.println(b+" is greater than "+a);
        }
        if(a==b){//false, because they are not equal
            System.out.println(a+ " is equal to "+b);
        }
        //if (a>b && b<a && a==b){}
        System.out.println("+=========================+");
        int x =200;
        int y =300;
        boolean xGreater =x>y;
        boolean yGreater =x<y;
        if(xGreater){
            System.out.println(x+ " is greater than "+ y);
        }
        if(yGreater){
            System.out.println(y+ " is greater than "+ x);
        }
        if(!xGreater && !yGreater){
            System.out.println(x+" is greater than "+y);
        }
    }
}
