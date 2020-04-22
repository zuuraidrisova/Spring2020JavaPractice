package day18_NestedLoops;

public class do_while_Practice {
    public static void main(String[] args) {
        //print all even numbers 0~100 in same line separated by space

        int num=0;
        do{
            if(num%2 ==0){//divides number by 2 and if there is no remainder
                System.out.print(num+" ");//prints this statement
            }
            num++;//updates the number

        }while(num<=100);//as long as number is less or equal to 100

        System.out.println();

        System.out.println("==============");

        int i=1;//2
        do{
            System.out.println(i);
            i++;
        }while(i<=5);

        System.out.println("================");


        int z=1;
        do{
            System.out.println(z);
            if(z==2){
               break;
            }

            z++;

        }while(z<=5);


        System.out.println("=============");


        int y=1;//where loop should start
        do{//should execute this at least once regardless of condition
            if(y==3){//needs to skip when y is equal to 3
                y++;//needs to make sure that iterator is not skipping
                // so that condition eventually be false
                continue;//needs to skip when y is equal to 3
            }

            System.out.println(y);
            y++;

        }while(y<=5);





    }

}
