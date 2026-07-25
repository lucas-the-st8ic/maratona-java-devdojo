package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private Double preco;
    private int quantidade;

    public Manga(Long id, String nome, Double preco) {
        Objects.requireNonNull(id, "Id não pode ser null");
        Objects.requireNonNull(nome, "nome não pode ser null");
        Objects.requireNonNull(preco, "preco não pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, Double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nManga:" +nome+ "\n"+
                "Id: " +id+ "\n"+
                "Preço: " +preco+ "\n"+
                "Quantidade: " +quantidade+
                "\n-----------------------------------";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /*Regras para o Comparable
        -Precisa retornar um número inteiro
            *retorna negativo se o this < m(outro manga)
            *retorna zero se this == m(outro manga)
            *retorna positivo se o this > m(outro manga)
        */
    @Override
    public int compareTo(Manga m) {
        /*if (this.id < m.getId()) {
            return -1;
        } else if (this.id.equals(m.getId())) {
            return 0;
        } else {
           return 1;
        }*/
    /*se o preco fosse um valor primitivo ao invés
    de um wrapper ficaria assim:
        return Double.compare(m.preco,
        this.preco);
    */
        /*return this.id.compareTo(m.getId());*/
        /*return Double.compare(m.preco, this.preco);*/
        /*return m.preco.compareTo(this.preco);*/
        return this.preco.compareTo(m.preco);
    }
}
