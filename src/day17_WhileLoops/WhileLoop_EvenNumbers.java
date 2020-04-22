package day17_WhileLoops;

public class WhileLoop_EvenNumbers {
    public static void main(String[] args) {

        /*
        write a program using while loop, that calculates the sum of the all even numbers
        between 0~10
         */
        int i = 0;//initialization, where loop should start
        int sum = 0;
        while(i <= 10) {//condition, where loop should end,or as long as this loop is true
            if (i % 2 == 0) {//to get all even numbers
                System.out.println(i);//to print it in console
                sum += i;
            }
            i++;//to update the numbers
        }
        System.out.println(sum);

        System.out.println("+==================+");

        int sum2 = 0;
        for(int j = 0; j <= 10;j++){
            if(j % 2 == 0){
                System.out.println(j);
                sum2 += j;
            }

        }
        System.out.println(sum);

    }
}
