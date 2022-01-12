package day47_Abstraction;

public class Day47_notes{
            /*

        task01:
        1. create an abstract class called Employee
        attributes: name, age, gender, salary, jobtitle
        methods:
        abstract methods: work()
        instance method:  toString()
        2. create two sub classes of the Employee:
        1. Tester
        2. Developer

        task02:
        1. create an abstract class called RemoteWebDriver
        attribues: browserName
        methods:
        abstract methods: get(URL), close(),
        maximize();
        2. creata three sub classes of RemoteWebDriver:
        1. ChromeDriver
        2. FireFoxDriver
        3. OperaDriver
        4. EdgeDriver
        5. SafariDriver
        6. IEDriver

        OOP Abstraction:
        Abstract method
        Abstract class
        Interface

        abstraction: hiding implementation details
        abstract method: a method without the body
         a method that's meant to be overridden
        (cannot be private, static, final)
        public abstract void method();

        RemoteWebDriver:
        get(URL);
        quit();
        Chrome extends RemoteWebDriver:
        get(URL): opens the chrome
        quit(): quits the chrome
        FireFox extends RemoteWebDriver:
        get(URL): opens the firefox
        quit(): quits firefox
        Opera extends RemoteWebDriver:
        get(URL): opens the Opera
        quit(): quits Opera
        Cybertek extends RemoteWebDriver:
        get(URL): opens the Cybertek Browser
        quit(): closes the cybertek Browser

        THERE ARE ONLY Two WAYS TO ACHIEVE ABSTRACTION:
        1. ABSTRACT CLASS
        2. INTERFACE

        Abstract class: meant to be inherited ( cannot be final)
        A class that we cannot create an object
        when abstract class extended by regular class:
        we MUST  override ALL the abstract methods of super class

        when abstract class extended by abstract class:
        no need to override any abstract methods

        shortcut to override the abstract methods of super class:
        for Mac:
        1. hold "Option"
        2. Hit Enter
        3. Hit enter two times
        for windows:
        1. hold "Alt"
        2. Hit Enter
        3. Hit enter two times

        why we cannot create objects from abstract class?
        abstract is not concrete, object has to be concrete

           abstract class vs non-abstract class:

    non-abstract:

      non-abstract or regular class you can have everything, except abstract methods
      u can have: instance variables, instance methods,instance block, static members
      non-abstract class can be final

    abstract class:

        we can have everything and plus abstract method, the only disadvantage is
        we cannot create an object
        abstract class is meant to be inherited, so it cannot be final


             */
}
