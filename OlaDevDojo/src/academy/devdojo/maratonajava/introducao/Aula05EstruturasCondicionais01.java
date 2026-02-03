package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    static void main(String[] args) {
        int idade = 27;
        boolean isMaiorDeIdade = idade >= 18;

        //Instruções independentes
        if(isMaiorDeIdade) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        if(!isMaiorDeIdade){
            System.out.println("Não Autorizado. Menor de 18 anos");
        }

        //Instruções aninhadas
        if(isMaiorDeIdade) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não Autorizado. Menor de 18 anos");
        }
    }
}
