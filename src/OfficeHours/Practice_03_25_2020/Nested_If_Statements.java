package OfficeHours.Practice_25_03_2020;

public class Nested_If_Statements {
    public static void main(String[] args) {
        //when we have pre-condition, and it can be evaluated to multiple scenarios
        byte weekDays = 7;
        boolean validNumber = weekDays >= 1 && weekDays <= 7;
        String result = " ";
        if (validNumber) {
            if (weekDays == 1) {
                result = "Monday";
            } else if (weekDays == 2) {
                result = "Tuesday";
            } else if (weekDays == 3) {
                result = "Wednesday";
            } else if (weekDays == 4) {
                result = "Thursday";
            } else if (weekDays == 5) {
                result = "Friday";
            } else if (weekDays == 6) {
                result = "Saturday";
            } else {
                result = "Sunday";
            }


        } else {
            System.out.println("Invalid Entry");
        }
        System.out.println(result);


        int salary = 45000;
        short creditScore = 750;
        byte jobHistory = 1;
        if (salary > 50000) {//might be eligible

            if (creditScore > 650) {//might be eligible

                if (jobHistory >= 2) { //eligible for loan

                    System.out.println("You are qualified");

                } else {//not eligible due to job history
                    System.out.println("You do not have enough job history.");
                }

            } else { // not eligible due to credit score
                System.out.println("You do not have good credit score");
            }

            }else{ // not eligible due to insuffient earnings
                System.out.println("You do not have enough earnings");

            }



        boolean citizenship = true;
        boolean smartHandsomeGenerous = true;
        int age = 30;
        int earnings = 100000;
        if (citizenship == true) {
            if (smartHandsomeGenerous == true) {
                System.out.println("You have a very high chance!");
            } else if (age >= 30) {
                System.out.println("You have a very high chance!");
            } else if (earnings >= 100000) {
                System.out.println("I will marry You!");
            } else {
                System.out.println("Chance is zero");
            }
        } else {
            System.out.println("Don't bother me!");
        }



        }
    }


