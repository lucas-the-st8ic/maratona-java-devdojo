package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Personagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonagemSortTest01 {
    static void main(String[] args) {
        List<Personagem> personagensLDJ = new ArrayList<>();
        personagensLDJ.add(new Personagem(27L, "Batman", 85.0));
        personagensLDJ.add(new Personagem(1L, "Superman", 100.0));
        personagensLDJ.add(new Personagem(8L, "Wonder Woman", 97.5));
        personagensLDJ.add(new Personagem(123L, "Flash", 96.0));
        personagensLDJ.add(new Personagem(22L, "Green Lantern", 94.5));
        personagensLDJ.add(new Personagem(2L, "Shazam", 98.0));
        personagensLDJ.add(new Personagem(34L, "Hawkgirl", 82.0));
        personagensLDJ.add(new Personagem(13L, "Plastic Man", 91.0));
        personagensLDJ.add(new Personagem(4L, "Zatanna", 95.0));
        personagensLDJ.add(new Personagem(225L, "Martian Manhunter", 99.0));

        for (Personagem personagem : personagensLDJ) {
            System.out.println(personagem);
        }

        Collections.sort(personagensLDJ);
        System.out.print("=================");
        for (Personagem personagem : personagensLDJ) {
            System.out.println(personagem);
        }
    }
}
