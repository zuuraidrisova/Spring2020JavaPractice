package InterviewQuestions;

public class removeDuplicates {

    /*
    Write a return method that can remove the duplicated values from String

Ex:  removeDup("AAABBBCCC")  ==> ABC

     */
    public static void main(String[] args) {

        String str = "AAAABBCCCCCCCC";

       String a =  removeDup(str);

        System.out.println(a);
    }

    public static String removeDup(String str){

        String noDup = "";

        for(int i = 0; i < str.length(); i++){

            if(! noDup.contains(""+str.charAt(i))){

                noDup += str.charAt(i);
            }
        }

        return noDup;
    }
}
