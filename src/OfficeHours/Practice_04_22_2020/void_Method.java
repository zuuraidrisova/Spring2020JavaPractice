package OfficeHours.Practice_04_22_2020;

public class void_Method {

    public static void printHello5(){

        for(int i = 0; i < 5; i++) {

            System.out.println("Hello World!");
        }
    }

    public static void eligibleToVote(boolean citizen, int age){

        if(citizen == true && age >= 18){

            System.out.println("Eligible to Vote");
        }else {

            System.out.println("Not Eligible to Vote");
        }

    }
    public static void eligibleToBuyCigarette(int age){

        if(age >= 18){

            System.out.println("You can buy cigarette");

        }else{

            System.out.println("You cannot buy cigarette");
        }
    }


    public static void main(String[] args) {

        printHello5();

        eligibleToVote(true,18);

        eligibleToBuyCigarette(12);
    }

}
