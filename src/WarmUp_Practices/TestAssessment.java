package WarmUp_Practices;

public class TestAssessment {
    public static void main(String[] args) {
        int score =0;
        if(score==0){
            score+=50;
        }
        if(score!=0){
            score+=50;
        }
        System.out.println(score);

        boolean A= true, B= !false;
        if(B){
            System.out.println("B");
        }else if(A){
            System.out.println("A");
        }else{
            System.out.println("C");
        }

        boolean x =true;
        boolean y = !x ==false;
        boolean z = y;

        if(x){
            System.out.println("Hello everyone");
        }
        if(y){
            System.out.println("Today is great day");
        }
        if(z){
            System.out.println("We are improving everyday");
        }

    }
}
