package OfficeHours_Saim.day1_StringsLoops;

public class makeAbba {

    public static void main(String[] args) {
        /*

Given two strings, a and b, return the result of putting them
 together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".


makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
         */

        String a = "Whats";
        String b = "up";

        String v = makeAbba(a,b);

        System.out.println(v);
    }
    public static String makeAbba(String a, String b){

        String str = a+b+b+a;

        return str;
    }
}
