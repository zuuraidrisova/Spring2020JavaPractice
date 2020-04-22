package Replit_Practices;


import java.util.Scanner;
public class Laptop_Replit {
    public static void main(String[] args) {
        double price = 0;
        String storageType , screenType, CPU;
        int ram = 0;
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        System.out.println("Select screen size:");
        screenType = scan.next();
        if(screenType.equals("13.3")){
            price+=200;
        }else if(screenType.equals("15.0")){
            price+=300;
        }else if(screenType.equals("17.3")){
            price+=400;
        }else{
            System.out.println("Invalid screen size");
        }


        System.out.println("Select CPU type:");
        CPU = scan.next();
        if(CPU.equals("i3")){
            price+=150;
        }else if(CPU.equals("i5")){
            price+=250;
        }else if(CPU.equals("i7")){
            price+=350;
        }else{
            System.out.println("Invalid CPU");
        }

        System.out.println("Select RAM size:");
        int ramSize = scan.nextInt();
            for(int i = 4; i<=ramSize; i+=4 ){
                price+=50;
            }


        System.out.println("Select storage type:");
        storageType = scan.next();
        System.out.println("Enter memory size:");
        int memory = scan.nextInt();
        if(storageType.equals("HDD")){
           for(int i = 500; i <= memory; i+=500){
               price+=50;
           }
        }else if(storageType.equals("SSD")){

            for(int i=500; i<=memory; i+=500){
                price+=100;
            }
        }else{
            System.out.println("Invalid storage type");
        }


        System.out.println("Enter screen resolution:");
        String resolution = scan.next();
        if(resolution.equals("FULLHD")){
            price+=100;
        }else if(resolution.equals("4K")){
            price+=200;
        }else{
            System.out.println("Invalid screen resolution");
        }


        System.out.println("Laptop price is: $"+price);

    }
}
