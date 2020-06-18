package WarmUp_Practices.InterfacePractice;

import java.util.ArrayList;
import java.util.Arrays;

public interface Downloadable {

    /*

Task02:
	1. create an interface named downloadable:
			variable: boolean downloadable
			abstract method: download();
			*/

    boolean downloadable = true;//public, static and final by default

    void download();//public and abstract by default
}
    /*
	1. create an interface named AndroidApps that can inherit from
	downloadable interface
			variable: AppStoreName
*/

interface AndroidApps extends Downloadable{

    String appStoreName = "Android Store"; //static, final, public by default
}
    /*
	2. create an interface named AppleApps that can inherit from
	downloadable interface
			variable: AppStoreName
*/
interface AppleApps extends Downloadable{

    String AppStoreName = "Apple Store"; //static, final, public by default
    }

    /*
	3. create an abstract class named Phone
			variables: brand, model, price, size
			abstract methods: texting(), calling()
*/
abstract class Phone{

    public static String brand;
    public String model;
    public double price;
    public String size;

    abstract void texting(long phoneNumber);
    abstract void calling(long phoneNumber);
    }
 /*
	4. create a class named iPhone that can inherit from AppleApps interface
			actions that every iphone can do: texting(), calling(), faceTiming(),
			 selfie()
*/
 class Iphone extends Phone implements AppleApps{

     public Iphone(String model, double price, String size){

         this.brand = "Iphone";
         this.model = model;
         this.price = price;
         this.size = size;

     }
     @Override
     public void texting(long phoneNumber){

         System.out.println(brand+ " texting "+phoneNumber);
     }
     @Override
     public void calling(long phoneNumber){

         System.out.println(brand+ " calling "+phoneNumber);
     }
     @Override
     public void download(){

         System.out.println(model+ " downloading from: "+AppStoreName);
     }

     public void facetiming(long phoneNumber){

         System.out.println(brand+ " facetiming "+phoneNumber);
     }

     public void selfie(){

         System.out.println(brand+" "+model+ " taking a beautiful selfie");
     }

     public String toString(){

         return "Brand: "+brand+", Model: "+model+", Size: "+size+", Price: "+price;
     }


 }
 /*
	5. create a class named Nokia that can inherit from AndroidApps interface
			actions that Nokia can do: texting(), calling(), freezing(),
			 breakTheFloor()

	in each sub classes of phone, create a constructor to initialize the instances
     */

 class Nokia extends  Phone implements  AndroidApps{

     public Nokia(String model, double price, String size ){

         this.brand = "Nokia";
         this.model = model;
         this.price = price;
         this.size = size;
     }
     public void texting(long phoneNumber){

         System.out.println(brand+ " texting "+phoneNumber);
     }
     public void calling(long phoneNumber){

         System.out.println(brand+ " calling "+phoneNumber);
     }

     public void download(){

         System.out.println(model+ " downloading from "+appStoreName);
     }

     public void freezing(){

         System.out.println(brand+" "+model+" freezing... ");
     }

     public void breakTheFloor(){

         System.out.println(brand+" "+model+" breaking bad...");
     }

     public String toString(){

         return "Brand: "+brand+", Model: "+model+", Size: "+size+", Price: "+price;
     }


 }

 class PhoneObjects{

     public static void main(String[] args) {

         Iphone iphone1 = new Iphone("XR", 810,"medium");
         Iphone iphone2 = new Iphone("6S", 250,"small");
         Iphone iphone3 = new Iphone("11",450,"medium");
         Iphone iphone4 = new Iphone("8",750,"large");


         ArrayList<Iphone> iphones = new ArrayList<>(Arrays.asList(iphone1,iphone2,iphone3,iphone4));

         for(int i = 0; i < iphones.size(); i++){

             System.out.println(iphones.get(i));
         }

         System.out.println("***************************************");

         for(Iphone each : iphones){

             each.calling(742139875);
         }

         System.out.println("***************************************");

         for(Iphone each : iphones){

             each.selfie();
         }

         System.out.println("***************************************");

         for(int i = 0; i < iphones.size(); i++){

             iphones.get(i).download();
         }

         System.out.println("***************************************");

         Nokia nokia1 = new Nokia("Nokia9 Pureview",500,"medium");
         Nokia nokia2 = new Nokia("Nokia220",70,"small");
         Nokia nokia3 = new Nokia("Nokia Lumia",195,"medium");
         Nokia nokia4 = new Nokia("7.2",350,"large");

         Nokia [] nokias = {nokia1,nokia2,nokia3,nokia4};

         for(int i = 0; i < nokias.length; i++){

             System.out.println(nokias[i]);
         }

         System.out.println("***************************************");

         for(Nokia each: nokias){

             each.calling(32746);
         }
         System.out.println("***************************************");

         for(int i = 0; i < nokias.length; i++){

             nokias[i].breakTheFloor();
         }

         System.out.println("***************************************");

         for(Nokia each: nokias){

             each.download();
         }

     }
 }