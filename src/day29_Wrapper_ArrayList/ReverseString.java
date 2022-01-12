package day29_Wrapper_ArrayList;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Zuura";

        String reversed = "";

        for(int i = str.length()-1; i >= 0; i--){

            reversed += str.charAt(i);

        }

        System.out.println(reversed);

    }
}
