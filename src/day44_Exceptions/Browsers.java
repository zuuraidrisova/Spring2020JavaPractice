package day44_Exceptions;
/*

warmup task:
	1. create a class called Browsers
			actions: openBrowser(): opens the default browser
					 closeBrowser(): closes the default browser
	2. create a class called ChromeBrowser
			actions: openBrowser(): opens the chrome browser
					 closeBrowser(): closes the chrome browser
	3. creata a class called FirefoxBrowser
			actions: openBrowser(): opens the Firefox browser
					 closeBrowser(): closes the Firefox browser
	4. create a class called Opera browser
			actions: openBrowser(): opens the Opera browser
					 closeBrowser(): closes the Opera browser
	5. create a class called Test:
			create an object of each browsers and call the openBrowser & closeBrowser
			 actions
 */

public class Browsers {

    public void  openBrowser(){

        System.out.println("Open the default browser");
    }

    public void closeBrowser(){

        System.out.println("Close the default Browser");
    }

}

class ChromeBrowser extends Browsers{

    @Override
    public void openBrowser(){

        System.out.println("Open the Chrome Browser");
    }

    @Override
    public void closeBrowser(){

        System.out.println("Close the Chrome Browser");
    }
}

class FireFoxBrowser extends Browsers{

    @Override
    public void openBrowser(){

        System.out.println("Open the FireFox Browser");
    }

    @Override
    public void closeBrowser(){

        System.out.println("Close the FireFox Browser");
    }
}


class OperaBrowser extends Browsers{

    @Override
    public void openBrowser(){

        System.out.println("Open the Opera Browser");
    }

    @Override
    public void closeBrowser(){

        System.out.println("Close the Opera Browser");
    }
}

class Test{

    public static void main(String[] args) {

        ChromeBrowser browser1 = new ChromeBrowser();

        browser1.openBrowser();
        browser1.closeBrowser();

        System.out.println("==========================");

        FireFoxBrowser browser2 = new FireFoxBrowser();

        browser2.openBrowser();
        browser2.closeBrowser();

        System.out.println("==========================");

        OperaBrowser browser3 = new OperaBrowser();

        browser3.openBrowser();
        browser3.closeBrowser();

    }
}