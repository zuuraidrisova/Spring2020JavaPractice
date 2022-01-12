package day18_NestedLoops;

public class StringReverse {

    public static void main(String[] args) {

        String str = "at this point i hate java";

        String reversed ="";

        int lastIndex = str.length()-1;

        do{

            reversed += str.charAt(lastIndex);

            lastIndex--;

        }while(lastIndex >= 0);


        System.out.println(reversed);

    }
}
