package academy.devdojo.maratonajava.javacore.Kenumeracoes.dominio;

public class Cliente {



    private String nome;
    private final TipoCliente tipoCLiente;
    private final TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCLiente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCLiente = tipoCLiente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "======Cliente======\n" +
                "Nome: " +nome+
                "\nTipo Cliente: " + tipoCLiente.getNomeRelatorio() +
                "\nTipo ClienteInt: " + tipoCLiente.getValor() +
                "\nTipo Pagamento: " + tipoPagamento +
                "\n===================";
    }

}
