package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;



class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga p1, Manga p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}

public class MangaNavigableTest01 {
    static void main(String[] args) {
       

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(27L, "Berserk", 85.0, 1847));
        mangas.add(new Manga(1L, "Pokemon", 100.0, 3850));
        mangas.add(new Manga(8L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(123L, "Flash", 96.0, 2899));
        mangas.add(new Manga(22L, "Green Lantern", 94.5, 1269));
        mangas.add(new Manga(2L, "Shazam", 98.0, 892));
        mangas.add(new Manga(34L, "Hawkgirl", 82.0, 743));


        for (Manga personagem : mangas.descendingSet()) {
            System.out.println(personagem);
        }
        System.out.println("=================================");

        Manga lobo = new Manga(000L, "Lobo", 99.0, 1);

        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println(mangas.lower(lobo));
    }
}

