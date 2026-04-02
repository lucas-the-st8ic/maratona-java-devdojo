package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {

    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void imprime() {
        System.out.println("Escola: " + nome);
        if (professores == null) {
            return;
        }
        for (Professor professor : professores) {
            System.out.println("Professor: " +professor.getNome());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
