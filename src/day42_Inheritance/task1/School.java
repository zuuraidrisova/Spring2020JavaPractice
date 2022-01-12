package day42_Inheritance.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    /*
    	create 3 objects of student and set thier info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID

					School has a Student relationship
     */

    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.setStudentInfo("Zuura",29,'F',90133,"Batch18");
        st2.setStudentInfo("Sary", 29,'M',90111,"ComputerScience");
        st3.setStudentInfo("Aku",31, 'F',90333,"Languages2020");

        ArrayList<Student> group = new ArrayList<>();

        group.addAll(Arrays.asList(st1,st2,st3));

        for(Student each : group){

            System.out.println(each.name+" "+each.studentID+" "+each.schoolName);
        }

        for (Student each: group){

            each.attendClass("Java");
        }

    }

}
