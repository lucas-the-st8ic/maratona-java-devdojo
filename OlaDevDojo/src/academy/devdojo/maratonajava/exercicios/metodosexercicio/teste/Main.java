package academy.devdojo.maratonajava.exercicios.metodosexercicio.teste;

import academy.devdojo.maratonajava.exercicios.metodosexercicio.Funcionario;

public class Main {
    static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();

        funcionario01.nome = "Maria";
        funcionario01.idade = 20;
        funcionario01.salarios =  new double[] {6541, 7534, 4384};


        funcionario01.imprimeDados();



        funcionario02.nome = "Carlos";
        funcionario02.idade = 30;
        funcionario02.salarios =  new double[] {1200, 3458, 7920};

        funcionario02.imprimeDados();

    }
}
