package day19_Arrays;

public class Frequency2 {
    public static void main(String[] args) {
        String str = "AABCC"; // A2B1C2

        String result = "";// A2B1C2 should be stored here

        String noDuplicates = "";//ABC should be stored



            for (int i = 0; i <= str.length() - 1; i++) {

                if( ! noDuplicates.contains(""+str.charAt(i))){

                    noDuplicates += str.charAt(i);
                }

            }

        System.out.println(noDuplicates);


            for(int k = 0; k <= noDuplicates.length()-1; k++) {

                noDuplicates.charAt(k);

                int count = 0;
                for (int j = 0; j <= str.length() - 1; j++) {
                    if (str.charAt(j) == noDuplicates.charAt(k)) {
                        count++;
                    }

                }
                result +=""+noDuplicates.charAt(k)+count;
            }


              System.out.println(result);


    }
}
