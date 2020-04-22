package WarmUp_Practices;

public class FinraExercise {
    public static void main(String[] args) {
        // 1~30...=> if num is divisible by 3 it is FIN
        // If num is divisible by 5 it is RA
        //if it is divisible by both 3 and 5 it is FINRA

        for(int i=1; i <= 30; i++){
            if(i%3==0 && i%5==0) {
                System.out.print(i+" FINRA");
            }else if(i%5==0){
                System.out.print(" "+i+" RA");
            }else if(i%3==0){
                System.out.print(" "+i+ " FIN");
            }

        }

    }
}
