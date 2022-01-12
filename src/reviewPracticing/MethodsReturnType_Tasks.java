package reviewPracticing;

public class MethodsReturnType_Tasks {

    public static void main(String[] args) {

       String noDup =  removeDuplicates("helllooo");

        System.out.println("noDuplicates = " + noDup);

        String frequency = frequencyChars("hellooo");

        System.out.println("frequency = " + frequency);

        String unique = uniquesFromString("helllooo");

        System.out.println("unique = " + unique);

        String browser = getDriver("Chrome");

        String br = getDriver2("firefox");

        System.out.println("browser = " + browser);
        System.out.println(br);

        int count = frequency("hellooooo","o" );

        System.out.println("count = " + count);
    }


    /*
 a return method that can return the frequency of characters as a string
 from any given string
		Ex:
			FrequencyOfChars("ABABCB"); ==> "A2B3C1";
			FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
 */

    public static String frequencyChars(String string){

        String noDup = "";

        String result = "";

        for (int i = 0; i <= string.length()-1; i++){

            if (!noDup.contains(string.charAt(i)+"")){

                noDup += string.charAt(i);

            }
        }

        for (int i = 0; i <= noDup.length()-1; i++){

            int count = 0;

            for (int j = 0; j <= string.length()-1; j++){

                if (noDup.charAt(i) == string.charAt(j)){

                    count++;
                }
            }

            result += noDup.charAt(i)+""+count;
        }

        return result;

    }

    //remove duplicates from any given string

    public static String removeDuplicates(String string){

        String noDup = "";

        for (int i = 0; i <= string.length()-1; i++){

            if (!noDup.contains(string.charAt(i)+"")){

                noDup += string.charAt(i);

            }
        }

        return noDup;
    }

    //print only unique values from String

    public static String uniquesFromString(String string){

        String result = "";

        for (int i = 0; i <= string.length()-1; i++){

            int count = 0;

            for (int j = 0;  j<= string.length()-1; j++){

                if (string.charAt(i) == string.charAt(j)){

                    count++;
                }
            }

            if (count == 1){

                result += string.charAt(i);
            }
        }

        return result;
    }


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

       public static String getDriver(String browser){

           String result = "";

           browser = browser.toLowerCase();

           switch (browser){

               case "chrome":
                   result = "chrome";
                   break;
               case "firefox":
                   result = "firefox";
                   break;
               case "opera":
                   result = "opera";
                   break;
               case "ie":
                   result = "ie";
                   break;
               case "safari":
                   result = "safari";
                   break;
               case "edge":
                   result = "edge";
                   break;
               default:
                   result  = "invalid browser";
                   break;
           }

           return result;
       }

    public static String getDriver2(String browser){

        String result = "";

        browser = browser.toLowerCase();

        switch (browser){

            case "chrome":
                result = "chrome";
                return  result;
            case "firefox":
               return result = "firefox";
            case "opera":
                return result = "opera";
            case "ie":
               return result = "ie";
            case "safari":
               return result = "safari";
            case "edge":
                return result = "edge";
            default:
                return result  = "invalid browser";
        }
       }
        /*
     write a return method that accepts two strings str1 & str2, and returns
     the frequency of str2 in str1 as an int
        EX:
            Frequency("AAABB", "A");  ==> 3
            Frequency("ABAB", "B"); ==> 2
     */

        public static int frequency(String str1, String str2){

            int count = 0;

            while (str1.contains(str2)){

                count++;

                str1 = str1.replaceFirst(str2, "");
            }

            return  count;
        }
}
