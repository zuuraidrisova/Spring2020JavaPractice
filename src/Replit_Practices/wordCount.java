package Replit_Practices;

public class wordCount {

    /*

This method gets a string and returns the word count of that string.

example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1
     */
    public static void main(String[] args) {

        System.out.println(wordCount("bla"));
    }

    public static int wordCount(String words) {

       String [] arr =  words.split(" ");

        int count = 0;

        for(String each : arr){

            count++;
        }

        return count;
    }

}
