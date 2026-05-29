package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    static void main(String[] args) {
        String texto = "Bob Esponja, Patrick, Garry";

        String[] split = texto.split(",");

        for(String nome : split) {
            System.out.println(nome.trim());
        }


    }
}
