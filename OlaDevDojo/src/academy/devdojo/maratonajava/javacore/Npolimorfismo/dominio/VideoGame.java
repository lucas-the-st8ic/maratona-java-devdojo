package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class VideoGame extends Produto{

    public static final double PORCENTAGEM_IMPOSTO = 0.25;
    private String memoria = "1TB";
    private double valor;

    public VideoGame(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto...");
        return this.valor * PORCENTAGEM_IMPOSTO;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
}
