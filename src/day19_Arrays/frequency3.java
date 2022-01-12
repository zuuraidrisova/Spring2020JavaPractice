package day19_Arrays;

public class frequency3 {

    public static void main(String[] args) {

        String str = "ABBCCD";

        String result = "";

        String noDuplicates = "";

        for(int i = 0; i < str.length(); i++){

            if(! noDuplicates.contains(""+str.charAt(i))){

                noDuplicates += str.charAt(i);
            }
        }

        System.out.println(noDuplicates);

        for(int i = 0; i < noDuplicates.length(); i++){

            int count = 0;

            for(int j = 0; j < str.length(); j++){

                if(str.charAt(j) == noDuplicates.charAt(i)){

                    count++;
                }
            }

            result += ""+ noDuplicates.charAt(i) + count;
        }

        System.out.println(result);





    }
}
