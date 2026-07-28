package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    static void main(String[] args) {

        Queue<String> fila = new PriorityQueue<>();

        fila.add("C");
        fila.add("B");
        fila.add("A");
        fila.add("D");


        while(!fila.isEmpty()) {
            System.out.println(fila.remove());
        }

    }
}
