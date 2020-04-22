package day25_MethodsRecap;

import resources.Library;

public class FrequencyOfChar {
/*
(This one I will do it too tomorrow in class) Combine above two methods to write
 a return method that can return the frequency of characters as a string
 from any given string
		Ex:
			FrequencyOfChars("ABABCB"); ==> "A2B3C1";
			FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
 */
    public static void main(String[] args) {

        String str = "AABBCC";
        String result = "";//expected result A2B2C2

        String noDup =  Library.removeDuplicates(str);

        for(int i = 0; i < noDup.length(); i++){

            String ch = ""+ noDup.charAt(i);//"A"
            int count = Library.frequency(str, ch);

            result += ch + count;

        }
        System.out.print(result);

}
    public static String frequencyOfChars(String str){
        String result = "";//expected result A2B2C2

        String noDup =  Library.removeDuplicates(str);

        for(int i = 0; i < noDup.length(); i++){

            String ch = ""+ noDup.charAt(i);//"A"
            int count = Library.frequency(str, ch);

            result += ch + count;

        }
        return result;

    }

}
