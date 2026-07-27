package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Lucas");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga berserk = new Manga(27L, "Berserk", 50.0, 1847);
        Manga pokemon = new Manga(1L, "Pokemon", 8.50, 3850);
        Manga attackOnTitan = new Manga(8L, "Attack on Titan", 11.20, 200);
        Manga fullmetalAlchemist = new Manga(123L, "Fullmetal Alchemist", 9.99, 2899);
        Manga vagabond = new Manga(22L, "Vagabond", 25.50, 1269);
        Manga hajimeNoIppo = new Manga(2L, "Hajime No Ippo", 22.0, 892);
        Manga hunterXHunter = new Manga(34L, "HunterXHunter", 19.99, 743);

        List<Manga> mangaConsumidor1List = List.of(berserk, pokemon, attackOnTitan);
        List<Manga> mangaConsumidor2List = List.of(attackOnTitan, vagabond, hunterXHunter);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();

        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry :
        consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }
            System.out.println("===============================");
        }

    }
}
