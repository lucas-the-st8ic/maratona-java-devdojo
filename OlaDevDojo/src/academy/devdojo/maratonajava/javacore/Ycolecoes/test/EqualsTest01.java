package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    static void main(String[] args) {
        Smartphone cel1 = new Smartphone("1ABC1", "Iphone 17");
        Smartphone cel2 = new Smartphone("1ABC1", "Iphone 17");
        System.out.println(cel1.equals(cel2));
    }
}
