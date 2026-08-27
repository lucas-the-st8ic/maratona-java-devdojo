package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Bob Esponja";
    static class Nested {
        private String lastName = "Calça Quadrada";
        void print() {
            System.out.println(
                    new OuterClassesTest03().name+ " "
            +lastName);
        }
    }

    static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
