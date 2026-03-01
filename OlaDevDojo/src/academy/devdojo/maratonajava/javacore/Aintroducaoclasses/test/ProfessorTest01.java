package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {

        Professor professor = new Professor();

        professor.nome = "Guanabara";
        professor.sexo = 'M';
        professor.idade = 23;

        System.out.println(professor.nome+ " " +professor.sexo+ " " +professor.idade);


    }
}
