package Replit_Practices;

public class ReverseString179 {
    /*
    reverse method reverse a string.
it gets a string and returns it in reverse.

for example:

reverse("foo") ==> "oof"

reverse("student") ==> "tnedust"
     */

    public static void main(String[] args) {

        String a = "hello";

        String reverse = reverse(a);

        System.out.println(reverse);
    }
    public static String reverse(String input) {

        String reverse = "";

        for(int i = input.length()-1; i >= 0; i--){

            reverse += input.charAt(i);
        }

        return reverse;
    }
}
