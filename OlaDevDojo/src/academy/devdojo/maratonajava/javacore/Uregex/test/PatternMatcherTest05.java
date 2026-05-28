package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    static void main(String[] args) {

        /*Meta Caracteres

          \d - Retorna todos os digitos
          \D - Retorna tudo que não for dígito
          \s - Retorna os espaços em branco \t \n \f \r
          \S - Retorna todos os caracteres excluindo os brancos.
          \w - Retorna tudo que for de a-z A-Z, digitos, _
          \W - Retorna o que não for alfa-numérico.
          []
          ? - Zero ou uma ocorrência.
          * - Zero ou mais ocorrências.
          + - Uma ou mais ocorrências.
          {n,m} - De n até m ocorrências Ex: De determinado valor até
          determinado valor.
          () - Agrupamento.
          | - ou - o(v\c)o ovo | oco
          $ -
          . - 1.3 = 123, 133, 1@3
         */

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-z])+)+";

        String texto = "pebis65306@hotmail.com, sani5766@outlook.com, danylo1512@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, store@mail.com";

        System.out.println("Email válido");
        System.out.println("#@!zoro@mail.br".matches(regex));

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex:   " + regex);
        System.out.println("Posições encontradas:");
        while (matcher.find()) {
            System.out.print(matcher.start()+ " "+matcher.group()+"\n");
        }

        int numeroHEX = 0xFFFFFF;
        System.out.println(numeroHEX);
    }
}
