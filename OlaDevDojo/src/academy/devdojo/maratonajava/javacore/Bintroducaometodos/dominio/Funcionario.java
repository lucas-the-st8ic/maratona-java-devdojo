package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

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

        media = Arrays.stream(salarios)
                .summaryStatistics().getAverage();

        System.out.printf("Média salarial: R$ %.2f \n", media);
        System.out.println("==============================");
    }
}

