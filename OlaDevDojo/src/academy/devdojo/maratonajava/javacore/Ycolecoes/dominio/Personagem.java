package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Personagem implements Comparable<Personagem> {
    private Long id;
    private String nome;
    private Double powerLevel;

    public Personagem(Long id, String nome, Double powerLevel) {
        Objects.requireNonNull(id, "Id não pode ser null");
        Objects.requireNonNull(nome, "nome não pode ser null");
        Objects.requireNonNull(powerLevel, "powerLevel não pode ser null");
        this.id = id;
        this.nome = nome;
        this.powerLevel = powerLevel;
    }

    @Override
    public String toString() {
        return "\nPersonagem:" +nome+ "\n"+
                "Id: " +id+ "\n"+
                "Power Level: " +powerLevel+
                "\n-------------------------";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personagem personagem = (Personagem) o;
        return Objects.equals(id, personagem.id)
                && Objects.equals(nome, personagem.nome)
                && Objects.equals(powerLevel, personagem.powerLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, powerLevel);
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

    public Double getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(Double powerLevel) {
        this.powerLevel = powerLevel;
    }

    /*Regras para o Comparable
    -Precisa retornar um número inteiro
        *retorna negativo se o this < p(outro personagem)
        *retorna zero se this == p(outro personagem)
        *retorna positivo se o this > p(outro personagem)
    */
    @Override
    public int compareTo(Personagem p) {
        /*if (this.id < p.getId()) {
            return -1;
        } else if (this.id.equals(p.getId())) {
            return 0;
        } else {
           return 1;
        }*/
    /*se o powerLevel fosse um valor primitivo ao invés
    de um wrapper ficaria assim:
        return Double.compare(p.powerLevel,
        this.powerLevel);
    */
        /*return this.id.compareTo(p.getId());*/
        /*return Double.compare(p.powerLevel, this.powerLevel);*/
        /*return p.powerLevel.compareTo(this.powerLevel);*/
        return this.nome.compareTo(p.getNome());
    }
}
