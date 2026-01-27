package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main(String[] args) {
    /*Tipos Primitivos:
    * int, double, float, char
    * byte, short, long, boolean
    *
    * Os tipos primitivos em Java possuem tamanhos
    *  fixos em bytes, garantindo portabilidade.
    *  Os principais são:
    *  byte (1 byte, -128 a 127),
    *  short (2 bytes, -32.768 a 32.767),
    *  int (4 bytes, -2,1 bi a 2,1 bi),
    *  long (8 bytes, -9 quintilhões a 9 quintilhões),
    *  float (4 bytes),
    *  double (8 bytes),
    *  char (2 bytes)
    *  boolean (1 bit). */

        int age = 27;
        long numeroGrande = 1000000000;
        double salarioDouble = 10000.0;
        float salarioFloat = 10500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;


        System.out.println("Idade: " +age);
        System.out.println(verdadeiro);
        System.out.printf("Carateres: " +caractere);
    }
}
