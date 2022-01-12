package day05_Unary_ShortHandOperators;

public class Day5_notes {
            /*
            03/16/2020
        Topics: Operator Precedence
        Primitive Castings
        Unary Operators
        PackageName: day05_Unary_ShorthandOperators
        Warm Up tasks:
        1. create a class called LeapYear, and write a program that can
        identify if the given is Leap Year, print true if it's leap year,
        otherwise print false
        Ex:
        year = 2020  ==> short;
        LeapYear =true/false;
        output:
        2020 is leap year: true
        2. Divisibility, write a program that can check if a number is
        evenly divisible by 2, 3, 5,
        Ex:
        number = 65;  ==> int
        divisibleBy2 ==> true/false
        divisibleBy3 ==> true/false
        divisbileBy5 ==> true/false
        output:
        65 is divisible by 2: false
        65 is divisible by 3: false
        65 is divisible by 5: true
        number = 80;
        output:
        80 is divisible by 2: true
        80 is divisible by 3: false
        80 is divisible by 5: true
        Operator Precedence:  + , -, *, /, %
        highest: *, /, %
        lowest: + , -
        3 + 2 * 5
        3 + 10 = 13
        5 - 4 - 3 * 5
        5 - 4 - 15
        1 - 15  = - 14
        3 * 2 / 3
        6 / 3 =2
        primitives designed for numbers: byte, short, int, long, float, double
        double > float > long > int > short > byte
        primitive castings: casting larger primitives to smaller sizes, or casting
        smaller primitives to larger sizes
        implicit casting: casting smaller primitives to larger
        primitives
        int a = 10;
        long b = a;  ==> 10L
        it's done automatically by compiler
        if we do manually:
        int a = 10;
        long b = (long)a;  ==> 10L
        Explicit casting: casting larger primitive type to
        smaller primitives type
        int a = 100;
        byte b = (byte)a;
        casting has to be same or smaller than
        the DataType
        Local variables: variables that are declared within the method
        must be initialized before we use it, otherwise will
        always give compiler error
        Arithmetic operators: +, - , *, / %
        relational operators: >, <, >=, <=, ==, !=
        Unary Operators:
        + : Positive
        int a = 10;
        int b = +a;
        - : negative
        int a = -10;
        boolean result = a > 0 ; ==> false
        -- : decrement, decrease the value of the
        variable by 1
        ++ : increment, increase the value of the
        variable by 1
        ! :
        two types of increment/decrement:
        pre: increases the value of the variable by 1
        immediately,
        int a =100;
        ++a; // a = 101
        int b = 100;
        --b; // b = 99
        post: increases/decrease the value by 1 not immediately
        first passes the current value, and then
        increases/decrease the value by one
        int A =100;
        A++;
        int B = 100;
        B--;
             */
}
