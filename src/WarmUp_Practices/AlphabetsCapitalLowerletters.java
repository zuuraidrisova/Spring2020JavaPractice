package WarmUp_Practices;

public class AlphabetsCapitalLowerletters {
    public static void main(String[] args) {

        String Upper ="";
        String Lower ="";

        for( char i = 'A'; i <= 'Z'; i++){
            Upper += i+" ";
        }

        System.out.println(Upper);

        for(char i = 'a'; i <= 'z'; i++ ){
            Lower += i+" ";
        }

        System.out.println(Lower);

        String result ="";

        for(int i = 0 ; i <= Upper.length()-1; i++){
            result+= ""+Upper.charAt(i) + Lower.charAt(i);
        }

        System.out.println(result);

    }
}
