package day37_Constructors;

public class StaticReview {

    static int a;//only one copy

    int b;// 2, each object has its own copy of instance variable

    public static void main(String[] args) {

        StaticReview obj1 = new StaticReview();

        obj1.a = 20;
        obj1.b = 10;

        StaticReview obj2 = new StaticReview();

        obj2.a = 40;
        obj2.b = 30;

        System.out.println(obj1.a +" "+obj1.b);// 40  10
        System.out.println(obj2.a+" "+obj2.b);// 40  30
    }

}
