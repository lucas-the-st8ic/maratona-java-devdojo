package academy.devdojo.maratonajava.javacore.Kenumeracoes.test;

import academy.devdojo.maratonajava.javacore.Kenumeracoes.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenumeracoes.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenumeracoes.dominio.TipoPagamento;

public class ClienteTest01 {
    static void main(String[] args) {
        Cliente cliente1 = new Cliente("Larry Lagosta", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Senhora Puff", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);


        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.CalcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.CalcularDesconto(500));
    }
}
