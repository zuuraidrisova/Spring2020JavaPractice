package day10_Switch_Scanner;

public class Switch_Statement_Practice3 {
    public static void main(String []args){
        char ch = 'a';
        String result =" ";
        switch(ch){
            case 'A':
                result = "A";
                //System.out.println("A"); //it can be variable and initialized or println statement used
                break;
            case 'B':
                result="B";
                break;
            case 'C':
                result="C";
                break;
            case 'D':
                result="D";
                break;
            default:
                result="Not Found";

        }
        System.out.println(result);

    }
}
