package Replit_Practices;

public class extractNum {
    public static void main(String[] args) {

            /*
    extractNum

description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only

example use:

extractNum("aa2aa3") ==> 23

extractNum("aa2") ==> 2

extractNum("aa10aa") ==> 10

extractNum("aa!!%$#.10aa") ==> 10


hint:
you can use:
 Character.isDigit(ch)
 or conditions



     */
            String str = "aa2aa3";

           String num =  ExtractNum(str);

        System.out.println(num);



    }

    public static String ExtractNum(String str){

        char [] ch = str.toCharArray();

        String num = "";

        for(int i = 0; i < ch.length; i++){

            if(Character.isDigit(ch[i])){


                num += ch[i];
            }

        }

       return num;

    }
}
