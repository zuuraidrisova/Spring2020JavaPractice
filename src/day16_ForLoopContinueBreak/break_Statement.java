package day16_ForLoopContinueBreak;

public class break_Statement {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { //
            System.out.println("Hello world");
            if (i == 3){//
                break;//it exits the loop immediately
            }
        }


        for(char alphabet3= 'a'; alphabet3 <= 'z'; alphabet3++){

            System.out.print(alphabet3+" ");

            if(alphabet3=='d'){
                break;
            }

        }
    }
}