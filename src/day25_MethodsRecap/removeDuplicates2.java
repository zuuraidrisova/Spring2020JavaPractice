package day25_MethodsRecap;

public class removeDuplicates2 {
        /*
     write a return method that accepts a String and removes duplicate values
     from the String
		Ex:
				RemoveDuplicate("aaabbbccc");  ==> "abc"
     */
        public static void main(String[] args) {

            String str = "ABABAAAABBBB";

            String noDuplicates = "";//to store the result

            for(int i = 0; i < str.length(); i++){//to loop thru every single character in string

                char ch =  str.charAt(i);//we can assign it to a new char variable

                if(! noDuplicates.contains(""+ch)){//to check if result contains the particular character

                    noDuplicates += ch; //concatenates character to string

                }

            }

            System.out.println(noDuplicates);

            String unique = removeDuplicates(str);

            System.out.println(unique);


        }

       public static String removeDuplicates(String str){

           String noDuplicates = "";//to store the result

           for(int i = 0; i < str.length(); i++){//to loop thru every single character in string

               char ch =  str.charAt(i);//we can assign it to a new char variable

               if(! noDuplicates.contains(""+ch)){//to check if result contains the particular character

                   noDuplicates += ch; //concatenates character to string

               }

           }

           return noDuplicates;
       }





}
