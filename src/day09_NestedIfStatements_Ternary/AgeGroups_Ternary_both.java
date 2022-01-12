package day09_NestedIfStatements_Ternary;

public class AgeGroups_Ternary_both {
    public static void main(String[]args){
        /*
        write a program that can define the age groups of a person
             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
         */
        byte age =45;

        String output = " ";

        if(age<3 && age>0){
            output="baby";

        }else if(age>=3 && age<=5){
            output="toddler";

        }else if(age>=6 && age <=9){
            output="kid";

        }else if(age>=10 && age<=12){
            output="pre-teen";

        }else if(age>=13 && age<=17){
            output = "teenager";

        }else if(age>=18 && age<=20){
            output="young adult";

        }else if(age>=21 && age<=39){
            output="adult";

        }else if(age>=40 && age<=49){
            output="young middle-aged adult";

        }else if(age>=50 && age<=54){
            output="middle-aged adult";

        }else if(age>=55 && age<=64){
            output="very young senior citizen";

        }else if(age>=65 && age<=74){
            output="young senior citizen";

        }else if(age>=75 && age<=84){
            output="senior citizen";

        }else if(age>=85 && age<=120){
            output="old senior citizen";

        }else{
            output="invalid entry";

        }
        System.out.println(output);

        boolean EligibleToBuyAlcohol;

        if (output == "adult" || output == "young middle-aged adult"
                || output == "middle-aged adult") EligibleToBuyAlcohol = true;

        else EligibleToBuyAlcohol = false;

        if (EligibleToBuyAlcohol == true) {

            System.out.println("you are eligible to buy alcohol");

        }else{
            System.out.println("you are not eligible to buy alcohol");
        }

            System.out.println("====================");


    String output2 = (age < 3 && age > 0) ? "baby" : (age >= 3 && age <= 5) ? "toddler"
            : (age >= 6 && age <= 9) ? "kid" : (age >= 10 && age <= 12) ? "pre-teen"
            : (age >= 13 && age <= 17) ? "teenager" : (age >= 18 && age <= 20) ? "young adult"
            : (age >= 21 && age <= 39) ? "adult" : (age >= 40 && age <= 49) ? "young middle-aged adult"
            : (age >= 50 && age <= 54) ? "middle-aged adult" : (age >= 55 && age <= 64) ? "very young senior citizen"
            : (age >= 65 && age <= 74) ? "young senior citizen" : (age >= 75 && age <= 84) ? "senior citizen"
            : (age >= 85 && age <= 120) ? "old senior citizen" : "invalid entry";

    System.out.println(output2);

        }
    }

