package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String basicIsoDate = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String isoDate = date.format(DateTimeFormatter.ISO_DATE);
        String isoLocalDate = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(basicIsoDate);
        System.out.println(isoDate);
        System.out.println(isoLocalDate);

        LocalDate dateParse1 = LocalDate.parse("20260524", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate dateParse2 = LocalDate.parse("2021-02-19", DateTimeFormatter.ISO_DATE);
        LocalDate dateParse3 = LocalDate.parse("2021-02-19", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(dateParse1);
        System.out.println(dateParse2);
        System.out.println(dateParse3);

        LocalDateTime now = LocalDateTime.now();
        String isoDateTime = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(isoDateTime);

        LocalDateTime parse =  LocalDateTime.parse("2026-05-24T16:56:19.243005",
                DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse);

        //BR- dd/MM/yyyy
        //USA- MM/dd/yyyy
        //JPN- yyyy/MM/dd

        DateTimeFormatter formatterJPN = DateTimeFormatter.ofPattern("yyy/MM/dd");
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterUSA = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String dateFormat = LocalDate.now().format(formatterBR);
        System.out.println(dateFormat);

        LocalDate parseBR = LocalDate.parse("24/05/2026", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy",
                Locale.GERMAN);

        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);

        LocalDate parseGR = LocalDate.parse("24.Mai.2026", formatterGR);
        System.out.println(parseGR);
    }
}
