package OfficeHours.ClassObjectPractice;

public class DeveloperObject {

    public static void main(String[] args) {


        Developer [] developers = { new Developer(), new Developer(), new Developer()};

        developers[0].setDeveloperInfo("Jack", "Senior Developer", 90111, 130000);
        developers[1].setDeveloperInfo("Sam", "Developer", 90222, 120000);
        developers[2].setDeveloperInfo("Sharon","Senior Developer",90333,130000);

        for(int i  = 0; i < developers.length; i++){

            System.out.println(developers[i]);
        }
        System.out.println("========================================================");

        for(Developer each : developers){

            each.code("Java");
            each.fix();
        }


    }
}
