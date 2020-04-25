package day19_Arrays;

public class NoDuplicates {

    public static void main(String[] args) {

        String str = "java java java java";

        String str1 = "java";

        String noDuplicates = noDuplicates(str);

        System.out.println(noDuplicates);

        int count = frequency(str, str1);

        System.out.println(count);
    }

    public static String noDuplicates(String str){

        String noDuplicates = "";

        for(int i = 0; i < str.length(); i++){

            if(! noDuplicates.contains(""+str.charAt(i))){

                noDuplicates += str.charAt(i);
            }
        }

        return noDuplicates;
    }

    public static int frequency(String str1, String str2 ){

        int count = 0;

        for(int i = 0; i < str1.length(); i++){

            if(str1.contains(str2)){

                count++;

                str1 = str1.replaceFirst(str2, "");
            }
        }

        return count;
    }
}
