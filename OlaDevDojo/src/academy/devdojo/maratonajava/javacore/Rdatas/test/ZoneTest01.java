package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;

        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime tokyoDateTimeNow = now.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyoDateTimeNow);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        ZonedDateTime tokyoInstantDateTimeNow = nowInstant.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyoInstantDateTimeNow);


        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset zoneOffset = ZoneOffset.of("-04:00");

        OffsetDateTime offsetDateTime1 = now.atOffset(zoneOffset);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, zoneOffset);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(zoneOffset);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);

        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);

    }
}
