package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros () {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros () {
        System.out.println(20 - 10);
    }

    public void multiplicaDoisNumeros (int primeiroNumero, int segundoNumero) {
        System.out.println(primeiroNumero * segundoNumero);
    }

    public double divideDoisNumeros (double primeiroNumero, double segundoNumero) {

        if(segundoNumero == 0) {
            return 0;
        }

        return primeiroNumero / segundoNumero;
    }

    public void metodoVoid(double num1, double num2) {
        if(num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
            System.out.println(num1 / num2);

    }
}
