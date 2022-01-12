package day09_NestedIfStatements_Ternary;

public class Ternary_Practice {
    public static void main(String []args){

        int num = 10;
        char ch1 = ' ';

        if(num>0){
            ch1 = '+';
        }else if(num<0){
            ch1= '-';
        }else{
            ch1='0';
        }
        System.out.println(ch1);

        char ch2 = (num>0)? '+': (num<0)? '-':'0';
        System.out.println(ch2);

        System.out.println(ch1+ch2);

        System.out.println("================================");
        byte score = 67;
        String grade = " ";
        if(score>=90 && score<=100){
           grade= "Excellent";
        }else if(score>=80 && score <90){
            grade="Great";
        }else if(score>=70 && score<80){
            grade="Good";
        }else if(score>=60 && score<70){
            grade="Pass";
        }else if(score<60 && score>0){
            grade="Fail";
        }else{
            grade="Invalid Entry";
        }
        System.out.println(grade);

        //ternary
        String grade2 = (score>=90 && score<=100)? "Excellent"
                :(score>=80 && score<90)? "Great"
                :(score>=70 && score<80)?"Good":(score>=60 && score<70)?"Pass"
                :(score>=50 && score>0)? "Fail":"Invalid Entry";
        System.out.println(grade2);

        //ternary always has to end with else (:) statement
        //it does not work with print statement inside body

    }
}
