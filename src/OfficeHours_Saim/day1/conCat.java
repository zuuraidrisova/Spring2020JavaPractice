package OfficeHours_Saim.day1;

public class conCat {
    public static void main(String[] args) {

        /*
        Given two strings, append them together (known as "concatenation")
        and return the result. However, if the concatenation creates a double-char,
         then omit one of the chars, so "abc" and "cat" yields "abcat".


conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
         */
        String a = "cat";
        String b = "";

       String c =  conCat(a,b);

        System.out.println(c);
    }

    public static String conCat(String a, String b){

        if(a.length() == 0){

            return b;
        }else if(b.length() == 0) {

            return a;

        }else if(a.substring(a.length()-1).equals(b.substring(0,1))){

            return a.concat(b.substring(1));

        }else{

            return a.concat(b);
        }


    }
}
