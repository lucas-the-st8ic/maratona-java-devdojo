package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    static void main(String[] args) {
        
        Queue<Manga> mangasQueue = new PriorityQueue<>(new MangaPrecoComparator().reversed());

        mangasQueue.add(new Manga(27L, "Berserk", 50.0, 1847));
        mangasQueue.add(new Manga(1L, "Pokemon", 8.50, 3850));
        mangasQueue.add(new Manga(8L, "Attack on Titan", 11.20, 200));
        mangasQueue.add(new Manga(123L, "Fullmetal Alchemist", 9.99, 2899));
        mangasQueue.add(new Manga(22L, "Vagabond", 25.50, 1269));
        mangasQueue.add(new Manga(2L, "Hajime No Ippo", 22.0, 892));
        mangasQueue.add(new Manga(34L, "HunterXHunter", 19.99, 743));

        while(!mangasQueue.isEmpty()) {
            System.out.println(mangasQueue
                    .poll());
        }

    }
}
