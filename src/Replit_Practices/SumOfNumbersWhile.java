package Replit_Practices;

public class SumOfNumbersWhile {
    public static void main(String[] args) {

        int i = 0;//where loop starts
        int sum = 0;//to store sum of all even numbers
        while( i <= 10){//while loop condition
            if(i % 2 == 0){//condition to get all even numbers
                sum += i;//to concat all sums
            }
            i++;//to make while loop condition false at some point so it can exit

        }
        System.out.println(sum);//print sum
    }
}
