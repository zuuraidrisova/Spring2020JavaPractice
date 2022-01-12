package day18_NestedLoops;

public class Frequency {
    public static void main(String[] args) {

       String str = " AAABBBBCCCDDDEEE";

       int  count = 0;

       for(int  i = 0; i <= str.length()-1; i++){

           if(str.contains("B")){

               count++;

               str = str.replaceFirst("B","");
           }
       }
        System.out.println(count);







    }
}


