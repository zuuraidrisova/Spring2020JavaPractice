package day29_Wrapper_ArrayList;

public class frequency {

    public static void main(String[] args) {



        String str = "zuuuura";

        String ch = "u";

        int count = 0;

      while(str.contains(ch)){

          count++;

          str =str.replaceFirst(ch,"");
      }

        System.out.println(count);


    }
}
