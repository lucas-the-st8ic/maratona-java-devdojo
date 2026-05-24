package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
    static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String basicIsoDate = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String isoDate = date.format(DateTimeFormatter.ISO_DATE);
        String isoLocalDate = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(basicIsoDate);
        System.out.println(isoDate);
        System.out.println(isoLocalDate);
    }
}
