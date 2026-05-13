package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    static void main(String[] args) {
        Date date = new Date(1778696353618L); //long 1000000000
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
