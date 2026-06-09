package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println(isDiretorioCreated);

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isArquivoCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isArquivoCreated);

        File fileRenamed = new File("arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);

        System.out.println(isRenamed);
    }
}
