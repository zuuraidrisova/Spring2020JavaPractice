package day25_MethodsRecap;

public class Driver2 {
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
				APPLY MULTI - BRANCH IF STATEMENTS
     */

    public static String getDriver2(String browserName){

        String result = "";

        if(browserName.equalsIgnoreCase("Chrome")){
            result = "Chrome Driver";
        }else if(browserName.equalsIgnoreCase("Opera")){
            result = "Opera Driver";
        }else if(browserName.equalsIgnoreCase("Firefox")){
            result = "FireFox Driver";
        }else if(browserName.equalsIgnoreCase("Safari")){
            result = "Safari Driver";
        }else if(browserName.equalsIgnoreCase("Edge")){
            result = "Edge Driver";
        }else if(browserName.equalsIgnoreCase("IE")){
            result = "IE Driver";
        }else{
            result = "Invalid Driver";
        }

        return result;
    }


    public static void main(String[] args) {

       String browser =  getDriver2("opera");

        System.out.println(browser);

    }
}
