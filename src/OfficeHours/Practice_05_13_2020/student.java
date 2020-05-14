package OfficeHours.Practice_05_13_2020;

public class student {

    String name;
    long ID;
    static String  schoolName = "Cybertek";

    public student(String name, long ID){

        this.name = name;
        this.ID = ID;

    }
    public static void printSchoolName(){

        System.out.println("School name : "+schoolName);
    }

    public String toString(){

       return "Name: "+name +", ID: "+ID+", School name: "+schoolName;

    }


}

class studentObject{

    public static void main(String[] args) {

        student student1 = new student("Zuura",89123);
        student student2 = new student("Sary",90124);
        student student3 = new student("Maha",65322);
        student student4 = new student("Kira",54271);

        student [] students = {student1,student2,student3,student4};

        for(int i = 0; i < students.length; i++){

            System.out.println(students[i]);
        }

        System.out.println("***********************************************");

        for(student each : students ){

            System.out.println(each.name);
        }

        System.out.println("***********************************************");

        for(student each : students){

            System.out.println(each.ID);
        }
        System.out.println("***********************************************");

        for(int i = 0; i < students.length; i++){

            students[i].printSchoolName();
        }

        System.out.println("***********************************************");
    }
}