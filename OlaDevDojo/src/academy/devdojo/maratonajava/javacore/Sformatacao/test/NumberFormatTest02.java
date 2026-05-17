package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    static void main(String[] args) {

        Locale localeDefault = Locale.getDefault();
        Locale localeBr = new Locale("pt", "BR");
        Locale localeJp = Locale.JAPAN;
        Locale localeIt = Locale.ITALY;

        NumberFormat[] numberFormats = new NumberFormat[4];

        numberFormats[0] = NumberFormat.getCurrencyInstance();
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeBr);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeJp);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeIt);

        double valor = 1000.2130;
        
        for(NumberFormat numbers : numberFormats ) {
            System.out.println(numbers.getMaximumFractionDigits());
            System.out.println(numbers.format(valor));
        }
        String valorString = "￥1,000";


        try {
            System.out.println(numberFormats[2].parse(valorString));;
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
