package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Dentro do bloco estático de inicialização funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização funcionario 2");
    }


    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor funcionario");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salário: R$" +this.salario);
        System.out.println("------------------------------");

    }

    public void relatorioPagamento() {
        System.out.println("Eu " +this.nome+ " recebi o salário de R$ "
                +this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
