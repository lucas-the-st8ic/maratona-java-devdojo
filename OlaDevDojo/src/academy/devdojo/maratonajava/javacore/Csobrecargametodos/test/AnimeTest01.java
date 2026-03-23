package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {

        Anime anime01 = new Anime();

        anime01.novoAnime("Hajime no Ippo", "Animação", 80);
        anime01.novoAnime("Hajime no Ippo", "Animação", 80, "Spokon");

        anime01.imprime();
    }
}
