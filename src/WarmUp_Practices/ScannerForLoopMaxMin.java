package WarmUp_Practices;
import java.util.Scanner;
public class ScannerForLoopMaxMin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int mAx = -999999990;
        int min = 99999999;
        for(int i = 1; i <= 5; i++){
            System.out.println("Please enter a number: ");
            int num = scan.nextInt();

            if(num > mAx){
                mAx = num;
            }
            if(num < min){
                min = num;
            }
        }

        System.out.println(mAx);
        System.out.println(min);





    }
}
