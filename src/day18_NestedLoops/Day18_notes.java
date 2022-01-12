package day18_NestedLoops;

public class Day18_notes {
            /*
            04/07/2020
        Topics: do-While loop
        while vs do-while
        nested loop
        package name: day18_nestedLoops
        warmup tasks:
        1. write a program that can divide two numbers. ( Assume that first
        number is greater than the second)
        NOTE: DO NOT USE division, multiplication, or module operators
        2. write a program that can return the factorial number of any given
        number
        Ex:
        input: 5
        output: 120
        because:
        5! = 5 * 4 * 3 * 2* 1 = 120
        go to canvas -> java -> modules -> day18 -> complete the loops short quiz
        PLEASE DO NOT USE SAFARI OR IE BROWSERS
        while(8 < 6){
        sout("Hello");
        }
        if condition is false in while loop, the statement never
        gets executed
        do-while loop: at least gets exected one time regardless of the condition
        do{
        statements;
        }while(Condition);
        statement gets executed one time if the condition is
        false
        1. executed the statements
        2. check the conditon
        if thge condition is true:
        repearts the step 1
        if condition is false:
        stops the execution of the
        loop
        while vs do while:
        when condition is false. do-while gets executed once
        when condition is false, while loop or for loop will
        NEVER gets executed
        break statements: exits the loop & switch statement
        continue: skips the current iteraion, everything in the loops body will be
        skipped for that itreration
        System.exit(0): terminates everything, exits the entire program
        nested if: if statement contains another if
        nested loop: loop is inside another loop
        for(int i=1; i <=10; i++){
        for(int i= 1; i <= 5 ; i++){   // 1,2,3,4,5
        sout(i);
        }
        }
        ==> 1,2,3,4,5
        1,2,3,4,5
        1,2,3,4,5
        1,2,3,4,5
        1,2,3,4,5
        outer loop repeats the inner loop
        for(ini; condition; iterator){
        for(int2; condition2; iterator2){
        statements
        }
        }
        while(condition){
        while(condition){
        }
        }
        for(ini; condition; iterator){
        while(condition){
        }
        }
        when do we use nested loop: whenevr we need to repeat the loop, we will
        use nested loop
        /*
        finding the frequnecy of characters
        "AAABBBCCC" == "A3B3C3"
        */
}

