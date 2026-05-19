package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2027,
                Month.FEBRUARY, 8);
        LocalTime time = LocalTime.of(9,
                45,00);

        System.out.println(localDateTime);

        LocalDateTime ldt1 = date.atTime(time);
        System.out.println(ldt1);

        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt2);
    }
}
