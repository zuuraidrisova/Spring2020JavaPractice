package day09_NestedIfStatements_Ternary;


public class NestedIf_Statement {
    public static void main(String[] args) {
        //if the condition is evaluated to multiple scenarios
        //we use it when we have pre-condition
        /*
        if(pre-condition){
            statement A
            if(condition1){
            statement B
            }
            }
         */

        int age = 17;
        boolean USCitizen = false;

        if (USCitizen) {//if this pre-condition is true, we can put other conditions under it
            if (age > 17) {//if it is true
                System.out.println("You are eligible to vote!");
            } else {//if pre-condition is true and first if condition under pre-condition is false
                System.out.println("Grow up first and then vote!");
            }

        } else {//if pre-condition is false
            System.out.println("Become US citizen and then vote! ");

            //open if put another if else inside and then close with else

            System.out.println("++++++++++++++++++++++");

            int score = 87;
            String grade = " ";

            if (score >= 0 && score <= 100) {//if condition can be evaluated to multiple scenarios
                //inner if statements==nested if
                if (score >= 90){//false, so it is not gonna run
                    grade = "A";
                } else if (score >= 80){//it is true , this will get executed
                    grade = "B";
                } else if (score >= 70){//compiler does not check it because conditions are met
                    grade = "C";
                } else if (score >= 60){//compiler skips it becase compiler already found its answer
                    grade = "D";
                } else{//compiler does not read it
                    grade = "F";
                }


            } else {
                grade = "Invalid score";
            }
            System.out.println(grade);
        }



        }
    }
