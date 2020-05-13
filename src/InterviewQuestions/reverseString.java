package InterviewQuestions;

public class reverseString {

    public static void main(String[] args) {

        /*
        Write a return method that can reverse  String

Ex: Reverse("ABCD"); ==> DCBA
         */

        String str = "ABCD";

        String reverse = reverse(str);

        System.out.println(reverse);
    }
    public static String reverse(String str){

        String reverse = "";

        for(int i = str.length()-1; i >= 0; i--){

            reverse += str.charAt(i);
        }

        return reverse;
    }
}
