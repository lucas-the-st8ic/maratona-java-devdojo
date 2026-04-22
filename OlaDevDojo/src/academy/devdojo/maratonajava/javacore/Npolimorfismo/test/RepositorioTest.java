package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    static void main(String[] args) {
        Repositorio repositorio =
                new RepositorioArquivo();

        repositorio.salvar();

        List<String> list = new ArrayList<>();
        list.add("Bob Esponja");
        list.add("Lula Molusco");
        list.add("Sandy");
    }
}
