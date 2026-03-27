package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {

    private String titulo;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime (String titulo,
                  String tipo,
                  int episodios, String genero) {
        this();
        this.titulo = titulo;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime (String titulo,
                  String tipo,
                  int episodios, String genero,
                  String estudio) {

        this(titulo, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public Anime (){
        System.out.println("Dentro do construtor sem argumentos. ");

    }

    public void imprime() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episodios: " + this.episodios);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Estudio: " + this.estudio);
    }


    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

}
