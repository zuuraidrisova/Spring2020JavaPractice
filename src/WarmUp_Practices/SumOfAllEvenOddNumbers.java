package WarmUp_Practices;

public class SumOfAllEvenOddNumbers {
    public static void main(String[] args) {


        int sum =0;
        for(int i = 0; i <= 100; i+=2){
            sum += i+i;
        }
        System.out.println("sum of all even numbers: "+sum);

        int sumOdd = 0;

        for(int i = 0; i <= 100; i+=3){
            sumOdd+= i+i;
        }

        System.out.println("sum of all odd numbers: "+sumOdd);




    }


}
