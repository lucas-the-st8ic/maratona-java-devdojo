package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Celular;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.VideoGame;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class Produtotest01 {
    static void main(String[] args) {

        Computador computador = new Computador("PC Gamer-i7", 8000);
        VideoGame videoGame = new VideoGame("Playstation 5", 7599);
        Celular celular = new Celular("Motorola Razr 60 Ultra", 6999);

        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(videoGame);
        CalculadoraImposto.calcularImposto(celular);
        
    }
}
