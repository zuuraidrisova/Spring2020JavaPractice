package day18_NestedLoops;

public class TriangleAgain {
    public static void main(String[] args) {


        for(int j = 1; j <= 7; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("======================");


        for(int j= 7; j >= 1; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("======================");

        for(char b = 'a'; b <= 'z'; b++) {

            for (char a = 'a'; a <= b; a++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }







    }
}
