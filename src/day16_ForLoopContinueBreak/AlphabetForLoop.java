package day16_ForLoopContinueBreak;

public class AlphabetForLoop {
    public static void main(String[] args) {

        /*
         Write a program that will print out all letters
         in English alphabet in ascending order
         Write a program that will print out all letters
         in English alphabet in descending order

         */

        for(char alphabet = 'A'; alphabet <= 'Z'; alphabet++){
            System.out.print(alphabet+" ");
        }
        System.out.println();

        for(char alphabet1= 'Z'; alphabet1 >= 'A'; alphabet1--){
            System.out.print(alphabet1+" ");
        }
        System.out.println();

        for(char alphabet2= 'a'; alphabet2 <= 'z'; alphabet2++){
            System.out.print(alphabet2+" ");
        }
        System.out.println();

        for(char alphabet3= 'z'; alphabet3 >= 'a'; alphabet3--){
            System.out.print(alphabet3+" ");
        }

    }
}
