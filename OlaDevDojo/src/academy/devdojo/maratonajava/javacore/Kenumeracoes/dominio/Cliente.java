package academy.devdojo.maratonajava.javacore.Kenumeracoes.dominio;

public class Cliente {
    private String nome;
    private TipoCLiente tipoCLiente;

    public Cliente(String nome, TipoCLiente tipoCLiente) {
        this.nome = nome;
        this.tipoCLiente = tipoCLiente;
    }

    @Override
    public String toString() {
        return "======Cliente======\n"+
                "Nome: " +nome+
                "\nTipo: " +tipoCLiente+
                "\n===================";

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCLiente getTipoCLiente() {
        return tipoCLiente;
    }

    public void setTipoCLiente(TipoCLiente tipoCLiente) {
        this.tipoCLiente = tipoCLiente;
    }
}
