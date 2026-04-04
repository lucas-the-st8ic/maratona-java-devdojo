package academy.devdojo.maratonajava.exercicios.associacaoexercicio.test;

import academy.devdojo.maratonajava.exercicios.associacaoexercicio.dominio.Aluno;
import academy.devdojo.maratonajava.exercicios.associacaoexercicio.dominio.Local;
import academy.devdojo.maratonajava.exercicios.associacaoexercicio.dominio.Professor;
import academy.devdojo.maratonajava.exercicios.associacaoexercicio.dominio.Seminario;

public class MainExercicioAssociacao {
    static void main(String[] args) {

        Local local = new Local("Av. Dr.Mário Vilas Boas Rodrigues, 387 | Santo Amaro");
        Aluno aluno1 = new Aluno("Carlos", 18);
        Professor professor1 = new Professor("Eneas", "IA");

        Aluno[] alunosSeminario = {aluno1};
        Seminario seminario1 = new Seminario("IA nas empresas", alunosSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario1};

        professor1.setSeminarios(seminariosDisponiveis);

        professor1.imprime();
    }
}
