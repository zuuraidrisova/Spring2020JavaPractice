package day40_Encapsulation;

public class Test {

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        //System.out.println(obj.SSN); cannot be accessed directly

        System.out.println(obj.getSSN());//it is not accessible directly, bcs it is private

        //obj.SSN = 108321; cannot be set value directly

        obj.setSSN(12345);

        System.out.println(obj.getSSN());//now after we set, we have private value

    }

}
