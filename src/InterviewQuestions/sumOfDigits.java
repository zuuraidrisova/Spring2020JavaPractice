package InterviewQuestions;

public class sumOfDigits {

    public static void main(String[] args) {
        /*
        Write a method that can return the sum of the digits in a string
         */

        String str = "A2B1C3";

        int a = sumOfDigits(str);

        System.out.println(a);

    }

    public static int sumOfDigits(String str){

       char [] ch = str.toCharArray();

       int sum = 0;

       for(int  i = 0; i < ch.length; i++ ){

           if(Character.isDigit(ch[i])){//to identify whether char is digit or not

             int num =   Integer.parseInt(""+ch[i]);//if yes, we parse it into number

               sum += num;//then sum all numbers

           }
       }

       return sum;
    }


}
