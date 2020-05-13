package InterviewQuestions;

public class Finra {
    /*
    Write a method which prints out the numbers from 1 to 30 but for numbers
     which are a multiple of 3, print "FIN" instead of the number and for
     numbers which are a multiple of 5, print "RA" instead of the number.
      for numbers which are a multiple of both 3 and 5, print "FINRA"
      instead of the number.
     */
    public static void main(String[] args) {


        finra();

        System.out.println();

        System.out.println("============================================");

        finra2();
    }

    public static void finra() {

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.print(" FINRA: " + i);

            } else if (i % 3 == 0) {

                System.out.print(" FIN: " + i);

            } else if (i % 5 == 0) {

                System.out.print(" RA: " + i);

            } else {

                System.out.print(" No match: " + i);
            }

        }
    }

    public static void finra2(){

        for(int i = 1; i <= 30; i++){

            if(i % 3 == 0 && i % 5 == 0){

                System.out.print(" Finra : "+i);

            }else if(i % 3 == 0){

                System.out.print(" Fin : "+i);

            }else if(i % 5 == 0){

                System.out.print(" Ra: "+i);

            }else{

                System.out.print(" No match : " +i);
            }
        }
    }
}
