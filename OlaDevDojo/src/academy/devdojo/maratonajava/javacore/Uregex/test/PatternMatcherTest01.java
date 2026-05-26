package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    static void main(String[] args) {
        //lucas.dev@orkut.com.br

        String regex = "aba";
        //String texto = "abaaababaaaaababaababab";
        String texto2 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto:  " + texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex:   " + regex);
        System.out.println("Posições encontradas:");
        while (matcher.find()) {
            System.out.print(matcher.start()+ " ");
        }
    }
}
