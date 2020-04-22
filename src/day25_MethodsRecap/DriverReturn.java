package day25_MethodsRecap;

public class DriverReturn {
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

       public static String getDriver4(String browserName){

           switch(browserName){

               case "chrome":
                   return "Chrome Driver";
               case "opera":
                   return "Opera Driver";
               case "firefox":
                   return "FireFox Driver";
               case "ie":
                   return "IE Driver";
               case "safari":
                   return "Safari Driver";
               case "edge":
                   return "Edge Driver";
               default:
                   return "Invalid Driver";

           }



       }
    public static String getDriver5(String browserName){

        if(browserName.equalsIgnoreCase("opera")){
            return "Opera Driver";
        }else if(browserName.equalsIgnoreCase("chrome")){
            return "Chrome Driver";
        }else if(browserName.equalsIgnoreCase("ie")){
            return "IE Driver";
        }else if(browserName.equalsIgnoreCase("firefox")){
            return "Firefox Driver";
        }else if(browserName.equalsIgnoreCase("safari")){
            return "Safari Driver";
        }else if(browserName.equalsIgnoreCase("edge")){
            return "Edge Driver";
        }else{
            return "Invalid Driver";
        }

    }

    public static String getDriver6(String browserName){

           return (browserName.equalsIgnoreCase("opera")) ? "Opera Driver":
                   (browserName.equalsIgnoreCase("chrome"))? "Chrome Driver":
                   (browserName.equalsIgnoreCase("ie")) ? "IE Driver":
                   (browserName.equalsIgnoreCase("edge")) ?"Edge Driver":
                   (browserName.equalsIgnoreCase("safari")) ?"Safari Driver":
                   (browserName.equalsIgnoreCase("firefox")) ? "FireFox Driver" : "Invalid Driver";
    }

    public static void main(String[] args) {

          String browserName =  getDriver4("hehe");

        System.out.println(browserName);

        String browserName2 = getDriver5("opera");

        System.out.println(browserName2);

        String browserName3 = getDriver6("safari");

        System.out.println(browserName3);
    }
}
