package WarmUp_Practices;

public class GreatestNumber_Ternary {
    public static void main(String []args){
        int number1 =4;
        int number2 =8;
        int number3 =1;
        String GreatestNumber = (number1 < number2 && number2>number3)? "The greatest number is: "+number2 :
                "The greatest number is "+number1;
        System.out.println(GreatestNumber);
    }
}
