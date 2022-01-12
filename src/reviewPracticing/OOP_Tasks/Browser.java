package reviewPracticing.OOP_Tasks;

import java.io.FileInputStream;

public class Browser {
    /*
      1. create a class called Browsers
        actions: openBrowser():prints "opens the default browser"
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
        create an object of each browsers and call the openBrowser &
        closeBrowser actions
        create all those classes in one java file
     */

    public void openBrowser(){

        System.out.println("Opens the default browser");
    }

    public void closeBrowser(){

        System.out.println("Closes the default browser");
    }
}

class Chrome extends Browser {


    @Override
    public void openBrowser(){

        System.out.println("Opens the chrome browser");
    }

    @Override
    public void closeBrowser(){

        System.out.println("Closes the chrome browser");
    }
}

class Firefox extends Browser{

    @Override
    public void openBrowser(){

        System.out.println("Opens the firefox browser");
    }

    @Override
    public void closeBrowser(){

        System.out.println("Closes the firefox browser");
    }
}

class Safari extends Browser{

    @Override
    public void openBrowser(){

        System.out.println("Opens the safari browser");
    }

    @Override
    public void closeBrowser(){

        System.out.println("Closes the safari browser");
    }
}

class Opera extends Browser{

    @Override
    public void openBrowser(){

        System.out.println("Opens the opera browser");
    }

    @Override
    public void closeBrowser(){

        System.out.println("Closes the opera browser");
    }
}

class TestBrowsers{

    public static void main(String[] args) {

        Opera opera = new Opera();
        Chrome chrome = new Chrome();
        Firefox firefox = new Firefox();
        Safari safari = new Safari();


        opera.openBrowser();
        opera.closeBrowser();

        chrome.openBrowser();
        chrome.closeBrowser();

        firefox.openBrowser();
        firefox.closeBrowser();

        safari.openBrowser();
        safari.closeBrowser();

    }
}