package day28_DateTime;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class WarmUp {

    /*
    1. create an array of string, store five of your friends names in it
    2. create Array of localdates and store thier birthdays in the same order
    3. use for loop to print out your friends' names and thier birthdays
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] friends = new String [3];

        for(int i = 0; i < 3; i++){

            System.out.println("Enter your friend's name : "+(i+1));
            friends[i] = scan.next();
        }

        System.out.println(Arrays.toString(friends));

        LocalDate ChopaBday = LocalDate.of(1990,12,8);
        LocalDate ShirinBday = LocalDate.of(1991,02,16);
        LocalDate JiydeBday = LocalDate.of(1990,11,17);

        LocalDate [] bdays = {ChopaBday, ShirinBday, JiydeBday};

        for(int i = 0; i < friends.length; i++){

           String names =  friends[i];
           LocalDate dates = bdays[i];

            System.out.println(names);
            System.out.println(dates);

        }

    }
}
