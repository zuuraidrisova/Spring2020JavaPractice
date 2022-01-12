package reviewPracticing.OOP_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public interface Downloadable {
    /*
    Task02:
	1. create an interface named downloadable:
			variable: boolean downloadable
			abstract method: download();

	1. create an interface named AndroidApps that can inherit from downloadable interface
			variable: AppStoreName

	2. create an interface named AppleApps that can inherit from downloadable interface
			variable: AppStoreName

	3. create an abstract class named Phone
			variables: brand, model, price, size
			abstract methods: texting(), calling(), toString()

	4. create a class named iPhone that can inherit from AppleApps interface and phone class
			actions that every iphone can do: texting(), calling(), faceTiming(), selfie()

	5. create a class named Nokia that can inherit from AndroidApps interface and phone class
			actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()


	in each sub classes of phone, create a constructor to initialize the instances

     */

    boolean downloadable = true;//static, final and public by default

    public abstract void download();


}

interface AndroidApps extends Downloadable{

    public static final String appStoreName = "Android Apps";

}

interface AppleApps extends Downloadable{

    public static final String appStoreName = "Apple Apps";
    //variables in interface all are public, static and final by default

}

abstract class phones{

    public static String brand;
    public String model;
    public String size;
    public double price;


    public abstract void texting(long phoneNumber);

    public abstract void calling(long phoneNumber);

    public String toString(){

        return brand+" "+model+" "+size+" "+price;
    }
}

final class iphone extends phones implements AppleApps{

    public iphone(String model, String size, double price){

        this.brand = "Iphone";
        this.model = model;
        this.size = size;
        this.price = price;

    }

    @Override
    public void download() {

        System.out.println(brand+" "+model+" is downloading from "+appStoreName);
    }


    @Override
    public void texting(long phoneNumber){

        System.out.println(brand+" "+model+" is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber){

        System.out.println(brand+" "+model+" is calling "+phoneNumber);

    }

    public void faceTiming(long phoneNumber){

        System.out.println(brand+" "+model+" is facetiming "+phoneNumber);

    }

    public void selfie(){

       System.out.println(brand+" "+model+" is taking a selfie");
    }

}

final class nokia extends phones implements AndroidApps{

    public nokia(String model, String size, double price){

        this.brand = "Nokia";
        this.model = model;
        this.size = size;
        this.price = price;

    }

    @Override
    public void download() {

        System.out.println(brand+" "+model+" is downloading from "+appStoreName);
    }


    @Override
    public void texting(long phoneNumber){

        System.out.println(brand+" "+model+" is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber){

        System.out.println(brand+" "+model+" is calling "+phoneNumber);

    }

    public void freezing(){

        System.out.println(brand+" "+model+" is freezing");

    }

    public void breakFloor(){

        System.out.println(brand+" "+model+" can easily break the floor");

    }

}

class phoneObjects{


    public static void main(String[] args) {

        iphone iphone1 = new iphone("XR", "medium",830);
        iphone iphone2 = new iphone("6S", "small",400);
        iphone iphone3 = new iphone("11","medium",560);
        iphone iphone4 = new iphone("12","large",900);


        ArrayList<iphone> iphones = new ArrayList<>();

        iphones.addAll(Arrays.asList(iphone1,iphone2,iphone3,iphone4));

        for (iphone iphone: iphones){

            System.out.println(iphone);
        }

       for (int i = 0; i < iphones.size(); i++){

           iphones.get(i).calling(983274);
           iphones.get(i).texting(39826416);
           iphones.get(i).download();
           iphones.get(i).faceTiming(9384912);
           iphones.get(i).selfie();

           System.out.println("***************************************");

       }

       nokia nokia = new nokia("Nokia9 Pureview","medium",300);
       nokia nokia2 = new nokia("nokia lumia","small",120);
       nokia nokia1 = new nokia("nokia x","medium",230);

       ArrayList<nokia> nokias = new ArrayList<>(Arrays.asList(nokia,nokia1,nokia2));

        System.out.println("***************************************");

        for (nokia each: nokias){

            System.out.println(each);
        }

        System.out.println("***************************************");

        for (nokia each: nokias){

            each.calling(9843291);
            each.texting(3092302);
            each.breakFloor();
            each.download();
            each.freezing();

            System.out.println("***************************************");

        }

        System.out.println("==========================================");

        //polymorphism
        phones[] phones = {iphone1,iphone2,iphone3,iphone4,nokia,nokia1,nokia2};

        for (phones each: phones){

            System.out.println(each);
        }

    }
}