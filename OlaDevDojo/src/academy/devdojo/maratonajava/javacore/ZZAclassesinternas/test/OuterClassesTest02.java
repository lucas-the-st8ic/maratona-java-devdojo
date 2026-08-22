package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {

    private String name = "Bob Esponja";

    void print(String param) {

        String lastName = "Calça Quadrada";

        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(name+ " " +lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();

        outer.print();
    }
}
