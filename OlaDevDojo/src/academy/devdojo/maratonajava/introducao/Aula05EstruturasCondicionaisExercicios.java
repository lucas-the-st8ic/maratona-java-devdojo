package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicios {
    static void main(String[] args) {
        /*Dado os valores de 1 a 7
        utilize o switch e imprima
        se é dia útil ou final de semana
        considerando 1 como domingo*/

        byte opcao = 1;

        switch (opcao) {

            case 1:
                System.out.println("Final de Semana");
                break;

            case 2:
                System.out.println("Dia útil");
                break;

            case 3:
                System.out.println("Dia útil");
                break;

            case 4:
                System.out.println("Dia útil");
                break;

            case 5:
                System.out.println("Dia útil");
                break;

            case 6:
                System.out.println("Dia útil");
                break;

            case 7:
                System.out.println("Final de Semana");
                break;

            default:
                System.out.println("Opção inválida");
                break;

        }

    }
}
