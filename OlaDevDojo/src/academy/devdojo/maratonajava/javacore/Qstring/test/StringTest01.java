package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    static void main(String[] args) {
        //String constant pool
        String nome = "Lucas";
        String nome2 = "Lucas";

        nome = nome.concat(" Silva");
        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Lucas");
        //1 variavel de referência
        //2 Objeto do tipo String
        //3 uma String no pool de string

        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
