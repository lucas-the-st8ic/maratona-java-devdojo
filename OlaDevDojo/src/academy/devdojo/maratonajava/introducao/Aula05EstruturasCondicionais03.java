package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    static void main(String[] args) {

        //Operador ternario (condição) ? verdadeiro : falso;

        double salario = 5000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;

    /*    if(salario >= 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }*/
        System.out.println(resultado);

        int idade = 14;
        String categoria;
        /*      if(idade < 15) {
            System.out.println("Categoria Infantil.");
        } else if(idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil.");
        } else {
            System.out.println("Categoria Adulto.");
        }*/
        categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade <18 ? "Categoria Juvenil" : "Categoria Adulto";

        System.out.println(categoria);
    }
}
