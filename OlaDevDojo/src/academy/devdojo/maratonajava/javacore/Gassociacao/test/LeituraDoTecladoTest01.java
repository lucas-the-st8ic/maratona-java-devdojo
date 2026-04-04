package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        idade = input.nextInt();

        System.out.print("Digite M ou F para seu sexo: ");
        char sexo = input.next().charAt(0);

        System.out.println("-----------------------");
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Sexo: " +sexo);
    }
}
