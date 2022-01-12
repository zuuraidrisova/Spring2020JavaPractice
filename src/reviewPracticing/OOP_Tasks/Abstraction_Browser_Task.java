package reviewPracticing.OOP_Tasks;

public abstract class Abstraction_Browser_Task {
    /*
    	Task03:
		1. create an abstract class called Browser
					attribues: browserName
					methods:
							abstract methods: get(URL), close(), maximize();
		2. creata three sub classes of Browser:
								1. ChromeBrowser
								2. FireFoxBrowser
								3. OperaBrowser
						each class MUST have constructors to initialize the attributes
					each actions should ONLY be applicable to the object it's called from
					Ex:
						chrome.get("https://www.google.com")
						output should be: chrome browse is opening https://www.google.com
						(it should not open the URL in different browser other than chrome)
     */

    public String browserName;

    public abstract void getURL(String url);

    public abstract void close();

    public abstract void maximize();


}

class ChromeBrowser extends Abstraction_Browser_Task{

    public ChromeBrowser(String browserName){

        this.browserName = browserName;
    }

    @Override
    public void getURL(String url){

        System.out.println(browserName+" is getting "+url);
    }

    @Override
    public void close(){

        System.out.println(browserName+" is closing");
    }

    @Override
    public void maximize(){

        System.out.println(browserName+" is maximizing");
    }
}

class OperaBrowser extends Abstraction_Browser_Task{

    public OperaBrowser(String browserName){

        this.browserName = browserName;
    }

    @Override
    public void getURL(String url){

        System.out.println(browserName+" is getting "+url);
    }

    @Override
    public void close(){

        System.out.println(browserName+" is closing");
    }

    @Override
    public void maximize(){

        System.out.println(browserName+" is maximizing");
    }
}

class FirefoxBrowser extends Abstraction_Browser_Task{

    public FirefoxBrowser(String browserName){

        this.browserName = browserName;
    }

    @Override
    public void getURL(String url){

        System.out.println(browserName+" is getting "+url);
    }

    @Override
    public void close(){

        System.out.println(browserName+" is closing");
    }

    @Override
    public void maximize(){

        System.out.println(browserName+" is maximizing");
    }
}

class browsers{

    public static void main(String[] args) {

        ChromeBrowser ch =  new ChromeBrowser("Chrome Browser");

        ch.getURL("www.google.com");
        ch.maximize();
        ch.close();

        OperaBrowser op = new OperaBrowser("Opera Browser");

        op.getURL("www.google.com");
        op.maximize();
        op.close();

        FirefoxBrowser fr = new FirefoxBrowser("Firefox Browser");

        fr.getURL("www.google.com");
        fr.maximize();
        fr.close();
    }
}