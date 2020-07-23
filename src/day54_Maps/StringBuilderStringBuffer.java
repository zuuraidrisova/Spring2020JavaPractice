package day54_Maps;


public class StringBuilderStringBuffer {

    public static void main(String[] args) {
        /*

        String: ==> immutable, cannot be modified

        String Builder: mutable version of char sequences

        String Buffer:  mutable version of char sequences

        there was only string Buffer before, it is a legacy one, and all methods in
        String  Buffer were synchronized, so thread-safe, consequently  it was slow

        Then String Builder created later, because String Buffer was too slow,
        String Builder methods are not synchronized

        StringBuilder and StringBuffer have very useful methods like reverse()

         */

        //string literal -> String Pool
        String str1 = "Cybertek";

        str1.concat("School");

        System.out.println(str1);//Cybertek, cannot be changed

        // new -> heap memory
        String str2 = new String("MIT");

        str2 = str2.concat(" School"); //we re-assigned it, not it will refer to latest one

        System.out.println(str2);

        System.out.println("=================================");

        StringBuilder builder = new StringBuilder("Cybertek");

                        builder.append(" School");

        System.out.println(builder);

        System.out.println("=================================");

        StringBuffer buffer = new StringBuffer("Cybertek");

        buffer.append(" School");

        System.out.println(buffer);

        System.out.println("=================================");

        String word = "ABCD";

        String reversed = "";
            // we have to use for loop in order to reverse a string
        for(int i = word.length()-1; i >= 0; i--){

            reversed += word.charAt(i);

        }

        System.out.println(reversed);

        System.out.println("====================================");

        StringBuilder sb2 = new StringBuilder(word);

        sb2.reverse();

        System.out.println(sb2);

        word =  sb2.toString();

        System.out.println(word);

        System.out.println("=================================");

        StringBuilder sb = new StringBuilder("ABCD");

        sb.reverse();//it reverses the string

        System.out.println(sb);

        System.out.println("====================================");

        StringBuffer sf = new StringBuffer("ABCD");

        sf.reverse();

        System.out.println(sf);
    }
}
