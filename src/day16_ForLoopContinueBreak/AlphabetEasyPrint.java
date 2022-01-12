package day16_ForLoopContinueBreak;

public class AlphabetEasyPrint {
    public static void main(String[] args) {

        int a = 97;
        int A = 65;

        String result = "";

        for(int i=0; i<26; i++ ){

           char ch = (char)(A+i);  // 65+0=65==>single character

             char ch2 = (char)(a+i); // 97+0=97 ==>single character

            result += ch+""+ch2+" ";

        }
        System.out.println(result);


    }
}
