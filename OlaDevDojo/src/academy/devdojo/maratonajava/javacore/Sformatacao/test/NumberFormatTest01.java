package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    static void main(String[] args) {

        Locale localeDefault = Locale.getDefault();
        Locale localeBr = new Locale("pt", "BR");
        Locale localeJp = Locale.JAPAN;
        Locale localeIt = Locale.ITALY;

        NumberFormat[] numberFormats = new NumberFormat[4];

        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(localeBr);
        numberFormats[2] = NumberFormat.getInstance(localeJp);
        numberFormats[3] = NumberFormat.getInstance(localeIt);

        double valor = 10_000.2130;
        
        for(NumberFormat numbers : numberFormats ) {
            System.out.println(numbers.format(valor));
        }
    }
}
