package academy.devdojo.maratonajava.javacore.Pwrappers.test;

import java.util.List;

public class WrapperTest01 {
    static void main(String[] args) {
    /*Wrappers são objetos
    que irão encapsular tipos primitivos
    */

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
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

        List<Integer> lista = List.of(1,2,3,4,5,6);
    }

}
