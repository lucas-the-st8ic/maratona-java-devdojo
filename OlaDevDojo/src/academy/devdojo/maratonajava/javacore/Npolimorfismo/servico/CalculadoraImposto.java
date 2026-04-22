package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.VideoGame;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " +produto.getNome());
        System.out.println("Preço: R$" +produto.getValor());
        System.out.println("Valor do imposto: R$" +produto.calcularImposto());
        if (produto instanceof VideoGame) {
            VideoGame videoGame = (VideoGame) produto;
            System.out.println(videoGame.getMemoria());
        }
        System.out.println("============================");
    }
}
