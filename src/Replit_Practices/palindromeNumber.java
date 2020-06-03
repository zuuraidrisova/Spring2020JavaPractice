package Replit_Practices;

public class palindromeNumber {

    public static void main(String[] args) {

        int num = 123454321;

        boolean b = isPalindromeNumber(num);

        System.out.println(b);
    }

    public static boolean isPalindromeNumber(int num){

        String literal = ""+num;

        String reversed = "";

        for(int i = literal.length() - 1; i >= 0; i--){

            reversed += literal.charAt(i);
        }

        if(literal.equalsIgnoreCase(reversed)){

            return true;
        }else{

            return false;
        }
    }
}
