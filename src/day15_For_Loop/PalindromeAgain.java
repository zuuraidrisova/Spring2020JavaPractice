package day15_For_Loop;

public class PalindromeAgain {
    public static void main(String[] args) {
        String name = "hannah";

        int lastIndex = name.length()-1;

        String reversed = "";

        for(int i =lastIndex; i >= 0; i--){
            reversed += name.charAt(i);
        }
        System.out.println(reversed);

        if(name.equalsIgnoreCase(reversed)){
            System.out.println(name+" is a palindrome");
        }else{
            System.out.println(name+" is not a palindrome");
        }
    }
}
