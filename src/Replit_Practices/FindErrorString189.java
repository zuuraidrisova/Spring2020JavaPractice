package Replit_Practices;

public class FindErrorString189 {
    /*
    isError method checks if the line of string it gets has the word error at the start of it.

it gets a string and returns a boolean.
true if it found the word 'error' an the start of the line string

example use:

isError("foo bar")
returns : false

isError("error foo bar")
returns : true

isError("error one two")
returns : true

isError("three four error")
returns : false

hint: check the string methods in the java doc. one of them is helpful for this.
     */
    public static void main(String[] args) {

        String str = "three four two";

       boolean a =  isError(str);

        System.out.println(a);
    }
    public static boolean isError(String line) {

        if(line.substring(0,5).equals("error")){

            return true;
        }else{
            return false;
        }
    }
}
