package day37_Constructors;

public class InstanceInitializerBlock {
    /*

    two initializers:
             static initializer block :
                                        once class is loaded, static executed only once
                                        initializes only static variables
                                        static block accepts only static methods and variables

                    static{

                    statement;

                    }

            instance initializer block:
                                    initializes instance variables
                                    belongs to the object, so only time we can initialize
                                        instance variable after creating object of class
                                   execution of instance block depends on how many objects
                                            are created
                                    does not matter where we put instance block

                                    {
                                    statements;
                                    }



     */
    static {

        System.out.println("static block");//only runs once
    }


    {
        System.out.println("Instance block");//will get executed twice bcs we have 2 objects
    }

    public static void main(String[] args) {

        InstanceInitializerBlock obj = new InstanceInitializerBlock();

        InstanceInitializerBlock obj2 = new InstanceInitializerBlock();

    }

    {
        System.out.println("Instance block");//will get executed twice bcs we have 2 objects
    }
}
