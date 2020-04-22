package WarmUp_Practices;

public class ValidTriangle {
    public static void main(String []args){
        int angle1 =30;
        int angle2 =76;
        int angle3 = 99;
        int sumOfAngles = angle1+angle2+angle3;
        boolean ValidTriangle = sumOfAngles ==180;
        if(ValidTriangle){
            System.out.println("This is valid triangle");
        }else{
            System.out.println("This is invalid triangle");
        }

        System.out.println("+++++++++++++++++++");

        String ValidTriangle2 =(sumOfAngles==180)?"This is valid triangle" : "This is invalid triangle";
        System.out.println(ValidTriangle2);

    }
}
