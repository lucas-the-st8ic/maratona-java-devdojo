package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int primeiroNumero = 1;
        int segundoNumero = 2;

        calculadora.alteraDoisNumeros(primeiroNumero, segundoNumero);

        System.out.println(primeiroNumero);
        System.out.println(segundoNumero);
    }
}
