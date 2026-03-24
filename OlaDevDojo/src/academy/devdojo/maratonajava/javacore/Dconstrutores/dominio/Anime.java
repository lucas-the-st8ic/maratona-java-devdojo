package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {

    private String titulo;
    private String tipo;
    private int episodios;
    private String genero;

    public Anime (String titulo,
                  String tipo,
                  int episodios, String genero) {
        System.out.println("Construtor...");
        this.titulo = titulo;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime (){

    }

    public void imprime() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episodios: " + this.episodios);
        System.out.println("Gênero: " + this.genero);
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
