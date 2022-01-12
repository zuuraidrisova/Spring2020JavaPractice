package reviewPracticing;

public class UniqueDuplicatesFrequency_Tasks {

    public static void main(String[] args) {


        String str = "zuura zuura zuura Asan";

        String str1 = "zuura";

        int count = frequency(str,str1);

        System.out.println("count = " + count);

        String noDup = removeDuplicates(str);

        System.out.println("noDup = " + noDup);

        String unique = unique(str);

        System.out.println("unique = " + unique);

    }

    public static int frequency(String str, String str2){

        int count = 0;

        while(str.contains(str2)){

            count++;

            str =  str.replaceFirst(str2,"");
        }

        return count;
    }


    public static String removeDuplicates(String str){

        String noDup = "";

        for (int i = 0; i < str.length(); i++){

            if (!noDup.contains(str.charAt(i)+"")){

                noDup += str.charAt(i);
            }
        }

        return noDup;
    }

    public static String unique(String str){

        String unique = "";

        for (int i = 0; i < str.length(); i++){

            int count = 0;

            for (int j = 0; j < str.length(); j++){

                if (str.charAt(i) == str.charAt(j)){

                    count++;
                }
            }

            if (count == 1){

                unique += str.charAt(i);
            }
        }

        return unique;
    }


}
