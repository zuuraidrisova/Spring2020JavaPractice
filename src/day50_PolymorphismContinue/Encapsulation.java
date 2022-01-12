package day50_PolymorphismContinue;

public class Encapsulation {

   private String userName = "Cybertek"; //private

    public String getUserName(){

        return userName;
    }

    public void setUserName(String userName){

        this.userName = userName;
    }

}

class Test{

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();

        System.out.println( obj.getUserName());

        obj.setUserName("MIT");

        System.out.println(obj.getUserName());//

    }

}