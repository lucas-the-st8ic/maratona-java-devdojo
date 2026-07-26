package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
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

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();

        consumidorManga.put(consumidor1, fullmetalAlchemist);
        consumidorManga.put(consumidor2, hunterXHunter);

        for(Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome()+ ": " +entry.getValue().getNome());
        }


    }
}
