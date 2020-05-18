package Replit_Practices;

public class CountingCharactersInString {
    public static void main(String[] args) {

        String str = "AAABBBBCCCCDDD";

        int count = 0;

        while(str.contains("A")){

            count++;

            str = str.replaceFirst("A","");

            //AFTER COUNTING FIRST A WE NEED TO REMOVE IT FORM STR,
            // BECAUSE WE DONT WANT TO COUNT IT AGAIN
        }


        System.out.println(count);







    }
}
