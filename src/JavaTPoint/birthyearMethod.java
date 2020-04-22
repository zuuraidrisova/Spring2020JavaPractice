package JavaTPoint;

import java.util.Scanner;

public class birthyearMethod {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your birth year: ");
        int birthYear = scan.nextInt();

        birthYear(1990);

    }
    //
    public static void birthYear(int birthYear){

        int currentYear = 2020;
        int age = currentYear - birthYear;

        if(age > 0 && birthYear > 1900){

            System.out.println(age);
        }else{
            System.out.println("Invalid entry");
        }
    }
}
