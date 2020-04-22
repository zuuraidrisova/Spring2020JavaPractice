package OfficeHours.Practice_04_08_2020;

public class Do_While_Loop_Practice {
    public static void main(String[] args) {
/*
do-while function is same with while loop, but only difference is when condition is false
do-while loop will at least execute loop's body once, but while loop does not excute
the condition if it is false

    do{
        statement;
        }while(condition);

        execution flow:
                    statement;
                    condition;
                            if true: repeats the step
                            if false: stops the loop, after first execution of statement

 */

        boolean b = false;//if we set it true it will print infinitely

        while(b){//condition is false
            System.out.println("Hello");//so this statement will never get executed
        }

        do{//it will print the statement into console at least once no matter what
            System.out.println("Hello");
        }while(b);//then compiler checks the condition and realizes that it is false
        // and then stops the loop


        System.out.println("==========================");

        int j =0;//where should do while loop start
        do{//prints the statement regardless of condition
            if(j%15==0) {//to print only numbers which are divisible by 15 without remainder
                System.out.print(j + " ");

            }
            j++;//updates the number, to make condition false

        }while(j<=100);//condition where loop should end

    }
}
