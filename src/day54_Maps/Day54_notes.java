package day54_Maps;

public class Day54_notes {
            /*

        06/29/2020

        Topic: Maps
               Garbage Collection
               StringBuffer & StringBuilder
               enum
        Package name: day54_Maps

        Array (fixed, primitives & objects)
        Collection (dynamic, only objects)
        Map (dynamic, only objects)

        String[] name ={}
        Double[] salary = {};

        List<String> name = new ArrayList<>();
        List<Double> salary = new ArrayList<>();

        Map<String, Double>

        Map Interface: accepts key and value. cannot be primitives.

        key MUST be unique, values can be duplicated

        Map methods:

        put(key, value): inserts key and value to map
        get(key): returns the value of the given key
        remove(key): removes the given key and it's value from the map
        size(): returns size of map as an int
        containsKey(key): checks if the key is contained in the map. boolean
        containsValue(Value): checks if the value is contained in the map. boolean
        clear(): clears everything and size of map becomes zero
        isEmpty(): checks if map is empty or not, returns boolean
        keySet(): returns all the keys from the map as Set
        values(): returns all the values from the map as Collection
        entrySet(): creates an Entry

        Entry<Key, Value>:

        getKey(): returns the key from the Entry
        getValue(): returns the value from the entry

        // task:

        create a map and store your classmate' names and birthdays
        create a map that contains student names and Scores
        String    Integer

        put 5 students names and their scores

        write a program that can print out the names
        of the students who scored less than 90

        HashMap: does not keep the insertion order, accepts null

        HashTable: is synchronized, thread-safe ==> one thread at a time
                    slower
                    does not accept null

        LinkedHashMap: keeps the insertion order as it's.
                     put & remove are faster
                     accepts null

        TreeMap: sorts the keys in ascending order
                    does not accept null


        String vs StringBuilder vs StringBuffer:

        String: Immutable version of char sequences
        StringBuilder: mutable version of char sequences, not synchronized
        StringBuffer: mutable version char sequences, synchronized , thread-safe, slow

        finalize(): a method that's called by Garbage Collector before the object gets called by GC

        enum: a custom dataType
                containing fixed set of constants
                we only need it if we need a variable to take one out of small set values

        DataType   variableName = data;

            int a = 20;
            String str ="";
            Browsers: Chrome, Safari, FireFox, Edge, IE,

             */
}
