package day37_Constructors;

public class Quiz {

    String name;
    int age;


}

class Test{

    public static void main(String[] args) {

        Quiz obj1 = new Quiz();

        System.out.println(obj1.name);
        System.out.println(obj1.age);
    }
}

class Test2{

    static String studentName = "Mike";

    static {

        studentName = "Jordan";

    }

    public static void main(String[] args) {


        studentName = "Jean";

        System.out.println(studentName);
    }
}

class test3{

    int score;

    static {

       // score = 75; it is compiler error bcs static accepts just static
    }
}