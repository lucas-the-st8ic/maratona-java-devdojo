package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    static void main(String[] args) {
        Path path_1 = Paths.get("C:\\Users\\Lucas\\Documents\\GitHub\\maratona-java-devdojo\\Pasta_2\\arquivo.txt");
        Path path_2 = Paths.get("C:\\Users\\Lucas\\Documents\\GitHub\\maratona-java-devdojo","arquivo.txt");
        Path path_3 = Paths.get("C:\\Users\\Lucas\\Documents\\GitHub\\maratona-java-devdojo\\Pasta_2\\arquivo.txt");
        Path path_4 = Paths.get("C:","Users","Lucas","Documents","maratona-java-devdojo","arquivo.txt");
        System.out.println(path_1.getFileName());
        System.out.println(path_2.getFileName());
        System.out.println(path_3.getFileName());
        System.out.println(path_4.getFileName());

    }
}
