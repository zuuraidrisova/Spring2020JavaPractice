package Replit_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class uniques3 {

    public static void main(String[] args) {

        String str = "zuuuuuuuuuura";

        String result = "";

        for(int i = 0; i < str.length(); i++){

            if(!result.contains(""+str.charAt(i))){

                result += str.charAt(i);
            }
        }

        System.out.println(result);

        String [] str1 = {"Asan","Alina","Asan", "Asan"};

        for(int i = 0; i < str1.length; i++){

            int count = 0;

            for(int j = 0; j < str1.length; j++){

                if(str1[i] == str1[j]){

                    count++;
                }
            }

            if(count == 1){

                System.out.println(str1[i]);
            }
        }

        ArrayList<String> list = new ArrayList<>(Arrays.asList("hello", "hello","hello","hi"));

        for(int i = 0; i < list.size(); i++){

            int count = 0;

            for(int j = 0; j < list.size(); j++){

                if(list.get(i) == list.get(j)){

                    count++;
                }
            }

            if(count  != 1){

                list.remove(i);
            }
        }

        System.out.println(list);

    }
}

class duplicates{

    public static void main(String[] args) {

        String str = "zuuuuuurrrraa";

        String result = "";

        for(int i = 0; i < str.length(); i++){

            int count = 0;

            for(int j = 0; j < str.length(); j++){

                if(str.charAt(i) == str.charAt(j)){

                    count++;
                }
            }

            if(count == 1){

                result += str.charAt(i);
            }
        }


        System.out.println(result);

        String str1 = "I like java, java is fun, very fun";

        String java = "java";

        int count = 0;

        while(str1.contains("java")){

            count++;

           str1 =  str1.replaceFirst("java","");
        }

        System.out.println(count);

        String s = "zuuuuuuura";
        String u = "u";

        int c = 0;


    }
}