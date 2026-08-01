package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(
                new Carro("Ford Fusion"),
                new Carro("Honda Civic")));

        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(
                new Barco("Focker  Focker 215"),
                new Barco("Schaefer Yachts Schaefer 303")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);

        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalServiceCarro.retornarObjetoAlugado(carro);
        System.out.println("===================================");


        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);

        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);
        System.out.println("===================================");


    }
}
