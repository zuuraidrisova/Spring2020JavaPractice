package day23_CustomMethods;

public class GallonsToLitersMethod {

    public static void main(String[] args) {
        /*
        write a method called GalonsToLitters, that can convert gallons to litters
	 			   1 G = 3.75 L
         */
        gallonsToLitters(30);
    }
    public static void gallonsToLitters(int gallons){

        double result = gallons * 3.75;

        System.out.println(result);
    }
}
