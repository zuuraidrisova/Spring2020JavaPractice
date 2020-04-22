package WarmUp_Practices;

import java.util.Scanner;

public class MinMaxForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -999999999;

        for(int i=1; i<=5;i++){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if(num>max){
                max = num;
            }

        }
        System.out.println(max);


        int min = 999999999;

        int i =1;
        while(i<=5){
            System.out.println("Enter a number: ");
            int num2 = scan.nextInt();
            if(num2<min){
                min = num2;
            }
            i++;
        }

        System.out.println(min);


    }
}
