package day50_PolymorphismContinue;

public class Inheritance {

    public int publicVariable = 100;
    protected int protectedVariable = 300;
    int defaultVariable = 200;
    private int privateVariable = 400;


}

class Data extends Inheritance {

    public static void main(String[] args) {

        Data obj = new Data();

        System.out.println(obj.publicVariable);//can be inherited everywhere in sunclasses
        System.out.println(obj.protectedVariable);//can be inherited in sub classes
        System.out.println(obj.defaultVariable);//can be inherited in  subclasses within the same package

       // System.out.println(obj.privateVariable); ==> cannot be inherited
    }

}