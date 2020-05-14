package OfficeHours.ClassObjectPractice;

public class student {
    /*
    Create a class named 'Student' with String variable 'name' and integer
     variable 'roll_no'. Assign the value of roll_no as '2' and that of
      name as "John" by creating an object of the class Student.
     */
    /*

Assign and print the roll number, phone number and address of two students
 having names "Sam" and "John" respectively by creating two objects of class
 'Student'.
     */

    String name;
    int roll_no;
    long phoneNumber;
    String address;

    public student(String name, int roll_no, long phoneNumber, String address){

        this.name = name;
        this.roll_no = roll_no;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

}

class studentObject{

    public static void main(String[] args) {

        student st1 = new student("John", 2, 773546276, "Bay Village");
        student st2 = new student("Sam",4, 98743626, "Euclid");


        System.out.println("Name: "+st1.name +", with roll_no: "+st1.roll_no + ", phone number is: "
                +st1.phoneNumber+", Address: "+st1.address);

        System.out.println("Name: "+st2.name +", with roll_no: "+st2.roll_no + ", phone number is: "
                +st2.phoneNumber+", Address: "+st2.address);
    }
}