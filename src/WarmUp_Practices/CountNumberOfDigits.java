package WarmUp_Practices;

public class CountNumberOfDigits {

    public static void main(String[] args) {

        int num = 123473154;
        int digits = 0;
        int count = 0;

        while(num > 0){

            digits  = num % 10;
            num =  num / 10;

            count++;
        }

        System.out.println(count);
    }
}
