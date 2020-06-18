package day51_Recap.Shape;

public interface Volume {
    /*
      2. create an interface named Volume
            variable: boolean hasVolume
            abstract method: calculateVolume() ==> returns double
     */

    boolean hasVolume = true; //public, static and final by default

    double calculateVolume();//abstract and public by default

}

interface PI{

    /*
     3. create an interface named PI
            variable: PI
            (created Volume & PI within same Java file)
     */

    double PI = 3.14;//public, static and final by default

}