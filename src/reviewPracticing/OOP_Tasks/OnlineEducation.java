package reviewPracticing.OOP_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public interface OnlineEducation {
    /*
    	Task01:
	1. create an interface named onlineEducation
			variable: boolean onlineStudent
			abstract methods: attendClass();

	2. create an interface named Cybertek that can inherit from OnlineEducation
			variable: schoolName, requiresITBackGround

	3. create an class named Student that can inherit from  onlineEducation and CybertekSchool
			private variables: studentName, age, grade, has_ITBackGround

			encapsulate all private variables

			actions: studying(), takingBreaks(), toString()

	4. create a class named CybertekSchool
			create 5 objects of students and set your classmates' info
			create a list of Cybertek and store all student objects

			iterate the list to display the full information of students

     */

    public static final boolean onlineStudent = true;

    void attendClass();

}

interface Cybertek extends OnlineEducation {

    String schoolName = "Cybertek";
    boolean requiresITBackground = true;

}

final class Students implements OnlineEducation,Cybertek{

    private String studentName;
    private int age;
    private double grade;
    private boolean hasIT_background;

    public String getStudentName(){

        return studentName;
    }

    public int getAge(){

        return age;
    }

    public double getGrade(){

        return  grade;
    }

    public boolean getHasIT_background(){

        return hasIT_background;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setHasIT_background(boolean hasIT_background) {
        this.hasIT_background = hasIT_background;
    }

    @Override
    public void attendClass(){

        System.out.println(getStudentName()+" attends class");
    }

    public void studying(){

        System.out.println(getStudentName()+" is studying");
    }

    public void takingBreaks(){

        System.out.println(getStudentName()+" is taking a break");
    }

    @Override
    public String toString(){

        return getStudentName()+" "+getAge()+" "+getGrade();
    }

    public Students(String studentName, int age, double grade, boolean hasItBackground){

        setStudentName(studentName);
        setAge(age);
        setGrade(grade);
        setHasIT_background(hasItBackground);
    }

}

class CybertekStudents{

    public static void main(String[] args) {

        Students student1 = new Students("Cholpon", 29, 88, false);
        Students student2 = new Students("Zuura", 29, 4.0, false);
        Students student3 = new Students("Sary", 29, 4.0, true);
        Students student4 = new Students("Azat", 35, 3.3, false);
        Students student5 = new Students("Kiki", 23, 3.0, false);


        ArrayList<Students> students = new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5));

        for (Students student: students){

            System.out.println(student);
        }
    }
}