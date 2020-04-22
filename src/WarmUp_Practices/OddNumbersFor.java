package WarmUp_Practices;

public class OddNumbersFor {
    public static void main(String[] args) {

        for(int i = 0; i <= 100 ;i++){
            if(i % 2 != 0){
                if(i %3 == 0 && i % 5 ==0){
                    System.out.println(i);
                }
            }
        }

        for(int i = 0; i <= 100; i++){
            if(i % 2 ==0){
                if( i % 3 ==0 && i % 5 == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
