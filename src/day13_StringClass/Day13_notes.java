package day13_StringClass;

public class Day13_notes {
            /*
            03/30/2020
        Topics: String class
        String Manipulations
        package name: day13_StringClass
        class: numberToWords
        warmup tasks:
        1. Wash your hands
        2. write a java program that can convert any given
        numbers between 0 ~ 9 to words, if the number is greater than 9 or less
        than zero, out put should be "Invalid".
        MUST use Scanner and switch statement
        3. write a program for the shipping info that, the
        program should ask:
        building number
        Street address (Assume it
        has more than one word)
        city name
        state name
        zip code
        full name of the person:
        and prints the ship to info in the following
        format:
        ex output:
        Ship To:  Jimmy joe

        7925 Jones Branch Dr

        MCLean, VA 22102
        String Class: presented in "java.lang" package, any class in package
        "java.lang" will be imported automatically
        1. Object,  there are two ways we can create string
        object
        1. String literals:
        String str1 =
        "Muhtar";
        2. new keyword:
        String str2 = new
        String("Cybertek");
        String pool: special memory location for all
        String literal objects
        Java Heap: memory location in java that where
        all objects will be saved at
        2. String is IMMUTABLE:
        once the object is created, cannot
        change it
        3. String represents the sequences of characters
        each character in String has a
        representive number called index number
        index number: starts from zero, cannot
        be less than zero
        String str ="Cybertek";
        // index:    01234567 .....
        String str2 = "Cat dog";
        //index:       0123456
        String manipulations:
        charAt(indexNumber): it returns the char at the given
        index
        length(): returns the total number of characters as int
        length is ALWAYS one unit above the
        maximum index number
        maxIndex: length()-1;
        concat(Value): Concatenation , concats the given value to
        the String and returns a new value
        toLowerCase(): converts to lowercase and returns a new
        String
        toUpperCase(): converts to uppercase and returns a new
        String
        trim(): removes the unused spaces , and returns new
        String
        only if there is any space that's not
        seperating the words, will be removed
        substring(beginning index, ending index): creates
        substring of the string value from the beginning index till the ending
        iondex (ending index is EXCLUDED)
        substring(beginning index): creates substring of the
        string value from the beginning index till the end of the string
        replace(old Value, new Value): new value will be replaced
        with ALL the given old value, and returns new string
        replaceFirs(old Value, new Value): new value will be
        replaced with  the very first given old value, and returns new string
        indexOf(Value): returns the index number of the first
        occured character as an int
        if the value is
        not exist in the String , it will return negative number
             */
}
