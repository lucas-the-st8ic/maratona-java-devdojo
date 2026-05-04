package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.*;

public class TryWithResourcesTest01 {
    static void main(String[] args) {

    }


    public static void lerArquivo() {
        //Só é possível colocar objetos que implementem
        // a interface Closeable ou Autocloseable
        try(Reader reader =
                new BufferedReader(
                        new FileReader("teste.txt"))) {

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivo2() {
        Reader reader = null;

        try {
            reader = new BufferedReader(
                    new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
