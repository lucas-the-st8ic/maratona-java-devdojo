package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    static void main(String[] args) {
        Jogador jogador = new Jogador("Kobe Bryant");
        Jogador jogador2 = new Jogador("Shaquile O'neal");
        Time time = new Time("Los Angeles Lakers");
        Jogador[] jogadores = {jogador, jogador2};


        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
