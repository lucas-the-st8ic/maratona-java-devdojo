package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    static void main(String[] args) {
        //Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Bob Esponja");
        lista.add("Lula Molusco");

        for(String s: lista){
            System.out.println(s);
        }
        add(lista, new Consumidor("Patrick"));
    }

    private static void add(List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
