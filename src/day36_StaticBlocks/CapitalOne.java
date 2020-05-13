package day36_StaticBlocks;


public class CapitalOne {

    public static void main(String[] args) {

        System.out.println(HumanResources.developer1);
        //developer1 is initialized inside main method, so values will be null

        System.out.println(HumanResources.developer2);

        //we can change the dev's values later

        HumanResources.developer3.setDeveloperInfo("Sia", 12365, "Developer", 120000);

        System.out.println(HumanResources.developer3);






}
}
