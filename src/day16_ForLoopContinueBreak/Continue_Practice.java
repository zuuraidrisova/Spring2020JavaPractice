package day16_ForLoopContinueBreak;

public class Continue_Practice {
    public static void main(String[] args) {

        for(char ch= 'Z'; ch >= 'A'; ch--){

            if(ch=='Z'){
                continue;//SKIP THAT
            }
            if(ch=='U'){
                continue;
            }
            if(ch=='R'){
                continue;
            }
            if(ch=='A'){
                continue;
            }
            System.out.print(ch+" ");//alphabet without ZURA letters

        }
        System.out.println();

        for(char ch='A'; ch<='Z'; ch++){

            if(ch=='C' || ch=='U' || ch=='B' || ch=='A'){

                continue;
            }
            System.out.print(ch+" ");//alphabet without CUBA letters
        }

        System.out.println("++++++++++++");

        for(int i=1; i<=100; i++){

            if(i%3==0 || i%5==0){

                continue;
            }
            System.out.print(i+" ");
        }

    }
}
