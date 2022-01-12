package day49_Ploymorphism_Intro;

import java.util.ArrayList;
import java.util.Arrays;

/*
	1. create an interface named onlineEducation
			variable: boolean onlineStudent
			abstract methods: attendClass();
 */

interface onlineEducation{

    boolean onlineStudent = true;//public, static and final  by default

    void attendClass();//public abstract by default


}
/*
2. create an interface named Cybertek that can inherit from OnlineEducation
			variable: schoolName, requiresITBackGround
 */

interface Cybertek extends onlineEducation{

    String schoolName = "Cybertek";//public, static and final  by default

    void requiresITBackground();//public abstract by default

    void studying(String majot);
}
/*
3. create a class named Student that can inherit from  onlineEducation and CybertekSchool
			private variables: studentName, age, grade, has_ITBackGround

			encapsulate all private variables

			actions: studying(), takingBreaks(), toString()
 */
public class Student  implements onlineEducation, Cybertek{

   private String studentName;
   private int age;
   private double grade;
   private boolean hasItBackground;

   public String getStudentName(){

       return studentName;
   }
   public int getAge(){
       return age;
   }
   public double getGrade(){
       return grade;
   }
   public boolean getHasItBackground(){

       return hasItBackground;
   }

   public void setStudentName(String studentName){

       this.studentName = studentName;
   }
   public void setAge(int age){

       this.age = age;
   }
   public void setGrade(double grade){
       this.grade = grade;
   }
   public void setHasItBackground(boolean hasItBackground){

       this.hasItBackground = hasItBackground;
   }

   public Student(String studentName, int age, double grade, boolean hasItBackground){

       setStudentName(studentName);
       setAge(age);
       setGrade(grade);
       setHasItBackground(hasItBackground);
   }
   @Override
   public void attendClass(){

       if(onlineStudent) {
           System.out.println(getStudentName() + " is attending " + schoolName);
       }

   }
   @Override
   public void requiresITBackground(){

       System.out.println(schoolName+"  does not require IT Background");
   }

    @Override
   public void studying(String major){

       System.out.println(getStudentName()+ " is studying "+major);

   }

   public void takingBreaks(){

       System.out.println(getStudentName()+" is taking break");
   }
   @Override
   public String toString(){

       return "Student name: "+getStudentName()+", Student age: "+getAge()+", Student grade: "+getGrade()
               +", Student has IT Background: "+getHasItBackground();

   }
}
/*
	4. create a class named CybertekSchool
			create 5 objects of students and set your classmates' info
			create a list of Cybertek and store all student objects

			iterate the list to display the full information of students
 */

class CybertekSchool{

    public static void main(String[] args) {

        Student student1 = new Student("Cholpon", 29, 4.0, false);
        Student student2 = new Student("Zuura", 29, 4.0, false);
        Student student3 = new Student("Sary", 29, 4.0, true);
        Student student4 = new Student("Azat", 35, 3.3, false);
        Student student5 = new Student("Kiki", 23, 3.0, false);

        ArrayList<Cybertek> students = new ArrayList<>();

        students.addAll(Arrays.asList(student1,student2,student3,student4,student5));

        for(Cybertek each: students){

            System.out.println(each);
        }

        System.out.println("==========================================");

        for(int i = 0; i < students.size(); i++){

            students.get(i).attendClass();
        }

        System.out.println("===========================================");

        for(Cybertek each:  students){

            each.requiresITBackground();
        }

        System.out.println("===========================================");

        for(int i = 0; i < students.size(); i++){

            students.get(i).studying("SDET");
        }

        System.out.println("===========================================");

        student1.takingBreaks();


    }
}
