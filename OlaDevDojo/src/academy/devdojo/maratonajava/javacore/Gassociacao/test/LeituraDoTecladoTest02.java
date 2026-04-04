package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    static void main(String[] args)    {

        Scanner input = new Scanner(System.in);

        System.out.println("O grande software de previsão do futuro");

        System.out.print("Digite sua pergunta e eu responderei sim ou não: ");
        String pergunta = input.nextLine();

        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else  {
            System.out.println("NÃO");
        }
    }
}
