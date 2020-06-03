package Replit_Practices;

public class findingCharacters {
    /*

    Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

     */
    public static void main(String[] args) {

        String str = "AAABBCDD";

        String result = frequencyOfChars(str);

        System.out.println(result);
    }

    public static String frequencyOfChars(String str){

        String noDuplicates = "";

        for(int i = 0; i < str.length(); i++){

            if(!noDuplicates.contains(""+str.charAt(i))){

                noDuplicates += str.charAt(i);
            }
        }

        String result = "";

        for(int i = 0; i < noDuplicates.length(); i++){

            int count = 0;

            for(int j = 0; j < str.length(); j++){

                if(noDuplicates.charAt(i) == str.charAt(j)){

                    count++;
                }
            }
            result += noDuplicates.charAt(i) +""+count;
        }

        return result;

    }
}
