package reviewPracticing;

public class ForLoop_Tasks5 {

    public static void main(String[] args) {

        //print rectangle

        System.out.println("* * *");
        for (int i = 0; i <= 5; i++){

            System.out.println("*   *");
        }
        System.out.println("* * *");

        System.out.println("==================================");


        //print triangle

        for (int i = 1; i <= 7; i++){

            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println();

        }

        System.out.println("==================================");

        //print triangle  reversed

        for (int i = 7; i >= 0; i--){

            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println();

        }

        System.out.println("==================================");

        //triangle using alphabet

        for (char ch = 'a'; ch <= 'z'; ch++){

            for (char a = 'a'; a <= ch; a++){

                System.out.print(a+" ");
            }
            System.out.println();
        }

        System.out.println("==================================");


        //triangle using alphabet reversed

        for (char ch = 'z'; ch >= 'a'; ch--){

            for (char a = 'a'; a <= ch; a++){

                System.out.print(a+" ");
            }
            System.out.println();
        }
    }



}
