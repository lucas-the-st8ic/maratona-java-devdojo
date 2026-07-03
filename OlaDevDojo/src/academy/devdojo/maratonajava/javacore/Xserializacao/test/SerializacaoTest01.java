package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    static void main(String[] args) {
        Aluno aluno01 = new Aluno(010102L, "Bob Esponja", "934875845");
        Turma turma = new Turma("Maratona Java");
        aluno01.setTurma(turma);
           serializar(aluno01);
           deserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream obj = new ObjectOutputStream(
                Files.newOutputStream(path))) {
            obj.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        };
    }

    private static void deserializar() {
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream objInpt = new ObjectInputStream(
                Files.newInputStream(path))) {
            Aluno aluno = (Aluno) objInpt.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        };
    }
}
