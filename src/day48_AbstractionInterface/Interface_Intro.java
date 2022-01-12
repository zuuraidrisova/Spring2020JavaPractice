package day48_AbstractionInterface;

public interface Interface_Intro {
    /*

    in abstract class:

        public abstract void method();

    in interface:

        void method(); ==> abstract by default
        no need to give abstract keyword
        public access modifier is given by default, it is always public

        PUBLIC is only access modifier we can have in interface
     */

    void method(); //==> abstract by default, public by default

    public abstract void method1();

}
