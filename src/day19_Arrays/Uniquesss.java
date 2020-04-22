package day19_Arrays;

public class Uniquesss {
    public static void main(String[] args) {

        String str = "AABCC";

        String result = "";

        for(int j = 0; j <= str.length()-1; j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i <= str.length() - 1; i++) {

                char ch1 = str.charAt(i);

                if (ch == ch1) {
                    count++;
                }

            }

            if (count == 1) {
                result += ch;
            }


        }


        System.out.println(result);




    }
}
