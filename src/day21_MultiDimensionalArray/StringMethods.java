package day21_MultiDimensionalArray;


import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        //toCharArray()

       String name = "Java";

       char [] ch = name.toCharArray();

        System.out.println(ch[0]);
        System.out.println(ch[3]);
        System.out.println(ch);


        //split

        String str = "I like Java";

        String [] arr = str.split(" ");

        System.out.println(Arrays.toString(arr));

        /*
        reverse sentence: day great a is Today

         */

        String sentence = "Today is a great day";

        String [] arr1 = sentence.split(" ");

        System.out.println(Arrays.toString(arr1));

        String result = "";

        for(int i = arr1.length-1; i >= 0; i--){

            String reversed = arr1[i];

            result +=  reversed+" ";

        }

        System.out.print(result);

        System.out.println();

        String str1  = "ABCD";

       String arr2 [] =  str1.split("");

       char [] ch2 = str1.toCharArray();

        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.toString(ch2));


    }
}
