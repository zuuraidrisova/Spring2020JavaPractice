package day21_MultiDimensionalArray;

public class emailsArrayForEachLoop {
    public static void main(String[] args) {
        /*
         given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com",
         "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elements could be more in the array
    print all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
         */

       String [] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com",
               "Cybertek@hotmail.com", "Cybertek@outlook.com"};


       for(String each: emails){//loop thru elements in array

           if(!(each.endsWith("gmail.com"))){//to exclude specific element, under certain condition

               System.out.println(each);
           }
       }

       //another way is below

       for(String eachEmails : emails){

           if(eachEmails.endsWith("gmail.com")){

               continue;
           }
           System.out.println(eachEmails);
       }



    }
}
