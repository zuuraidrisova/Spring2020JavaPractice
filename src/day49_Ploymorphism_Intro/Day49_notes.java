package day49_Ploymorphism_Intro;

public class Day49_notes {
    /*

Topics: Polymorphisim Intro
package name: day49_Polymorphisim
Warmup task:

            1. create an interface named downloadable:
            variable: boolean downloadable
            abstract method: download();
            2. create an interface named AndroidApps that can inherit from
            downloadable interface
            variable: AppStoreName
            3. create an interface named AppleApps that can inherit from
            downloadable interface
            variable: AppStoreName
            4. create an abstract class named Phone
            variables: brand, model, price, size
            abstract methods: texting(), calling()
            5. create a class named iPhone that can inherit from AppleApps and
            Phone
            actions that every iphone can do: texting(), calling(),
            faceTiming(), selfie()
            6. create a class named Nokia that can inherit from AndroidApps and
            Phone
            actions that Nokia can do: texting(), calling(), freezing(),
            breakTheFloor()
            in each sub classes of phone, create a constructor to initialize the
            instances

    IS A: inheritance relation

    polymorphism: object's behave in different forms
    occurs when parent class/interface reference to child class' objects

    Animal     dog2     =  new Dog();

    abstract class and interface are meant to be reference type,
    CAN NEVER BE AN OBJECT TYPE
    SUB CLASS CAN NEVER EVER BE THE REFERENCE TYPE OF SUPER
    CLASS' OBJECTS

    class Dog extends Animal
    class Cat extnds Animal
    class Bird extends Animal

    Animal  dog1 = new Dog();
    Animal cat1 = new Cat();
    Animal bird1 = new Bird();

    Animal[] arr = {dog1, cat1, bird1 };

    WebDriver driver= new ChromeDriver();

    task:
    1. create an abstract class named Employee:
    attributes: name, id, jobTitle, Salary,...
    abstract method: work()
    2. create class named Tester that inherits from emplyee
    3. create class named Developer that inherits from emplyee
    4. create a class named ScrumTeam:
    create an arraylist and store 3 testers and 4 developers

     */


}
