package academy.devdojo.maratonajava.exercicios.associacaoexercicio.dominio;

public class Seminario {
    private String titulo;

    private Aluno [] alunos;
    private Professor [] professores;


    public Seminario(String titulo, String endereco) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, String endereco, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
