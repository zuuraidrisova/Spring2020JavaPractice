package day49_Ploymorphism_Intro;

import java.util.Scanner;

public class countJavaPython {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        System.out.println(word);

        int countJava = 0;
                    //java is 4 chars
        for(int  i = 0; i <= word.length()-4; i++){

            if(word.substring(i, i+4).equals("java")){

                countJava++;
            }
        }

        int countPython = 0;
        //python is 6 chars
        for(int i = 0; i <= word.length()-6; i++){

            if(word.substring(i,i+6).equals("python")){

                countPython++;

            }
        }

        System.out.println("Number of java is: "+countJava);
        System.out.println("Number of python is: "+countPython);

        if(countJava == countPython){

            System.out.println(true);
        }else{

            System.out.println(false);
        }

        for(int i = 1; i <= 7; i++){

            for(int j = 1; j <= i; j++){

                System.out.print("* ");
            }

            System.out.println();
        }


    }
}
