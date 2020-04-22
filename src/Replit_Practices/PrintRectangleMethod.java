package Replit_Practices;

public class PrintRectangleMethod {
    /*
    Create a method printHollowRect that prints a 5 on 5 hollow rectangle:


*****
*   *
*   *
*   *
*****

hint:you will need to use two nested for loops for that,
and an if that checks
 if its the last or first iteration of the loop (so you will know whet
 to print "*" or " ")
     */
    public static void printHollowRect(){
        // write your code here:

        for(int i = 0; i < 5; i++){
            System.out.print("*");
        }

        System.out.println();

        for(int i =0; i < 3; i++){
            System.out.println("*   *");
        }

        for(int i = 0; i < 5; i++){
            System.out.print("*");
        }


    }// end your code

    public static void main(String[] args) {

        printHollowRect();
    }

}
