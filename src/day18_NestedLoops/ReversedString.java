package day18_NestedLoops;

public class ReversedString {
    public static void main(String[] args) {

        String str = "I love java";

        String reversed = "";

        int lastIndex = str.length()-1;

        for(int i = lastIndex; i >= 0; i--){
            reversed += str.charAt(i);


        }

        System.out.println(reversed);

    }
}
