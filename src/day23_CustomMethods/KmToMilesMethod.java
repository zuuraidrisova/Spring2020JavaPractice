package day23_CustomMethods;

public class KmToMilesMethod {

    public static void main(String[] args) {
        /*
         write a method called KmToMiles that can convert km to miles
	 				1 km = 0.612 miles
         */
        KmToMiles(100);

    }
    public static void KmToMiles(int km){

       double kmToMiles = (km * 0.612);

        System.out.println(kmToMiles);
    }
}
