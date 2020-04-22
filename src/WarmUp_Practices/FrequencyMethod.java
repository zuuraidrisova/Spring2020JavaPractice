package WarmUp_Practices;

public class FrequencyMethod {
    /*
     write a return method that accepts two strings str1 & str2, and returns
     the frequency of str2 in str1 as an int
        EX:
            Frequency("AAABB", "A");  ==> 3
            Frequency("ABAB", "B"); ==> 2
     */
    public static int frequency(String str, String str2){

        int count = 0;

      while(str.contains(str2)){

          count++;

          str = str.replaceFirst(str2,"");
      }
        return count;
    }

    public static void main(String[] args) {

        String str = "javajavajavajava";
        String str2 = "java";

        int count = frequency(str,str2);

        System.out.println(count);
    }
}
