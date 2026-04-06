package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome) {
        super(nome);
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
