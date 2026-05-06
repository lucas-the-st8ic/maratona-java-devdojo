package academy.devdojo.maratonajava.javacore.Pwrappers.test;

import java.util.List;

public class WrapperTest01 {
    static void main(String[] args) {
    /*Wrappers são objetos
    que irão encapsular tipos primitivos
    */

        byte byteP = 1;
        short shortP = 1;
        int intP = 1; //autoboxing
        long longP = 10;
        float floatP = 10F;
        double doubleP = 10D;
        char charp = 'W';
        boolean booleanP = false;

        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        /*Unboxing - Compilador Converte de maneira automática
        um tipo wrapper(Objeto) de volta para
        seu tipo primitivo correspondente.*/
        int i = intW;

        Integer intW2 = Integer.parseInt("1");
        Integer intW3 = Integer.parseInt("1");

        boolean aTrue = Boolean.parseBoolean("true");

        System.out.println(aTrue);


        System.out.println(Character.isDigit(charp));
    }

}
