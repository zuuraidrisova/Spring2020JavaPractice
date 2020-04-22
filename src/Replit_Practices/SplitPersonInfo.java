package Replit_Practices;
import java.util.Arrays;
import java.util.Scanner;
public class SplitPersonInfo {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;


    }
    /*
    The method person get a string with this format : "name,last name,age"
for example:

person("jon,doe,30");

the output is:

person name: jon last name: doe age: 30

hint: use the split method to split the string to a string array where there is a "," char
     */

    public static void person(String info) {

        //your code here

        String str [] = info.split(",");

        String first = str[0];
        String last = str[1];
        String age = str [2];

        System.out.println("first name: "+first+" last name: "+last+" age: "+age);
    }//end person

}
