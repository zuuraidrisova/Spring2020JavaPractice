package day13_StringClass;

public class String_Literals_Practice {
    public static void main(String[] args) {
        String str = "Cat";//it goes to string pool memory
        String str2 = new String("Cat");//Java Heap
        System.out.println(str+" : "+str2);
        System.out.println(str == str2); //false, two different objects.
                                    // because they belong to two different memory locations

        String str3 = "Cat";//String pool
        System.out.println(str ==str3);//true,

        String str4 =new String("Cat");
        System.out.println(str2==str4);//false, because independent objects are created,when we use new keyword

        //STRING OBJECTS ARE IMMUTABLE, CANNOT BE MODIFIED
        String s1 = "Java";//it goes to String pool//no longer available bcs it is reassigned
        s1 ="JavaScript";//string objects cannot be modified but new String object can be reassigned
        System.out.println(s1);//JavaScript

        String s2 = "Java";//this is literal String, it goes to String pool, no duplicates
        //no new object will be created in the memory, variables s1 and s2 are sharing the same value
        System.out.println(s1==s2);//false, bcs s1 is now Javascript and s2 is java, both are in string pool





    }
}
