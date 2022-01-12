package day50_PolymorphismContinue;

public class Day50_notes {
            /*
            06/15/2020
        Topics: Polymorphism Continue
        Type casting summary
        OOP Summary
        package name: day50_polymorphism
        Warmup tasks:
        1. cerate a class Animal
        variables: age, gender
        methods: eat, sleep
        DO NOT make them abstract we need this for today's example
        2. create subclass of Animal named Cat
        variable: catName
        methods: scratch
        3. create subclass of Animal named Dog
        variable: dogName
        methods: bark
        polymorphism: objets behaviors in many forms
        occurs when parent class/interface is reference to child' object
        WebDriver driver= new ChromeDriver();
        driver.get()
        Reference type decides what can be called or accessed
        WebDriver driver = getDriver();
        getDriver() ==> chrome, firefox, ...
        if a method is exist in both Object type & ReferenceType:
        if method is overriden: Object Type
        if not: reference Type
        If method is not overridden, it will call parent/super class
        version
        List<WebElement> list = new ArrayList<>();
        driver
        Type Castings: converting one type to another
        byte < short < int < long < float < double
        Primitive Type Casting: implicit & explicit
        implicit casting: smaller type to larger type. automatically
        done
        int a = 100;
        double b = a;
        explicit casting: larger type to smaller type. MUST be done
        manually
        int a = 200;
        short s = (short) a ;
        Reference Type Casting: Upcasting & downcasting
        pre condition: there MUST IS A relationship
        upcasting: casting from subclass type to superclass type
        (done by compiler implicitly)
        downcasting: casting from a superclass type to subclass
        type (MUST be done explicitly)
        OOP: Encapsulation, Inheritance, Abstraction, Polymoprhism
        Encapsulation: hiding the data by using private, use the public
        getter/setter to read and modify the private data
        getter(Read only): returns the private data
        setter(write only): assigning the argument to private variable
        IF PRIVATE DATA IS FINAL, WE CAN ONLY GENERATE GETTER
        Inheritance: build super & sub class. easy way to get rich
        super class: cannot inherit anything from child
        sub class: can inherit visible variables and visible methods
        (except constructor) from super class
        Class   A    extends   B
        sub           super
        method overriding: MUST happen in sub class
        advantage: less codes
        reusable
        easy to maintain
        Abstraction: hiding the implementation details
        Concentrating on essentials/importance, without worrying
        the details
        WebDriver:
        get();
        quit();
        ChromeDriver implements WebDriver:
        get(): opens from chrome
        quit(): closes chrome only
        FireFoxDriver implements WebDriver:
        get(): opens from firefox
        quit(): closes firefox only
        OperaDriver implements WebDriver:
        get(): opens from Opera
        quit(): closes Opera only
        ...
        abstract method: method without body/implemntation
        meant to be override ( cannot be final,
        static, private)
        there are ONLY two ways to achieve abstraction:
        1. abstract class: not concrete, cannot create object
        meant to be inherited  ( cannot be
        final)
        2. interface: we can implement multiple interfaces to a
        class ( cannot be final)
        everything has public access modifer by
        default
        we can only have:
        varaibles: by default static
        and final
        methods: abstract method,
        static method, default method
        we cannot have: constructor, instance
        variables, instance methods, Blocks
        extends vs implements:
        class       extends   class
        interfaces  extends   interface
        class       implements    interface
        class  extends  class implments I1, I2 ..
             */
}
