package day24_MethodsContinue;

public class StringReverseReturn {

    public static void main(String[] args) {


        String str = reverse("word");//this we can assign to matching data type bcs it is return

        System.out.println(str);

        reverse2("word");//we cannot assign this bcs it is void
    }

    public static String reverse(String reverse){

        String reversed = "";

        for(int i = reverse.length()-1; i >= 0; i--){

            reversed += reverse.charAt(i);
        }

        return reversed;
    }

    public static void reverse2(String word2){

        String result = "";

        for(int i = word2.length()-1; i >= 0; i--){

            result += word2.charAt(i);
        }

        System.out.println(result);

    }






}
