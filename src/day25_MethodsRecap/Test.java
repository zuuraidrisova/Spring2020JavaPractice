package day25_MethodsRecap;

import resources.Library;

public class Test {
    public static void main(String[] args) {

        String str = "AAABBB";

        String unique = Library.removeDuplicates(str);

        System.out.println(unique);

        String a = "AAAABBB";
        String b = "A";

        int count = Library.frequency(a,b);

        System.out.println(count);

        String str1 = "AABBCC";

       String str2 =  Library.frequencyOfChars(str1);

        System.out.println(str2);
    }
}
