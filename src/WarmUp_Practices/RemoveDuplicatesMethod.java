package WarmUp_Practices;

public class RemoveDuplicatesMethod {
    /*
      write a return method that accepts a String and removes duplicate values from
      the String
		Ex:
				RemoveDuplicate("aaabbbccc");  ==> "abc"
     */
    public static String removeDuplicates(String str){

        String noDuplicates = "";

        for(int i = 0; i < str.length(); i++) {

            if(noDuplicates.contains(""+str.charAt(i))){

             continue;
            }
            noDuplicates += str.charAt(i);
        }

        return noDuplicates;
    }

    public static void main(String[] args) {

        String str = "aaabbbdhdhdhhdhdhksoeohafdnndnddd";

       String result =  removeDuplicates(str);

        System.out.println(result);
    }
}
