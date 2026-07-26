package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    static void main(String[] args) {
         Map<String, String> map = new HashMap<>();
         map.put("teklado", "teclado");
         map.put("mouze", "mouse");
         map.put("vc", "você");
         map.putIfAbsent("vc2", "você");
        System.out.println(map);

        
    }
}
