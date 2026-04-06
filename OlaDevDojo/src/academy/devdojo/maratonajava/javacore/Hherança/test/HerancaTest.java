package academy.devdojo.maratonajava.javacore.Hherança.test;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Pessoa;

public class HerancaTest {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        Endereco enderecoBob = new Endereco();

        endereco.setRua("Rua das moréias escandinavas.");
        endereco.setCep("48925-684");

        enderecoBob.setRua("Rua da Concha N°124");
        enderecoBob.setCep("28638-387");

        Pessoa pessoa1 = new Pessoa("Plankton");

        pessoa1.setCpf("62082619028");
        pessoa1.setEndereco(endereco);

        pessoa1.imprime();

        Funcionario funcionario1 = new Funcionario("Bob Esponja");

        funcionario1.setCpf("54678868860");
        funcionario1.setEndereco(enderecoBob);
        funcionario1.setSalario(200);

        funcionario1.imprime();
    }
}
