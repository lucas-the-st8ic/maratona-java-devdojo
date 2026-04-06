package academy.devdojo.maratonajava.javacore.Hherança.test;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Funcionario;

public class HerancaTest2 {

    /*
       0- Bloco de Inicialização estático
            da super classe é executado quando a jvm
            carregar a super classe.
       1- Bloco de inicialização estático da sub classe
            é executado quando a jvm carregar a subclasse.
       2- Alocado espaço em memória pro objeto da super classe
       3- Cada atributo da super classe é criado e inicializado com valores
            default ou o que for passado.
       4- Bloco de inicialização da superclasse é executado
            na ordem em que ela aparece
       5- Construtor da superclasse é executado
       6- Alocado espaço em memória pro objeto da subclasse
       7- Cada atributo da subclasse é criado e inicializado
            com valores default ou o que for passado da classe pai
       8- Bloco de inicialização da subclasse é executado
             na ordem em que aparece.
       9-  Construtor da subclasse é executado.

    */

    static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Bob Esponja");


    }
}
