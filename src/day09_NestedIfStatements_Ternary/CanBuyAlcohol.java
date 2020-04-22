package day09_NestedIfStatements_Ternary;

public class CanBuyAlcohol {
    public static void main(String[] args) {
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
    }
}

