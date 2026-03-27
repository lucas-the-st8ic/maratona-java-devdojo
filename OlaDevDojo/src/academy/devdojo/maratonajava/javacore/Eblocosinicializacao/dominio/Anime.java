package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {

    private String titulo;
    private int[] episodios;

    /*
       1- Alocado espaço em memória para o objeto.
       2- Cada atributo de classe é criado e inicializado
       com valores default ou o que foi declarado dentro dos atributos.
       3- Bloco de inicialização é executado...
       4- Construtor é executado.

    */


    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    public Anime(String titulo) {
        this.titulo = titulo;
    }

    public Anime() {

        for(int ep : this.episodios) {
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
