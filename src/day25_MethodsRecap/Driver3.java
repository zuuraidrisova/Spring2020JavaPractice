package day25_MethodsRecap;


public class Driver3 {
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
            do the first task with ternaries
     */

     public static String getDriver3(String browserName){


         String result = (browserName.equalsIgnoreCase("Chrome")) ? result = "Chrome Driver":
                  (browserName.equalsIgnoreCase("Opera")) ? result = "Opera Driver":
                  (browserName.equalsIgnoreCase("Firefox")) ? result = "FireFox Driver":
                  (browserName.equalsIgnoreCase("Edge")) ? result = "Edge Driver":
                  (browserName.equalsIgnoreCase("Safari")) ? result = "Safari Driver":
                  (browserName.equalsIgnoreCase("IE"))? result = "IE Driver" : "Invalid Driver";


         return result;
     }

     public static void main(String [] args){

        String browser =  getDriver3("opera");
         System.out.println(browser);
     }
}

