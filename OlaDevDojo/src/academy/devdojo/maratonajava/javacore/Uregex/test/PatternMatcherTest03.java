package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    static void main(String[] args) {

        /*Meta Caracteres

          \d - Retorna todos os digitos
          \D - Retorna tudo que não for dígito
          \s - Retorna os espaços em branco \t \n \f \r
          \S - Retorna todos os caracteres excluindo os brancos.
          \w - Retorna tudo que for de a-z A-Z, digitos, _
          \W - Retorna o que não for alfa-numérico.
          [] -
         */

        String regex = "[a-zA-C]";
        //String texto = "abababa";
        String texto2 = "cafeBABE";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto:  " + texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex:   " + regex);
        System.out.println("Posições encontradas:");
        while (matcher.find()) {
            System.out.print(matcher.start()+ " "+matcher.group()+"\n");
        }
    }
}
