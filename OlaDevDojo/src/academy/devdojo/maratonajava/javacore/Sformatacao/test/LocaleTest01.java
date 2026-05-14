package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    static void main(String[] args) {
        Locale localeBrasil = new Locale( "pt", "BR");
        Locale localeItalia = new Locale("it", "IT");
        Locale localeSuica = new Locale("ch", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJp = new Locale("ja", "JP");
        Locale localeNl = new Locale("nl", "NL");



        Calendar calendar = Calendar.getInstance(localeBrasil);

        DateFormat dateFormatIt = DateFormat.getDateInstance(DateFormat.FULL, localeItalia);
        DateFormat dateFormatBr = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
        DateFormat dateFormatCh = DateFormat.getDateInstance(DateFormat.FULL, localeSuica);
        DateFormat dateFormatIn = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateFormatJp = DateFormat.getDateInstance(DateFormat.FULL, localeJp);
        DateFormat dateFormatNl = DateFormat.getDateInstance(DateFormat.FULL, localeNl);




        System.out.println("Formato do Br: " + dateFormatBr.format(calendar.getTime()));
        System.out.println("Formato da Itália: " + dateFormatIt.format(calendar.getTime()));
        System.out.println("Formato da Suiça: " + dateFormatCh.format(calendar.getTime()));
        System.out.println("Formato da India: " + dateFormatIn.format(calendar.getTime()));
        System.out.println("Formato da Holanda: " + dateFormatNl.format(calendar.getTime()));
        System.out.println("Formato do Japão: " + dateFormatJp.format(calendar.getTime()));

        System.out.println(localeItalia.getDisplayCountry());
        System.out.println(localeSuica.getDisplayCountry());
        System.out.println(localeJp.getDisplayCountry());
    }
}
