package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading...");
    }

    @Override
    public void remove() {
        System.out.println("Removing...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission...");
    }
}
