package day16_ForLoopContinueBreak;

public class ContinueStatementForLoop {

    public static void main(String []args){

        for(int i =1; i<=5; i++){//1,2,3,4,5

           // System.out.println(i);//all iterations will be printed, if sout here
            if(i == 3){

                continue;

            }
            System.out.println(i);//3 will be skipped

        }

        System.out.println("++++++++++++++++");

        for(int i=0; i<=20; i++){

            if(i%2!=0){//condition to identify all odd numbers

                continue;//this statement will skip odd numbers
            }
            System.out.println(i);
        }

        System.out.println("===============");

        for(int i=0;i<=20;i++){

            if(i%2==0){//identify all even numbers

                continue;//skip all even numbers in loop
            }
            System.out.println(i);
        }
        System.out.println("++++++++++++++++++");

        for(int i=0;i<=20;i++){

            if(i%2==0){//identify all even numbers in loop

                continue;//skip all even numbers in loop
            }

            if(i%2!=0){//identify all odd numbers in loop

                continue;//skip all odd numbers in loop
            }
            System.out.println(i);
        }

    }
}
