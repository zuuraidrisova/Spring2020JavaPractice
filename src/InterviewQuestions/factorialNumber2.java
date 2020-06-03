package InterviewQuestions;

public class factorialNumber2 {

    public static void main(String[] args) {

        long result = 1l;

        for(int i = 1; i <= 5; i++){

            result = result * i;
        }

        System.out.println(result);
    }
}
