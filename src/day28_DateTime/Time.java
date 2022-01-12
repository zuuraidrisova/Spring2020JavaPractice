package day28_DateTime;
import java.time.LocalTime;

public class Time {

    //LocalTime ==> hours : minutes : seconds

    public static void main(String[] args) {

       LocalTime time1 = LocalTime.now();

        System.out.println(time1);

        LocalTime time2 = LocalTime.of(10,36,45);

        System.out.println(time2);

    }
}
