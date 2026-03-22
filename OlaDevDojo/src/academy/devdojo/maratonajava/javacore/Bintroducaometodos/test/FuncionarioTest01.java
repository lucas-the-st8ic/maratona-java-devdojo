package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();

        funcionario01.setNome("Maria");
        funcionario01.setIdade(20);
        funcionario01.setSalarios(new double[]{6541, 7534, 4384});


        funcionario01.imprimeDados();



        funcionario02.setNome("Carlos");
        funcionario02.setIdade(30);
        funcionario02.setSalarios(new double[]{1200, 3458, 7920});

        funcionario02.imprimeDados();

    }
}
