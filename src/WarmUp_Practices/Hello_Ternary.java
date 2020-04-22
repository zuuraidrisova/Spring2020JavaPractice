package WarmUp_Practices;

public class Hello_Ternary {
    public static void main(String []args){
        int hour = 10 ;
        String sayHi = (hour>12)?"Good morning":(hour >=12 && hour <18)?"Good afternoon":"Good evening";
        System.out.println(sayHi);
    }
}
