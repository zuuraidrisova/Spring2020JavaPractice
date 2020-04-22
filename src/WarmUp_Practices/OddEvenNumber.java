package WarmUp_Practices;

public class OddEvenNumber {
    public static void main(String []args){
        int num1 =18;
        boolean EvenOrOdd = num1 %2==0;
        if(EvenOrOdd){
            System.out.println("It is en even number");
        }else{
            System.out.println("It's an odd number");
        }
        System.out.println("+=================+");
        int num2 = 15;
        String OddOrEven = (num2%2==0)?"It is even number":"It is an odd number";
        System.out.println(OddOrEven);

    }
}
