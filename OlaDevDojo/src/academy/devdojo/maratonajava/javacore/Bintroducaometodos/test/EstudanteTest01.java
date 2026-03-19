package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimiDadosEstudante;

public class EstudanteTest01 {
    static void main(String[] args) {

        ImprimiDadosEstudante impressao = new ImprimiDadosEstudante();

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 12;
        estudante01.sexo = "Masculino";

        estudante02.nome = "Sakura";
        estudante02.idade = 18;
        estudante02.sexo = "Feminino";

       impressao.imprimir(estudante01);

       impressao.imprimir(estudante02); 
    }
}
