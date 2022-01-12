package day09_NestedIfStatements_Ternary;

public class Ternary2 {
    public static void main(String []args){

        //only apply to if statements which returns a  value and assign it to a variable
        // ? means if
        //: means else

        String result = " ";
        if(9>10){
            result="9 is greater";
        }else{
            result="10 is greater";
        }
        System.out.println(result);

        String result2 = (9>10) ? "9 is greater" : "10 is greater";
        System.out.println(result2);
        System.out.println("=============================");

        int age = 20;
        boolean eligiblility1 = age>=21;

        if(eligiblility1){
            eligiblility1=true;
        }else{
            eligiblility1=false;
        }
        System.out.println(eligiblility1);

        //ternary
        boolean eligibility = (age >= 21) ? true : false;
        System.out.println(eligibility);


        System.out.println("==============================");

        int ageOfVoter= 20;
        String result3 = " ";
        if(ageOfVoter>=18){
            result3 = "Yes.You can vote!";
        }else{
            result3= "No.You cannot vote!";
        }
        System.out.println(result3);
        String result4 = (ageOfVoter >= 18) ? "Yes.You can vote!" : "No.You cannot vote!";
        System.out.println(result4);
    }
}
