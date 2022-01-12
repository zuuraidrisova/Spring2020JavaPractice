package day48_AbstractionInterface;

public class Day48_notes {
            /*
            06/08/2020
        Topic: Interface
        Interface VS Abstract Class

        abstraction: hiding the implementation details

        abstract methods: meant to overridden
        abstract class: meant to be inherited

        Interface: meant to be inherited

        Warmup tasks:
        1. create an abstract class called Phone
        attributes: brand, model, price, size
        abstract methods: calling(), texting()
        instance method: toString()
        2. create the following subclasses of phone:
        1. iPhone
        2. Samsung
        create constructors in each sub class that can initialize the
        instance variables


        abstract class: abstract class is meant to be extedned (final)
        abstract method: method without implementation
        meant to be override (cannot final, static, private)
        creating class:
        public class className{
        }
        Interface: blueprint of class. specifies the behaviors a class should
        implement
        used for achiving abstraction
        can be super type to a class
        class to inherit from interface is by using implemnts keyword
        there is only one access modifier allowed in interface ==>
        public
        public interface interfaceName{
        }
        Interface_Intro
        why do we need interface?
        A class can inherit from one class only (extends)
        A class can inherit multiple interfaces (implements)
        what we can have in interface?
        variable: static & final by bdefault
        methods: abstract methods, static methods, default method
        what we cannot have in interface?
        constructor
        instance variable
        instance methods
        blocks
        RemoteWebDriver     imeplents WebDriver, TakeScreenShot,
        JavaScriptExecuter ..
        /       |       \
        /         |         \
        chrome   firefox   opera
        WebDriver driver = new ChromeDriver();
        extends vs implements: both are used for inheriting
        extends:
        class   extends   class
        interface   extends     interface
        implements:
        class   implements  interface1, Interface2 ...
        abstract class vs interface: both used for achieving abstraction
        both are meant to be inherited
        both canbnot be final
        abstract class: can have constructor
        instance method
        blocks
        insatnce variables
        All access modifiers
        interface: default method
        publci is given by default
        variables are static & final by default
        next topic: Polymorphisim
             */
}
