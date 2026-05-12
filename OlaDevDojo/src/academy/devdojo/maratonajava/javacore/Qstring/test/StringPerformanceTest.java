package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest {
    static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio) + " ms");

        long iniciosb = System.currentTimeMillis();
        concatStringBuilder(100_000);
        long fimsb = System.currentTimeMillis();
        System.out.println("Tempo String Builder: " + (fimsb - iniciosb) + " ms");

        long iniciosbuf = System.currentTimeMillis();
        concatStringBuilder(100_000);
        long fimsbuf = System.currentTimeMillis();
        System.out.println("Tempo String Buffer: " + (fimsbuf - iniciosbuf) + " ms");
    }


    private static void concatString(int tamanho) {
        String texto = "";

        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder stringBuilder = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            stringBuilder.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {

        StringBuffer stringBuffer = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++) {
            stringBuffer.append(i);
        }
    }
}
