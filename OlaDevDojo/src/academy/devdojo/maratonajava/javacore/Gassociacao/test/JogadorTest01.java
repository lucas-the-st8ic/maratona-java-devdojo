package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    static void main(String[] args) {

        Jogador jogador1 = new Jogador("Kobe Bryant");
        Jogador jogador2 = new Jogador("Lebron James");
        Jogador jogador3 = new Jogador("Michael Jordan");
        Jogador jogador4 = new Jogador("Kyrie Irving");


        Jogador[] jogadores = {jogador1, jogador2, jogador3, jogador4};

        for(Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
