package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    static void main(String[] args) {

        //Exceptions mais genéricas sempre tem de ficar
        //no final, doo contrário, devido
        //ao polimorfismo elas estarão fora de alcance

        try {
                throw new RuntimeException();
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch(IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch(ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch(RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }


        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void talvezLanceException() throws SQLException,
            FileNotFoundException{}

}
