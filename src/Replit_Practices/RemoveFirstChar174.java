package Replit_Practices;

public class RemoveFirstChar174 {
    public static void main(String[] args) {

        String a = "hello";

        String first = removeFirst(a);

        System.out.println(first);
    }
    /*
    The method gets a string and returns a string minus the first letter.

for example:

removeFirst("aaa")
returns "aa"
     */


    public static String removeFirst(String target) {

        String first = "";

        first = target.substring(1);

        return first;
    }
}
