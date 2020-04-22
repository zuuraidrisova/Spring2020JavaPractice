package WarmUp_Practices;

public class Areaperimeter_Circle {
    public static void main(String []args){
        double radius = 5.5;
        //area = radius*radius *P ;
        //P NUMBER IS 3.14;
        double area = radius *radius *3.14;
        String outcome ="The radius of " + radius +" has the area of " + area;
        System.out.println(outcome);

        //perimeter = 2*radius*P;
        double perimeter = 2*radius *3.14;
        String outcome2 = "The radius of "+ radius + " has the peremeter of "+ perimeter;
        System.out.println(outcome2);
    }
}
