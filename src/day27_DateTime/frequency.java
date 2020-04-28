package day27_DateTime;

public class frequency {
    public static void main(String[] args) {

        String str  = "zuuuuuuuura";

        char ch = 'u';

        int count = frequency(str,ch);

        System.out.println(count);

       String noDuplicates =  removeDuplicates(str);

        System.out.println(noDuplicates);

        String uniques = uniques(str);

        System.out.println(uniques);

    }
    public static int frequency(String str, char ch){
        int count = 0;

        char [] ch1 =  str.toCharArray();

        for(int i = 0; i < ch1.length; i++){

            if(ch1[i] == ch){

                count++;
            }
        }

        return count;
    }

    public static String removeDuplicates(String str){

        String noDuplicates = "";

        for(int i = 0; i < str.length(); i++){

            if(!noDuplicates.contains(""+str.charAt(i))){

                noDuplicates += str.charAt(i);
            }
        }


        return noDuplicates;
    }

    public static String uniques(String str){

        String uniques = "";


        for(int i = 0; i < str.length(); i++){

           int count =  frequency(str,str.charAt(i));

           if(count == 1){

               uniques += str.charAt(i);
           }
        }


        return uniques;
    }
}
