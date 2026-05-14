package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountriesList = Locale.getISOCountries();
        String[] isoLanguagesList = Locale.getISOLanguages();
        
        for(String isoCountrie : isoCountriesList) {
            System.out.print(isoCountrie + " ");
        }

        System.out.println();

        for(String isoLanguage : isoLanguagesList) {
            System.out.print(isoLanguage + " ");
        }
    }
}
