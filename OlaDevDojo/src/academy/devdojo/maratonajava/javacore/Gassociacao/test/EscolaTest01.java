package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    static void main(String[] args) {
        Professor professor1 = new Professor("Euclides");
        Professor professor2 = new Professor("Guanabara");
        Professor[] professores = {professor1, professor2};

        Escola escola = new Escola("Isaltino de Mello",  professores);

        escola.imprime();
    }
}
