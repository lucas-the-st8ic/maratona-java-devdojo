package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Personagem {
    private Long id;
    private String nome;

    public Personagem(Long id, String nome) {
        Objects.requireNonNull(id, "Id não pode ser null");
        Objects.requireNonNull(nome, "nome não pode ser null");
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Personagem: " + this.nome+ "\n" +
                "Id: " +this.id+ "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Personagem personagem = (Personagem) o;
        return Objects.equals(id, personagem.id) && Objects.equals(nome, personagem.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
