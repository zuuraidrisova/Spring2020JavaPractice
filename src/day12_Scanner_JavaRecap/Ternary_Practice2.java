package day12_Scanner_JavaRecap;
import java.util.Scanner;
public class Ternary_Practice2 {
    public static void main(String []args){

       /* Create a new switch statement using char instead of int.
                Create a new char variable
        Create a switch statement testing for A, B, C, D or E
        Display a message if any of these are found and then break
                Add a default which displays a message saying not found.

        */

        char ch1 = 'A';
        String message = " ";

        switch (ch1){
            case 'A':
                message="this is A";
                break;
            case 'B':
                message="this is B";
                break;
            case 'C':
                message="this is C";
                break;
            case 'D':
                message="this is D";
                break;
            case 'E':
                message="this is E";
                break;
            default:
                message="Invalid character";

        }

        System.out.println(message);

        String result =(ch1=='A')? "A is selected":(ch1=='B')? "B is selected"
                       :(ch1=='C')? "C is selected":(ch1=='D')?"D is selected"
                       :(ch1=='E')?"E is selected":"Invalid entry";


        System.out.println(result);
    }
}
