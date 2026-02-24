package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    static void main(String[] args) {

        //Valores padrão de Arrays
        //byte,short, int, long, float e double 0
        //char '\u0000'''
        //boolean false
        //String null

        String[] nomes = new String[3];

        nomes[0] = "Maria";
        nomes[1] = "João";
        nomes[2] = "Mario";


        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }


    }
}
