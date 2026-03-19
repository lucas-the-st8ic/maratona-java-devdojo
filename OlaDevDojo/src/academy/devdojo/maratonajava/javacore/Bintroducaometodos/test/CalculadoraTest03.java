package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double resultadoDivisao = calculadora.divideDoisNumeros(20, 0);

        System.out.println(resultadoDivisao);

        calculadora.metodoVoid(20, 0);

    }
}
