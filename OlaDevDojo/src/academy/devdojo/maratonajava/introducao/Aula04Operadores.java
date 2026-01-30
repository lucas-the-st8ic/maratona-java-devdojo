package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    static void main(String[] args) {
        /*Operadores Matemáticos
            +
            -
            /
            *
            %
            */

        int numero01 = 10;
        int numero02 = 20;
        double resultado = (double) numero01 / numero02;
        int resto = 7 % 2;

        System.out.println(resto);
        System.out.println(resultado);

        /*Operadores Lógicos
        <
        >
        ==
        <=
        >=
        !=
        */

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10< 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10!= 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualAVinte);
        System.out.println(isDezDiferenteDeVinte);

        /*Operadores Relacionais

        && (AND) (E)
        ||(OR) (OU)
        ! (NEGAÇÃO)
        */

        int idade = 35;
        double salario = 3500;

        boolean isDentroDaLei = idade >= 30 && salario > 4612;
        boolean isIdadeMenorQueTrinta = idade < 30 && salario >= 3381;

        if(isDentroDaLei) {
            System.out.println("Aprovado!!");
        } else {
            System.out.println("Não Atingiu os requisitos!");
        }


    }
}
