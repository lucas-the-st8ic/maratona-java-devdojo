package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    static void main(String[] args) {
        String nome = "Lucas Silva";
        nome.concat(" Dev Java");
        nome.substring(0, 3);
        System.out.println(nome);
        System.out.println("===============");

        StringBuilder stringBuilder = new StringBuilder("Lucas Silva");
        stringBuilder.append(" Dev Java").append(" backend");
        String substring = stringBuilder.substring(0, 2);
        //stringBuilder.reverse();
        stringBuilder.delete(0, 5);
        System.out.println(stringBuilder);

    }
}
