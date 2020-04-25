package day19_Arrays;

public class Frequency {
    public static void main(String[] args) {
        /*
        write a program that can return the frequency of the characters in a string
		Ex: "AABCBCA" ==> "A3B2C2"

         */
        String str = "AABCC";//A2B1C2

        String result = "";//expected result to be stored in to this variable

        String noDuplicates = ""; //remove duplicates and store it to the string


        for(int i = 0; i <= str.length()-1; i++){//loops thru the string

            if(! noDuplicates.contains(""+str.charAt(i))){//if it does not contain doubles

                noDuplicates += str.charAt(i);//then it will concat to noDuplicates variable

            }

        }
        System.out.println(noDuplicates);

        //noDuplicates = "ABC"; str = "AABCC"; ==> result ==> "A2B1C2";

        for(int j = 0; j <= noDuplicates.length()-1; j++) {

            noDuplicates.charAt(j);

            int count = 0;//count frequency of the characters in a  string

            for (int i = 0; i <= str.length() - 1; i++) {

                if (str.charAt(i) == noDuplicates.charAt(j)) {

                    count++;
                }
            }
            result += "" + noDuplicates.charAt(j) + count;
        }


        System.out.println(result);
    }
}
