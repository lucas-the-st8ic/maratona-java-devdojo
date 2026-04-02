package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Kobe Bryant");

        Time time = new Time("Los Angeles Lakers");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
