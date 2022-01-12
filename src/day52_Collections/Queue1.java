package day52_Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

    public static void main(String[] args) {

        Queue<String> q = new PriorityQueue<>();//first in first out order

        q.add("Zuura");
        q.add("Sary");
        q.add("Alina");
        q.add("Meerim");

        System.out.println(q);

        String str =  q.poll();

        System.out.println(str);

        System.out.println(q);
/*
 PriorityQueue is storing with natural order, so that is why Alina i showing up first,
 then poll is getting that String and printing it, but that line is also removing
 that String
 */

    }
}
