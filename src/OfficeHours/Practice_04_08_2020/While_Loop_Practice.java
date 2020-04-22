package OfficeHours.Practice_04_08_2020;

public class While_Loop_Practice {
    public static void main(String []args){
        /*
        while(condition){===> repeated if
            statement====>as long condition is true, it will run
        }

        execution flow:
                    condition;
                        if true: the statement gets executed
                                {statement}
                        if false: the statement will never get executed
         */
        int i=0;//where the loop should start
        while(i<5){//as long as this condition is true
            System.out.println(i);//because it prints if first and then updates it
            i++;//0,1,2,3,4==>because it is  less than 5 condition
            //iterator will make condition false at some point

        }

        System.out.println("=====================");

        int j=0;//where the loop should start
        while(j<5){//as long as this condition is true
            j++;//first it increases the value and
            // then prints 1,2,3,4,5==>because it is  less than 5 condition
            //iterator will make condition false at some point
            System.out.println(j);

        }

        System.out.println("+===================+");
        /*
        print numbers from 0~100 which can be divided by 15 evenly
         */

        int a =0;//where loop should start
        while(a <= 100){//condition between 0 to 100

            if(a%15==0){//give condition for only even ly divisible numbers
                System.out.print(a+" ");
            }
         a++;//updates the a
        }









    }
}
