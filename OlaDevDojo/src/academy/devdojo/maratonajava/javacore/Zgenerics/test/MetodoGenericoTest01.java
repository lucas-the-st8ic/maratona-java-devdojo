package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Iate Luxo"));
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }

/*    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }*/
}


