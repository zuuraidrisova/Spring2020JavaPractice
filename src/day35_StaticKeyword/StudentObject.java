package day35_StaticKeyword;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();


        student1.setStudentInfo("Zuura", 90234, 4.0);
        student2.setStudentInfo("Kuba", 90111, 3.5);
        student3.setStudentInfo("Chopa", 90333, 4.0);

        Student [] students = {student1, student2,student3};

        for(Student each : students){

            System.out.println(each);
        }

        student1.printSchoolName();//can be called thru the object
        Student.printSchoolName();//can be called thru the class



    }
}
