package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    static void main(String[] args) {

        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Ferrari";
        carro01.modelo = "Diablo";
        carro01.ano = 2021;

        carro02.nome = "Pontiac";
        carro02.modelo = "Catalina";
        carro02.ano = 1970;

        System.out.println("Marca: " +carro01.nome);
        System.out.println("Modelo: " +carro01.modelo);
        System.out.println("Ano: " +carro01.ano);
        System.out.println("=================");
        System.out.println("Marca: " +carro02.nome);
        System.out.println("Modelo: " +carro02.modelo);
        System.out.println("Ano: " +carro02.ano);
    }
}
