package Replit_Practices;
import java.util.Scanner;
public class GetSandwich {
    public static void main(String[] args) {
        /*
        A sandwich is two pieces of bread with something in between.
         Print the string that is between the first and last appearance
         of "bread" in the given string, or return string "nothing"
         if there are not two pieces of bread.

Example:
input: breadjambread
output: jam

Example:
input: xxbreadjambreadyy
output: jam

Example:
input: xxbreadapple
output: nothing

Example:
input: breadbutterbread
output: butter
         */

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int firstBread = str.indexOf("bread");//0
        int secondBread = str.lastIndexOf("bread");//11

        if (secondBread > firstBread) {

            System.out.println(str.substring(firstBread+ "bread".length(), secondBread));

        } else {
            System.out.println("nothing");
        }


    }
}
