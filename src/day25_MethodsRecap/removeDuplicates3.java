package day25_MethodsRecap;

public class removeDuplicates3 {

    public static void main(String[] args) {

        String str = "AABBBCCCCCCCCC";

        String result = "";

        for(int i = 0; i < str.length(); i++){

            if(! result.contains(""+ str.charAt(i))){

                result += str.charAt(i);

            }
        }

        System.out.println(result);

        String result2 = removeDuplicates(str);

        System.out.println(result2);

        String str2 = "aaallllleeee";

        String result3 = removeDuplicates(str2);

        System.out.println(result3);

    }

    public static String removeDuplicates(String str){

        String result = "";

        for(int i = 0; i < str.length(); i++){

            if(!result.contains(""+str.charAt(i))){

                result += str.charAt(i);
            }
        }


        return result;
    }
}
