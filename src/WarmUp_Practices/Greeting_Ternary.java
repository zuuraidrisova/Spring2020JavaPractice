package WarmUp_Practices;

public class Greeting_Ternary {
    public static void main(String []args){
        int hour = 22;
        String result =(hour<12)?"Good morning" : (hour>=12 && hour<18)?"Good afternoon" : "Good evening";
        System.out.println(result);
    }
}
