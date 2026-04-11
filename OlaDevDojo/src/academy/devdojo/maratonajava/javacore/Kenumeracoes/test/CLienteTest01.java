package academy.devdojo.maratonajava.javacore.Kenumeracoes.test;

import academy.devdojo.maratonajava.javacore.Kenumeracoes.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenumeracoes.dominio.TipoCLiente;

public class CLienteTest01 {
    static void main(String[] args) {
        Cliente cliente1 = new Cliente("Larry Lagosta", TipoCLiente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Senhora Puff", TipoCLiente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Pérola", TipoCLiente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Sandy", TipoCLiente.PESSOA_JURIDICA);
        Cliente cliente5 = new Cliente("Patrick", TipoCLiente.PESSOA_JURIDICA2);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);
    }
}
