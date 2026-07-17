package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    static void main(String[] args) {
        List<String> personagensLDJ = new ArrayList<>();
        personagensLDJ.add("Batman");
        personagensLDJ.add("Superman");
        personagensLDJ.add("Wonder Woman");
        personagensLDJ.add("Flash");
        personagensLDJ.add("Green Lantern");
        personagensLDJ.add("Shazam");
        personagensLDJ.add("Hawkgirl");
        personagensLDJ.add("Plastic Man");
        personagensLDJ.add("Zatanna");
        personagensLDJ.add("Martian Manhunter");

        Collections.sort(personagensLDJ);

        for(String personagem : personagensLDJ){
            System.out.println(personagem);
        }

        List<Double> money = new ArrayList<>();

        money.add(125.50);
        money.add(280.99);
        money.add(537.45);
        money.add(3789.50);
        money.add(100.00);

        Collections.sort(money);

        System.out.println(money);
    }
}
