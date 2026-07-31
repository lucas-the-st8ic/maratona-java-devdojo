package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;



class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga m1, Manga m2) {
        return Double.compare(m1.getPreco(), m2.getPreco());
    }
}

public class MangaNavigableTest01 {
    static void main(String[] args) {
       

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(27L, "Berserk", 50.0, 1847));
        mangas.add(new Manga(1L, "Pokemon", 8.50, 3850));
        mangas.add(new Manga(8L, "Attack on Titan", 11.20, 200));
        mangas.add(new Manga(123L, "Fullmetal Alchemist", 9.99, 2899));
        mangas.add(new Manga(22L, "Vagabond", 25.50, 1269));
        mangas.add(new Manga(2L, "Hajime No Ippo", 22.0, 892));
        mangas.add(new Manga(34L, "HunterXHunter", 19.99, 743));


        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("=================================");

        Manga gachiakuta = new Manga(46L, "Gachiakuta", 50.0, 4578);

        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println(mangas.lower(gachiakuta));
        System.out.println(mangas.floor(gachiakuta));
        System.out.println(mangas.higher(gachiakuta));
        System.out.println(mangas.ceiling(gachiakuta));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
    }
}

