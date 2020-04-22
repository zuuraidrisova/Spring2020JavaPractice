package WarmUp_Practices;

import java.util.Scanner;

public class getDriver2Method {
    /*
     write a return method named getDriver2 that accepts a string parameter called
    Browser
				if the browser name matches with {"chrome", "firefox", "id",
				 "safari", "edge", "Opera"}, then it returns the name of that
				 specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above,
				 the method should return "Invalid"
    do the first task with multi-branch if statement instead of switch statement
     */
    public static String getDriver2(String Browser){

        String browser = "";

        if(Browser.equalsIgnoreCase("Chrome")){
            browser = "Chrome Driver";
        }else if(Browser.equalsIgnoreCase("Opera")){
            browser = "Opera Driver";
        }else if(Browser.equalsIgnoreCase("Firefox")){
            browser = "Firefox Driver";
        }else if(Browser.equalsIgnoreCase("Safari")){
            browser = "Safari Driver";
        }else if(Browser.equalsIgnoreCase("ID")){
            browser = "ID Driver";
        }else if(Browser.equalsIgnoreCase("Edge")){
            browser = "Edge Driver";
        }else{
            browser = "Invalid";
        }

        return browser;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter browser name: ");
        String browser = scan.next();

        String browserName = getDriver2(browser);
        System.out.println(browserName);
    }
}
