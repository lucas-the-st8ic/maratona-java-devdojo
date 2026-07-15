package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    static void main(String[] args) {
        List<String> nomes = new ArrayList<>();//Até a versão 1.4 Java
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Bob Esponja");
        nomes.add("Lula Molusco");
        nomes.add("Patrick");
        //nomes.remove("Patrick");


        nomes2.add("Lucas");
        nomes2.add("DevDojo");
        nomes2.add("DevDojo academy");

        nomes.addAll(nomes2);
        for(String nome : nomes) {
            System.out.println(nome);
        }

        nomes.add("Sirigueijo");
        System.out.println("-----------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));

        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
