package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        LocalDateTime birthday = LocalDateTime.of(2026, 06,10, 10, 36);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);


        Duration duration = Duration.between(now, birthday);
        Duration durationMinus7Hours = Duration.between(timeNow, timeMinus7Hours);
        System.out.println(duration);
        System.out.println(durationMinus7Hours);
    }
}
