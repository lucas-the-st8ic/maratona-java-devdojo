package academy.devdojo.maratonajava.exercicios.associacaoexercicio.dominio;

public class Seminario {
    private String titulo;

    private Aluno [] alunos;
    private Professor [] professores;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }



    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, Professor[] professores, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.professores = professores;
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
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
