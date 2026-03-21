package academy.devdojo.maratonajava.exercicios.metodosexercicio;

import java.util.Arrays;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados (){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);

        if(this.salarios == null){
            return;
        }
        for(double sal : salarios ) {
            System.out.println("Salario: R$"+sal);
        };

        mediaSalarial();
    }

    public void mediaSalarial() {

        if(this.salarios == null){
            return;
        }

        double media = Arrays.stream(salarios)
                .summaryStatistics().getAverage();

        System.out.printf("Média salarial: R$ %.2f \n", media);
        System.out.println("==============================");
    }
}

