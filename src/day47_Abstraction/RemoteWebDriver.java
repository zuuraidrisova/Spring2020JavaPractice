package day47_Abstraction;

public abstract class RemoteWebDriver {

    public String browserName;

    public abstract String getUrl(String URL);

    public abstract void close();

    public abstract void maximize();

}

final class ChromeBrowser extends RemoteWebDriver{

    public ChromeBrowser(String browserName){

        this.browserName = browserName;
    }

    @Override
    public String getUrl(String URL){

        return URL+" is opening in Chrome browser";
    }

    @Override
    public void close(){

        System.out.println(browserName+" is closing");
    }

    @Override
    public void maximize(){

        System.out.println(browserName+" maximizes");
    }

}

final class FirefoxBrowser extends RemoteWebDriver{

    public FirefoxBrowser(String browserName){

        this.browserName = browserName;
    }

    @Override
    public String getUrl(String URL){

        return URL+" is opening in a Firefox browser";
    }

    @Override
    public void close(){

        System.out.println(browserName + " is closing");
    }

    @Override
    public void maximize(){

        System.out.println(browserName+" maximizes");
    }
}

final class OperaBrowser extends  RemoteWebDriver {

    public OperaBrowser(String browserName){

        this.browserName = browserName;
    }

    @Override
    public String getUrl(String URL) {
        return URL+" is opening in Opera browser";
    }


    @Override
    public void close() {

        System.out.println(browserName+" is closing");
    }

    @Override
    public void maximize() {

        System.out.println(browserName+" maximizes");

    }
}

final class EdgeBrowser extends RemoteWebDriver{

    public EdgeBrowser(String browserName){

        this.browserName = browserName;
    }

    @Override
    public String getUrl(String URL) {
        return URL+" is opening in Edge broswer";
    }


    @Override
    public void close() {

        System.out.println(browserName+" is closing");
    }

    @Override
    public void maximize() {

        System.out.println(browserName+" maximizes");
    }
}

final class SafariBrowser extends RemoteWebDriver{

    public SafariBrowser(String browserName){

        this.browserName = browserName;
    }

    @Override
    public String getUrl(String URL) {
        return URL +" is opening in Safari browser";
    }


    @Override
    public void close() {

        System.out.println(browserName+" is closing");
    }

    @Override
    public void maximize() {

        System.out.println(browserName+" maximizes");
    }
}
class DriverObjects{

    public static void main(String[] args) {

        ChromeBrowser driver1 = new ChromeBrowser("Chrome");

        String url1 = driver1.getUrl("https://www.google.com");

        System.out.println(url1);

        driver1.maximize();


        System.out.println("=========================================");

        FirefoxBrowser  driver2 = new FirefoxBrowser("Firefox");

        String url2 =driver2.getUrl("https://www.google.com");

        System.out.println(url2);

        driver2.maximize();

        System.out.println("=========================================");

        OperaBrowser driver3 = new OperaBrowser("Opera");

        String url3 = driver3.getUrl("https://www.google.com");

        System.out.println(url3);

        driver3.maximize();

        System.out.println("=========================================");

        EdgeBrowser driver4 = new EdgeBrowser("Edge");

        String url4 = driver4.getUrl("https://www.google.com");

        System.out.println(url4);

        driver4.close();

        System.out.println("=========================================");

        SafariBrowser driver5 = new SafariBrowser("Safari");

        String url5 = driver5.getUrl("https://www.google.com");

        System.out.println(url5);

        driver5.close();

    }
}