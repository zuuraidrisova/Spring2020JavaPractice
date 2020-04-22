package WarmUp_Practices;

public class LogicalOperators_Practice {
    public static void main(String []args){
        int num1 = 5;
        int num2 = 33;
        boolean output = num1>num2;
        if(output){
            System.out.println(num1+ " is greater than "+ num2);
        }
        if(!output){
            System.out.println(num2+ " is greater than "+num1);
        }
    }
}
