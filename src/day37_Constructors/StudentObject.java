package day37_Constructors;

public class StudentObject {

    public static void main(String[] args) {

        Students student1 = new Students("Mike", 19, 'M', "Life University");

        //student1.setStudentInfo("Mike", 19, 'M', "Life University");

        System.out.println(student1);

        Students student2 = new Students("Sha",35,'M',"Harvard");

        System.out.println(student2);

    }
}
