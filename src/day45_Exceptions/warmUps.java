package day45_Exceptions;

public class warmUps {

    public static void main(String[] args) {

        //do pushUps 20 times

        int pushUps = 0;

        while(pushUps <= 20){

            System.out.println("Do PushUpss "+(pushUps+1));

            pushUps++;

            try{

                Thread.sleep(3000);

            }catch (Exception e){

            }
        }
    }
}
