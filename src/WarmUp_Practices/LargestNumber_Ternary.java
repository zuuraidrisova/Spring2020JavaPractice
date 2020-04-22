package WarmUp_Practices;

public class LargestNumber_Ternary {
    public static void main(String []args){
        int num1 =22288;
        int num2 =900000;
        int num3 =8876;
        String LargestNumber = (num1>num2 && num1>num3)?"Largest number is "+num1
                                :(num2>num1 && num2>num3)?"Largest number is "+num2
                                :"Largest number is "+num3;
        System.out.println(LargestNumber);
    }
}
