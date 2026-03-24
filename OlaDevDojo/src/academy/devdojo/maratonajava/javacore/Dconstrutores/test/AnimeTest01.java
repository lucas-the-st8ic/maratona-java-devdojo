package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {

        Anime anime01 = new Anime("Hajime no Ippo",
                "Animação",
                80,
                "Spokon");

        Anime anime02 = new Anime();

        anime01.imprime();
        anime02.imprime();
    }
}
