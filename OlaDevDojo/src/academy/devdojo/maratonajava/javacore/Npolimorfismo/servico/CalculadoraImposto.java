package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.VideoGame;

public class CalculadoraImposto {

    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatório de imposto");
        double imposto = computador.calcularImposto();

        System.out.println("Computador: "
        +computador.getNome());
        System.out.println("Valor: R$" +computador.getValor());
        System.out.println("Imposto a ser pago: R$"
                + computador.calcularImposto());

    }

    public static void calcularImpostoVideoGame(VideoGame
                                                    videoGame) {
        System.out.println("Relatório de imposto");
        double imposto = videoGame.calcularImposto();

        System.out.println("Console: "
        + videoGame.getNome());
        System.out.println("Valor: R$" + videoGame.getValor());
        System.out.println("Imposto a ser pago: R$"
                + videoGame.calcularImposto());

    }
}
