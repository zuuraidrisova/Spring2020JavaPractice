package InterviewQuestions;

public class oddEven {
    /*
    Write  a method which can identifies given number is even or odd

EX:

identify(5) ->  "Odd"

identify(6) ->  "Even"
     */
    public static void main(String[] args) {

        int a = 10;

        String b = identify(a);

        System.out.println(b);

        int n = 11;

        String c = identify1(n);

        System.out.println(c);

    }

    public static String identify(int num){

        if(num % 2 == 0){

            return "Even";

        }else{

            return "Odd";
        }
    }
    public static String identify1(int num){

       return (num % 2 != 0) ? "odd" : "even";
    }
}
