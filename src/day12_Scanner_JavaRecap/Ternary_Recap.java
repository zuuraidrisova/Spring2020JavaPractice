package day12_Scanner_JavaRecap;
import java.util.Scanner;
public class Ternary_Recap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter status code: ");
        int statusCode =scan.nextInt();
        String result = " ";
        if(statusCode==200){
            result ="Ok";
        }else if(statusCode==201){
            result="Created";
        }else if(statusCode==202){
            result="Accepted";
        }else{
            result="Invalid Entry";
        }
        System.out.println("The message is: "+result);


        //ternary and Scanner, ()-> is not mandatory
        System.out.println("Enter status code: ");
        int status = scan.nextInt();
        String result2 = (status==200)? "Ok":
                (status==201)?"Created":(status==202)?"Created":
                        "Invalid Entry";
        System.out.println("The message is: "+result2);
    }
}
