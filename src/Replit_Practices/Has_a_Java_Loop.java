package Replit_Practices;
import java.util.Scanner;
public class Has_a_Java_Loop {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word =scan.next();

        if(0==word.indexOf("java",0)
                || 1==word.indexOf("java",1)){
            exists=true;
        }

        System.out.println(exists);

    }
}
