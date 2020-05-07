package day35_StaticKeyword;

public class staticPractice2 {

        String brand;
        String model;
        static boolean hasWheels = true;

        public void printBrand(){

            System.out.println(brand);

        }
        public void printModel(){

            System.out.println(model);
        }


    public static void main(String[] args) {

        System.out.println(hasWheels);

          staticPractice2 car1 = new staticPractice2();

          car1.brand = "Toyota";
          car1.model = "Camry";

            car1.printBrand();
            car1.printModel();

    }

}
