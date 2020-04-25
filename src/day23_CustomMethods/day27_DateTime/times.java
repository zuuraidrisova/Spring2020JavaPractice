package day23_CustomMethods.day27_DateTime;

import java.time.LocalTime;

public class times {

    public static void main(String[] args) {

        LocalTime times = LocalTime.now();

        String str = times.toString();

        System.out.println(str);
    }
}
