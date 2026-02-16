package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao04 {
    static void main(String[] args) {
        /*  Dado o valor de um carro,
        descubra em quantas vezes ele pode
        ser parcelado.
        */

        Scanner input = new Scanner(System.in);

        double valorDoCarro;

        System.out.print("Insira o valor do carro: R$");
        valorDoCarro = input.nextDouble();

        for ( int parcela = 1; parcela <= valorDoCarro; parcela++ ) {
            double valorParcela = valorDoCarro / parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela: " + parcela + " R$ " + valorParcela);
        }



    }
}
