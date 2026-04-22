package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto {

    public static final double PORCENTAGEM_IMPOSTO = 0.15;
    private double valor;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto...");

        return this.valor * PORCENTAGEM_IMPOSTO;
    }

}
