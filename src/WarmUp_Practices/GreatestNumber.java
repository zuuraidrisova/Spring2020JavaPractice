package WarmUp_Practices;

public class GreatestNumber {
    public static void main(String []args){
        int number1 =4;
        int number2 =8;
        int number3 =1;
        boolean GreatestNumber = number1 < number2 && number2>number3;
        if(GreatestNumber){
            System.out.println("The Greatest Number is: "+ number2);
        }
        if(!GreatestNumber){
            System.out.println("The greatest number is: "+ number1);
        }
    }
}
