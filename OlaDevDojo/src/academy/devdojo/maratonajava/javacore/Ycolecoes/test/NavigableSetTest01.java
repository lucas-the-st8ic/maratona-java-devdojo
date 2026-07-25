package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Personagem;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class PersonagemPowerLevelComparator implements Comparator<Personagem> {
    @Override
    public int compare(Personagem p1, Personagem p2) {
        return Double.compare(p1.getPowerLevel(), p2.getPowerLevel());
    }
}

public class NavigableSetTest01 {
    static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Personagem> personagensLDJ = new TreeSet<>(new PersonagemPowerLevelComparator());
        personagensLDJ.add(new Personagem(27L, "Batman", 85.0, 1847));
        personagensLDJ.add(new Personagem(1L, "Superman", 100.0, 3850));
        personagensLDJ.add(new Personagem(8L, "Wonder Woman", 97.5, 1732));
        personagensLDJ.add(new Personagem(123L, "Flash", 96.0, 2899));
        personagensLDJ.add(new Personagem(22L, "Green Lantern", 94.5, 1269));
        personagensLDJ.add(new Personagem(2L, "Shazam", 98.0, 892));
        personagensLDJ.add(new Personagem(34L, "Hawkgirl", 82.0, 743));
        personagensLDJ.add(new Personagem(13L, "Plastic Man", 91.0, 638));
        personagensLDJ.add(new Personagem(4L, "Zatanna", 95.0, 811));
        personagensLDJ.add(new Personagem(225L, "Martian Manhunter", 99.0, 2594));
        personagensLDJ.add(new Personagem(83L, "Booster Gold", 74.0, 300));
        personagensLDJ.add(new Personagem(11L, "The Question", 69.0, 210));
        personagensLDJ.add(new Personagem(89L, "Blue Beetle (Ted Kord)", 72.5, 100));
        personagensLDJ.add(new Personagem(89L, "Blue Beetle (Ted Kord)", 72.5, 100));
        personagensLDJ.add(new Personagem(10L, "Atom", 72.5, 100));

        for (Personagem personagem : personagensLDJ.descendingSet()) {
            System.out.println(personagem);
        }
        System.out.println("=================================");

        Personagem lobo = new Personagem(000L, "Lobo", 99.0, 1);

        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println(personagensLDJ.lower(lobo));
    }
}

