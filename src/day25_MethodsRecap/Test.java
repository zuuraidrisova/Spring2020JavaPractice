package day25_MethodsRecap;

import resources.Library;

public class Test {

    public static void main(String[] args) {

        String str = "AAABBB";

        String unique = Library.removeDuplicates(str);

        System.out.println(unique);

        String str2 = ""+str.charAt(0);

        int count = Library.frequency(str,str2);

        System.out.println(count);

        String str3 =  Library.frequencyOfCharacters(str);

        System.out.println(str3);
    }
}
