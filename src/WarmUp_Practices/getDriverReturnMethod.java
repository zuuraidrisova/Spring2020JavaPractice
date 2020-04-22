package WarmUp_Practices;

import java.util.Scanner;

public class getDriverReturnMethod {

    /*
    write a return method named getDriver1 that accepts a string parameter called
    Browser
				if the browser name matches with {"chrome", "firefox", "id",
				 "safari", "edge", "Opera"}, then it returns the name of that
				 specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above,
				 the method should return "Invalid"
				APPLY SWITCH STATEMENTS
     */

    public static String getDriver1(String Browser){

        String getDriver = "";

        switch(Browser){
            case "Chrome":
                getDriver = "Chrome Driver";
                break;
            case "FireFox":
                getDriver = "FireFox Driver";
                break;
            case "IE":
                getDriver = "IE Driver";
                break;
            case "Safari":
                getDriver = "Safari Driver";
                break;
            case "Edge":
                getDriver = "Edge Driver";
                break;
            case "Opera":
                getDriver = "Opera Driver";
                break;
            default:
                getDriver = "Invalid";

        }
        return getDriver;
    }

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Browser name: ");
        String browser = scan.next();
        String browser1 = getDriver1(browser);

        System.out.println(browser1);


    }






}
