package Replit_Practices;
import java.util.Scanner;
public class BuildRoute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String result ="";
        if(start.equals("A")){
            if(end.equals("B")){
                result+="right: "+end+" found";
            }else if(end.equals("C")){
                result+="right > down: "+end+" found";
            }else if(end.equals("D")){
                result+="right > down > left: "+end+" found";
            }else{
                result+= end+ " found";
            }

        }

        if(start.equals("B")){
            if(end.equals("C")){
                result+="down: "+end+ " found";
            }else if(end.equals("D")){
                result+="down > left: "+end+ " found";
            }else if(end.equals("A")){
                result+="down > left > up: "+end+" found";
            }else{
                result+=end+ " found";
            }
        }

        if(start.equals("C")){
            if(end.equals("D")){
                result+="left: "+end+" found";
            }else if(end.equals("A")){
                result+="left > up: "+end+" found";
            }else if(end.equals("B")){
                result+="left > up > right: "+end+" found";
            }else{
                result+=end+ " found";
            }
        }
        if(start.equals("D")){
            if(end.equals("A")){
                result+="up: "+end+" found";
            }else if(end.equals("B")){
                result+="up > right: "+end+" found";
            }else if(end.equals("C")){
                result+="up > right > down: "+end+" found";
            }else{
                result+=end+ " found";
            }

        }

        System.out.println(result);
    }
}
