package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    static void main(String[] args) {
        /*
         Estruturas de Repetição:

         -while
         -do while
         -for
        */

        int numero = 1;

        while(numero <= 10) {
            System.out.println(numero);
            numero++;
        }

        numero = 0;

        do {
            System.out.println(numero+ " dentro do do while");
            numero++;
        }while(numero <= 10);


        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
