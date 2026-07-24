package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Personagem;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    static void main(String[] args) {
        Set<Personagem> personagensLDJ = new LinkedHashSet<>();
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

        for (Personagem personagem : personagensLDJ) {
            System.out.println(personagem);
        }

    }
}
