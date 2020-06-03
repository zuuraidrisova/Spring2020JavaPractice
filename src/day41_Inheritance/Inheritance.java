package day41_Inheritance;

public class Inheritance {

    /*
    Inheritance: is easiest way to get rich
                 is used to build relationships between classes

        keyword extends is used to inherit features from super class

        super class == parent class --> is a class from which features are inherited
                                        features mean variables and methods
                                        super class cannot inherit

        sub class == child class --> is a class which inherits features
                                        features mean variables and methods
Sub class can also add its own features(methods or fields) besides inheriting parents'


        Inheritance improves re-usability, easy to maintain, saves time,
                              no need for declaring over and over again

        'is  a' relationship ==> inherited relationships between classes

        Dog "is an" Animal
        Fish "is an" Animal

        class Dog extends Animal{

                Dos "is an" Animal relationship
        }

        'has a' relationship ==> whenever one class has another classes' objects
                            then they have has a relationship, but no inheritance


        class Engine{

        }
        class Car{

        Engine obj = new Engine(); ==> car has engine

        }
                TYPES OF INHERITANCE:

        Single Inheritance :     subclass inherits the features of superclass

        Multi-Level Inheritance : subclass inherits super class, and then subclass becomes
                                    superclass for another subclass

                           grandparent -->   parent --> grandson

         Hierarchical Inheritance:  one super class can serve more than one sub class


        Variables and methods can be inherited

        Constructor cannot be inherited, because constructor name must match with class name


    if  private variables and methods, they cannot be inherited directly


     */
}
