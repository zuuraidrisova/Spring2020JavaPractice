package InterviewQuestions;

public class frequencyCharacters2 {

    /*

    Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

     */

    public static void main(String[] args) {

        String str = "AABBCDDDD";

        String a = frequencyOs(str);

        System.out.println(a);
    }

    public static String frequencyOs(String str){

        String noDup = "";

        for(int i = 0 ; i < str.length(); i++){

            if(! noDup.contains(""+str.charAt(i))){

               noDup += str.charAt(i);
            }
        }

        String result = "";


        for(int j = 0; j < noDup.length(); j++){

            int count = 0;

            for(int i = 0; i < str.length(); i++){

                if(noDup.charAt(j) == str.charAt(i)){

                    count++;
                }
            }

            result += noDup.charAt(j) +""+ count;

        }


        return result;

    }
}
