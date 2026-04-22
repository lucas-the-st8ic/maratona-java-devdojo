package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.VideoGame;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    static void main(String[] args) {
        Produto produto = new Computador("Alienware", 16499);
        VideoGame produto2 = new VideoGame("Xbox One", 5139);

        produto2.setMemoria("2-TB");

        CalculadoraImposto.calcularImposto(produto2);

        CalculadoraImposto.calcularImposto(produto);
    }
}
