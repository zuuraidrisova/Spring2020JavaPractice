package WarmUp_Practices;

import java.util.Scanner;

public class printNumberNfor {

    public static void main(String[] args) {

        //how to print numbers from 0 to n
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 0; i <= n; i++){

            System.out.println(i);
        }

        //printing only even number

        for(int i = 0; i <= n; i++){

            if(i % 2 == 0){

                System.out.print(i+" ");
            }
        }


    }
}
