package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    static void main(String[] args) {
        File file = new File("file.txt");

        try {

            boolean newFileIsCreated = file.createNewFile();
            System.out.println("Created "+newFileIsCreated);

            System.out.println("Path: " +file.getPath());
            System.out.println("Path absolute: " +file.getAbsolutePath());
            System.out.println("Is directory: " +file.isDirectory());
            System.out.println("Is file: " +file.isFile());
            System.out.println("Is hidden: " +file.isHidden());
            System.out.println("Last modified date: " + new Date(file.lastModified()));
            System.out.println("Can read: " +file.canRead());

            boolean exists = file.exists();
            if(exists) {
                System.out.println("Deleted "+file.delete());
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
