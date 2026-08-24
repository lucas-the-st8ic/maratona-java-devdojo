package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

class Animal {
    public void walk() {
        System.out.println("Animal is walking");
    }
}



public class AnonymousClassesTest01 {

    static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the park!");
            }

            public void jump() {

            }
        };

        animal.walk();

    }
}
