package WarmUp_Practices;

public class frequencyOfChars {

    public static void main(String[] args) {

        String str = "AAABBCDDDD";

        String noDup = "";

        String result = "";

       for(int i = 0; i < str.length(); i++){

           if(!noDup.contains(""+str.charAt(i))){

               noDup += str.charAt(i);

           }
       }

        System.out.println(noDup);


       for(int i = 0; i < noDup.length(); i++){

           int count = 0;

           for(int j = 0; j < str.length(); j++){

               if(str.charAt(j) == noDup.charAt(i)){

                   count++;
               }

           }

           result += noDup.charAt(i) +""+count;
       }

        System.out.println(result);


    }
}
