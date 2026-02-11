package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoExercicio {
    static void main(String[] args) {
        /*
        Imprima todos os números pares de 0 até 1000000
        */

        for (int numero = 0; numero <= 100000; numero++) {
            if(numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
