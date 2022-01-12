package day25_MethodsRecap;

import resources.Library;

public class Test2 {

    public static void main(String[] args) {

        String str = "AABBBBBCCCC";

        String result = Library.removeDuplicates(str);

        System.out.println(result);

        System.out.println("========================");

        String str1 = "A";

        int count = Library.frequency(str,str1);

        System.out.println(count);

        System.out.println("========================");

        String result1 = Library.frequencyOfCharacters(str);

        System.out.println(result1);

        System.out.println("========================");

    }
}
