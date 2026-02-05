package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* 226.100 a 318.299 = 1.7%
        *  318.300 a 725.049 = 4.0%
        *  720.050 a 980.099 = 13.7%
        *  980.100 a 1.467.199 = 16.8%
        *  1.467.200 = 17.8% */

        double salarioAnual;
        double porcentagemDoImposto;
        double valorImpostoAPagar;

        System.out.print("Insira o valor do seu salario anual: R$ ");
        salarioAnual = input.nextDouble();

        if(salarioAnual >= 226.100 && salarioAnual <= 318.299) {
            porcentagemDoImposto = 1.7 / 100;
        } else if(salarioAnual >= 318.300 && salarioAnual <= 725.049) {
            porcentagemDoImposto = 4.0 / 100;
        } else if(salarioAnual >= 725.050 && salarioAnual <= 980.099) {
            porcentagemDoImposto = 13.7 / 100;
        } else if(salarioAnual >= 980.100 && salarioAnual <= 1467.199) {
            porcentagemDoImposto = 16.8 / 100;
        } else {
            porcentagemDoImposto = 17.8 / 100;
        }


        valorImpostoAPagar = salarioAnual * porcentagemDoImposto;


        System.out.println("Valor a pagar de Impostos: R$ " + valorImpostoAPagar);
    }
}
