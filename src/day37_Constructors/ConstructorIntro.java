package day37_Constructors;

public class ConstructorIntro {

    /*
    Regular methods:
            AccessModifier  Specifier Return-type methodName(Parameter){
                        statements;
                        };

            AccessModifiers: ==> optional
                        public, private, default, protected
            Specifiers:==> optional
                       static, abstract, synchronized, final
            ReturnType: ==> must to create a method
                       void or any data type
            MethodName:==>must to create a method
                     any name
            Parameter : ==> can be without parameter
                     any data type

    Constructor > it is a special method:
                no specifier of whatsoever
                no returnType of any kind
                access modifier is optional

            AccessModifier methodName(parameter){
                    statements
                    };



              creating object:
                      reference name                 object
             Test         obj       =           new              Test();
          class name                         allocates memory    constructor


                Constructor is used to create objects,
                you have to provide constructor to create objects from class

                Constructor is mandatory for all classes
                But if you do not create constructor on your own,
                compiler creates one for you automatically by default


                Test obj = new Test();

                methodName MUST be the same with class name

        Constructor should be declared outside main method

        execution always depends on object

        Constructors are used to initialize object variables



     */

    public ConstructorIntro(int a){//constructor name must be same with class name

        System.out.println("Constructor with parameter of int");
    }

    public static void main(String[] args) {

      // ConstructorIntro obj = new ConstructorIntro();
        //no parameter constructor==> default constructor ==> no args

        ConstructorIntro obj2 = new ConstructorIntro(2);
        //object must be created with existing constructor

        ConstructorIntro obj3 = new ConstructorIntro(10);


    }


}
