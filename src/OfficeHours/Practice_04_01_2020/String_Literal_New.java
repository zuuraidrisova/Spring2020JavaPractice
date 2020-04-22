package OfficeHours.Practice_04_01_2020;

public class String_Literal_New {
    public static void main(String []args){
        String str = "Java";//String literal goes to String pool
        String str2 = "Java";//String literal goes to String pool

        String str3 = new String("Java");//new string, goes to heap memory
        String str4 = new String("Java");//new string, goes to heap memory,
        // independent object will be created when new keyword is used


        System.out.println(str==str2);//true, because they are same object
        System.out.println(str==str3);//false, two different objects at different memory
        System.out.println(str3==str4);//false, they are independent


    }
}
