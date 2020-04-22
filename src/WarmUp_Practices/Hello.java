package WarmUp_Practices;

public class Hello {
    public static void main(String []args){

        int hour = 10 ;
        if(hour<12){
            System.out.println("Good morning!");
        }else if(hour>=12 && hour<15){
            System.out.println("Good afternoon!");
        }else{
            System.out.println("Good evening!");
        }
    }
}
