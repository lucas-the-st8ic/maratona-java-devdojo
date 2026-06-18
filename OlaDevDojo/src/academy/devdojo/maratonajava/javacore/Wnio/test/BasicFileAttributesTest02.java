package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta_2/novo_path.txt");
        BasicFileAttributes basicFileAttributes =
                Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastAccessTime();
        FileTime lastAccessTime = basicFileAttributes.lastModifiedTime();

        System.out.println("Creation time: " +creationTime);
        System.out.println("Last modified time: " +lastModifiedTime);
        System.out.println("Last Acccess time: " +lastAccessTime);


        BasicFileAttributeView fileAttributeView =
                Files.getFileAttributeView(path, BasicFileAttributeView.class);

        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newCreationTime, creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastAccessTime();
        lastAccessTime = fileAttributeView.readAttributes().lastModifiedTime();

        System.out.println("Creation time: " +creationTime);
        System.out.println("Last modified time: " +lastModifiedTime);
        System.out.println("Last Acccess time: " +lastAccessTime);

    }
}
