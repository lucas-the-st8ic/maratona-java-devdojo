package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {


    /*Modificadores de Acesso
    *   -private
    *   -default
    *   -protected
    *   -public*/

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

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na " +
                "classe DatabaseLoader");
    }
}
