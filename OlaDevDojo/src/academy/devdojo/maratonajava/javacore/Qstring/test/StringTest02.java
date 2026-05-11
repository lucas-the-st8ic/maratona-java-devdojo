package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    static void main(String[] args) {
        String nome = "Lucas";
        String numeros = "0123456";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("L","l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2));
        System.out.println(nome.trim());
    }
}
