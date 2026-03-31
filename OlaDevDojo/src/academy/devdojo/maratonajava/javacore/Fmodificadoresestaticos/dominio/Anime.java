package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio;

public class Anime {

    private String titulo;
    private static int[] episodios;

    /*
       0- Bloco de Inicialização é executado quando a jvm
          carregar a pasta
       1- Alocado espaço em memória para o objeto.
       2- Cada atributo de classe é criado e inicializado
       com valores default ou o que foi declarado dentro dos atributos.
       3- Bloco de inicialização é executado...
       4- Construtor é executado.

    */


    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização");
    }

    public Anime(String titulo) {
        this.titulo = titulo;
    }

    public Anime() {

        for(int ep : Anime.episodios) {
            System.out.print(ep + " ");
        }

        System.out.println();
    }


    public String getTitulo() {
        return titulo;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
