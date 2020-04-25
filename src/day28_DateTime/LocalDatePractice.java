package day28_DateTime;

import java.time.LocalDate;

public class LocalDatePractice {

    public static void main(String[] args) {
/*
1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store thier birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays
 */


        String [] friends = {"Chopa","Shirin", "Jiyde"};

        LocalDate ChopaBday = LocalDate.of(1990,12,8);
        LocalDate ShirinBday = LocalDate.of(1991,2,16);
        LocalDate JiydeBday = LocalDate.of(1990,11,17);

        LocalDate [] bdays = {ChopaBday,ShirinBday,JiydeBday};

        for(int i = 0; i < friends.length; i++){

            String names = friends[i];
            LocalDate dates = bdays[i];

            System.out.println(names);
            System.out.println(dates);
        }
    }
}
