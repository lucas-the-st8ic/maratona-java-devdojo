package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {2,4,6,8,10};
        int[] numeros3 = new int[] {1,2,3,4,5};

        for(int numero : numeros2){
            System.out.println(numero);
        }

        for(int numero : numeros){
            System.out.println(numero);
        }
    }
}
