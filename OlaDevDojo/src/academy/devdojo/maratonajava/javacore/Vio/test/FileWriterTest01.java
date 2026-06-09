package academy.devdojo.maratonajava.javacore.Vio.test;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true)) {
            fw.write("Playlist DevDojo\n Acompanhe os videos do canal focado em programação Java\n");
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
