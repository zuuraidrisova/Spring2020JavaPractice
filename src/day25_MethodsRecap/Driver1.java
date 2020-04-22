package day25_MethodsRecap;

public class Driver1 {
    /*
    write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "id", "safari",
				"edge", "Opera"}, then it returns the name of that specific browser'
				driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above,
				the method should return "Invalid"
				APPLY SWITCH STATEMENTS
     */

    public static String getDriver1(String browserName){

        String result = "";

        switch(browserName.toLowerCase()){//this is to ignore case sensitivity

            case "opera":
                result = "Opera Driver";
                break;

            case "chrome":
                result = "Chrome Driver";
                break;

            case "firefox":
                result = "FireFox Driver";
                break;

            case "ie":
                result = "IE Driver";
                break;

            case "safari":
                result = "Safari Driver";
                break;

            case "edge":
                result = "Edge Driver";
                break;

            default:
                result  = "Invalid Driver";

        }


        return  result;
    }

    public static void main(String [] args){

        String browserName = getDriver1("cHROME");

        System.out.println(browserName);
    }
}

