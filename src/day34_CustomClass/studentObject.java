package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class studentObject {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setStudentInfo("Adam","British",
                23, 3.7,'M',true);

        System.out.println( student1 );

        Student student2 =new Student();

        student2.setStudentInfo("Sary","Kyrgyz",29,
        2.0, 'M',true);

        System.out.println(student2);

        Student student3 = new Student();

        student3.setStudentInfo("Zuura","Kyrgyz", 29,
                4.0, 'F', true);

        System.out.println(student3);

        Student student4 = new Student();

        student4.setStudentInfo("Gulya", "Kyrgyz", 34,
                1.0, 'F', false);

        System.out.println(student4);

        System.out.println("====================================");

        Student [] students = {student1,student2, student3, student4};

        System.out.println(Arrays.toString(students));

        System.out.println("====================================");

        ArrayList<Student> canGraduate = new ArrayList<>();

        canGraduate.addAll(Arrays.asList(students));

        System.out.println(canGraduate);

        System.out.println("====================================");

        Predicate<Student> fail = s -> s.GPA < 3.0;

        canGraduate.removeIf(fail);

        System.out.println(canGraduate);

        System.out.println("====================================");

        for(int i = 0; i < canGraduate.size(); i++){

           Student each = canGraduate.get(i);

            System.out.println(each.name+" can graduate");
        }

        System.out.println("=============================");

        ArrayList<Student> cannotGraduate = new ArrayList<>();

        cannotGraduate.addAll(Arrays.asList(students));

        System.out.println(cannotGraduate);

        System.out.println("================================");

        cannotGraduate.removeIf(p -> p.GPA > 3.0);

        System.out.println(cannotGraduate);

        System.out.println("================================");

        for(Student each : cannotGraduate){

            System.out.println(each.name + " cannot graduate");
        }

    }
}
