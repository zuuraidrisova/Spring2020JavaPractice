package reviewPracticing;

public class NestedIf_Tasks {

    public static void main(String[] args) {


        //eligible to vote

        boolean citizenship = false;
        int age = 8;

        if(citizenship){

            if(age >= 18){

                System.out.println("You are eligible to vote");
            }else{

                System.out.println("You are not old enough to vote");
            }
        }else{

            System.out.println("You are not American citizen");
        }

        // grading using score

        int score = 78;
        String grade = "";

        if(score >= 0 && score <= 100){

            if(score >= 90){

                grade = "A";

            }else if(score >= 80){

                grade = "B";

            }else if(score >= 70){

                grade = "C";

            }else if(score >= 60){

                grade = "D";

            }else{

                grade = "F";

            }

        }else{

            grade = "Invalid";

        }

        System.out.println("grade = " + grade);


        //getting loan

        double salary = 90000;
        byte workHistory = 1;

        if(salary >= 30000){

            if(workHistory >= 2){

                System.out.println("You are qualified for the loan");
            }else{

                System.out.println("You need at least 2 years of work experience");
            }

        }else{

            System.out.println("You are not qualified.You must at least earn 30k");
        }


        /*
        2. write a program that can display the days based on the numbers 1 ~ 7
        MUST USE NESTED IF
        precondition: valid number for the day
        */

        int day = 7;
        String nameOfDay = "";

        if(day >= 1 && day <= 7){

            nameOfDay = (day == 1)?"Monday":(day == 2)?"Tuesday":
                    (day == 3)?"Wednesday":(day == 4)?"Thursday":
                            (day == 5)?"Friday":(day==6)?"Saturday":"Sunday";
        }else{

            nameOfDay = "Invalid entry";

        }
        System.out.println("nameOfDay = " + nameOfDay);


        /*
        3. write a java program that can convert numbers between 0 ~ 9 to
        words, if the number is greater than 9 or less than zero, out put
        should be "Invalid".
         */

        int number = 9;
        String output = "";

        if(number >= 1 && number <= 9){

            output = (number == 1)?"One":(number == 2)?"Two":(number == 3)?"Three":
                    (number == 4)?"Four":(number == 5)?"Five":(number == 6)?"Six":
                            (number == 7)?"Seven":(number == 8)?"Eight":"Nine";

        }else{

            output = "Invalid entry";

        }

        System.out.println("output = " + output);


    }
}
