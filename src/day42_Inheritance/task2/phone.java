package day42_Inheritance.task2;

public class phone extends device{
    /*
    create ba class called phone:
				attributes: brand, model, price, country inherited all
				methods: call, text, constructor should be declared

				toString is inherited

				phone is a device relationship

     */
    public phone(String brand, String model,double price, String country, String size){

        setDeviceInfo(brand, model, price, country,"Phone",size);
        // we can call method to initialize variables

    }
    public void call(long phoneNumber){

        System.out.println("calling the number  "+phoneNumber);
    }

    public void text(long phoneNumber){

        System.out.println("texting to "+phoneNumber);
    }


}

class phoneObject{

    public static void main(String[] args) {

        phone obj = new phone("Iphone","XR",800,"USA","medium");

        System.out.println(obj);

        obj.call(1092374);
        obj.text(9807112);
    }
}