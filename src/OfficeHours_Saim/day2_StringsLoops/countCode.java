package OfficeHours_Saim.day2_StringsLoops;

public class countCode {

    public static void main(String[] args) {

        /*
        Return the number of times that the string "code" appears anywhere
         in the given string, except we'll accept any letter for the 'd', so
          "cope" and "cooe" count.


countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
         */

        String str = "aacodexxcoze";

        int count = countCode(str);

        System.out.println(count);
    }

    public static int countCode(String str) {

        int sum = 0;
        for (int i = 0; i < str.length()-3; ++i)
        {
            if (str.substring(i,i+2).equals("co") && str.charAt(i+3) == 'e') sum++;
        }
        return sum;

    }
}
