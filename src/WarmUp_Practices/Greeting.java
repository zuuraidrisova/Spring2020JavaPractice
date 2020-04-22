package WarmUp_Practices;

public class Greeting {
    public static void main(String []args){
        int hour = 2;
        if(hour < 12){
            System.out.println("Good morning!");
        }
        if(hour>=12 && hour<15 ){
            System.out.println("Good Afternoon");
        }
        if(hour >=15 ){
            System.out.println("Good evening");
        }
    }
}
