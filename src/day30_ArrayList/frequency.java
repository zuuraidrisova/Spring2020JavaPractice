package day30_ArrayList;

public class frequency {

    public static void main(String[] args) {


        String [] str = {"Asan","Sary","Sary","Zuura"};

        String str1 = "Sary";

        int count = 0;


        for(int i = 0; i < str.length; i++){

            if(str[i] == str1){

                count++;

            }

        }

        System.out.println(count);


        String a = "asan alina sary sary zuura";

        String b = "sary";

        int count1 = 0;

        while(a.contains(b)){

            count1++;

            a = a.replaceFirst(b, "");
        }


        System.out.println(count1);







    }
}
