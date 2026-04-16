package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading archive...");
    }

    @Override
    public void remove() {
        System.out.println("Removing archive...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission...");
    }
}
