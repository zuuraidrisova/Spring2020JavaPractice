package day25_MethodsRecap;

public class DriverPractice {

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

    public static void main(String[] args) {

       String browser =  getDriver("opera");

        System.out.println(browser);

        String browser2 = getDriver2("chrome");

        System.out.println(browser2);

        String browser3 = getDriver3("hello");

        System.out.println(browser3);

    }

    public static String getDriver(String browserName){

        //Switch does not accept double, long, float, boolean
        //when we use return no need for break statement

        switch(browserName){

            case "opera":
                return "Opera Driver";

            case "chrome":
                return "Chrome Driver";

            case "ie":
                return "IE Driver";

            case "safari":
                return "Safari Driver";

            case "edge":
                return "Edge Driver";

            case "firefox":
                return  "FireFox Driver";

            default:
                return  "Invalid Driver";


        }

    }

    public static String getDriver2(String browser){

       String result = "";

       if(browser.equalsIgnoreCase("opera")){

           result = "Opera Driver";

       }else if(browser.equalsIgnoreCase("chrome")){

           result = "Chrome Driver";

       }else if(browser.equalsIgnoreCase("ie")){

           result = "IE Driver";

       }else if(browser.equalsIgnoreCase("safari")){

           result = "Safari Driver";

       }else if(browser.equalsIgnoreCase("edge")){

           result = "Edge Driver";

       }else if(browser.equalsIgnoreCase("firefox")){

           result = "FrieFox Driver";

       }else{

           result = "Invalid Driver";
       }

        return result;
    }

    public static String getDriver3(String browser){


        return (browser.equalsIgnoreCase("opera")) ? "Opera Driver" :
                (browser.equalsIgnoreCase("chrome")) ? "Chrome Driver" :
                (browser.equalsIgnoreCase("firefox")) ? "FireFox Driver" :
                (browser.equalsIgnoreCase("ie")) ? "IE Driver" :
                (browser.equalsIgnoreCase("safari")) ? "Safari Driver" :
                (browser.equalsIgnoreCase("edge")) ? "Edge Driver" : "Invalid Driver";

    }
}
