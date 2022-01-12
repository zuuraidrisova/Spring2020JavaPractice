package day48_AbstractionInterface;

public interface defaultMethod {
    /*

    default method is a special method which only interface can have

     */
    default void defaultMethod(){

        System.out.println("This is a default method");
    }

    public static void main(String[] args) {

      //  defaultMethod();
      //  cannot be used, bcs it is not static method

    }


}

class N implements defaultMethod{


    public static void main(String [] args){

        N obj  = new N();

        obj.defaultMethod();
        //default method can be executed only after it is inherited and object is created
    }
}