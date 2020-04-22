package WarmUp_Practices;

public class GetDriver3Method {
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
    public static String getDriver3(String browser){


     String browser1  =  (browser.equalsIgnoreCase("Chrome"))?browser1 = "Chrome Driver" :
                browser.equalsIgnoreCase("Opera") ? browser1 = "Opera Driver":
                browser.equalsIgnoreCase("Firefox")? browser1 = "Firefox Driver":
                browser.equalsIgnoreCase("Safari")? browser1 ="Safari Driver":
                browser.equalsIgnoreCase("ID") ?browser1 = "ID Driver":
                browser.equalsIgnoreCase("Edge")?browser1 = "Edge Driver" :  "Invalid";


        return browser1;
    }

    public static void main(String[] args) {

        String browser =  getDriver3("opera");
        System.out.println(browser);
    }
}
