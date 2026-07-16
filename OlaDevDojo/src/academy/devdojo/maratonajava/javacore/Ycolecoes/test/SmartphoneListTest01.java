package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    static void main(String[] args) {
        Smartphone cel1 = new Smartphone("1ABC1", "Iphone 17");
        Smartphone cel2 = new Smartphone("2ABC1", "Motorola Edge 60");
        Smartphone cel3 = new Smartphone("2ABCD1","Samsung Galaxy S9");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(cel1);
        smartphones.add(cel2);
        smartphones.add(cel3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

    }
}
