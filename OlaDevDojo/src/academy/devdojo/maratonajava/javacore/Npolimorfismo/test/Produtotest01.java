package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.VideoGame;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class Produtotest01 {
    static void main(String[] args) {

        Computador computador = new Computador("PC Gamer-i7", 8000);
        VideoGame videoGame = new VideoGame("Playstation 5", 7599);

        CalculadoraImposto.calcularImpostoComputador(computador);
        CalculadoraImposto.calcularImpostoVideoGame(videoGame);
    }
}
