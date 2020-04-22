package day18_NestedLoops;

public class QuizQuestions {
    public static void main(String[] args) {
        int a =0;
        while(a<=6){
            a+=2;
        }
        System.out.println(a);//8

        int i=0;
        int j=7;
        for(i=0; i<j-1;i+=2){
            System.out.println(i+" ");//0,2,4
        }

        for(int b=0;b<=4;){
            b++;
            System.out.println(b);//1,2,3,4,5
        }

       // for(int c=0;c<5;c--){
        //    System.out.println("Hello Cybertek");//infinite loop
       // }
        int z=5;
        for(int s=5;s>0;s--){
            z+=s;
        }
        System.out.println(z);//20


    }
}
