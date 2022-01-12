package day10_Switch_Scanner;

public class ConvertingNumericToAlphabetic_Ternary {
    public static void main(String []args){
        /*
         write a java program that can convert numbers between 0 ~ 9 to words,
         if the number is greater than 9 or less than zero, out put should be "Invalid".
         */
        byte num= 90;
        String Alphabetic = " ";

        if(num>=0 && num<=9) {

            Alphabetic = (num == 0) ? "Zero" :(num==1)?"One":(num==2)?"Two":(num==3)?"Three"
                    :(num==4)?"Four":(num==5)?"Five":(num==6)?"Six":(num==7)?"Seven"
                    :(num==8)?"Eight":"Nine";

        }else{

            Alphabetic="Invalid Entry";
        }


        //Ternary without Nested_If

        String words = (num==0)?"Zero":(num==1)?"One":(num==2)?"Two"
                :(num==3)?"Three":(num==4)?"Four":(num==5)?"Five"
                :(num==6)?"Six":(num==7)?"Seven":(num==8)?"Eight"
                :(num==9)?"Nine":"Invalid Entry";


        //
        if(num>=0 && num<=9){
            System.out.println(Alphabetic);
            System.out.println(words);
        }

    }
}
