package day25_MethodsRecap;

public class FrequencyMethod2 {

       /*
     write a return method that accepts two strings str1 & str2, and returns
     the frequency of str2 in str1 as an int
        EX:
            Frequency("AAABB", "A");  ==> 3
            Frequency("ABAB", "B"); ==> 2

     */
       public static int frequency(String str1, String str2){

           int count = 0;

           while(str1.contains(str2)){

               count++;

               str1 = str1.replaceFirst(str2,"");

           }


           return count;
       }

    public static void main(String[] args) {

         int count =   frequency("aaaabbbccc","a");

        System.out.println(count);

    }
}
