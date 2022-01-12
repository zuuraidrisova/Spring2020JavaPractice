package day36_StaticBlocks;

class Tester{// access modifier is default

    public static void main(String[] args) {

        System.out.println("Tester class");
    }

}
class Developer{// access modifier can only be  default

    public static void main(String[] args) {

        System.out.println("Developer class");
    }

}

class scrumTeam{// access modifier is default

    public static void main(String[] args) {

        System.out.println("Scrum Team class");
    }

}

public class MultiClass {

    //in any java file we can have more than one class,
    //but only one class can be public
    //public class name must match with file name...
    //this class is public and it matches with MultiClass.java
    // public class position does not matter, it can come first, last, in the middle
    //we cannot run all classes at once

    public static void main(String[] args) {

        System.out.println("Public class");
    }


}
