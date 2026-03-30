package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.test;


import academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {

        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
