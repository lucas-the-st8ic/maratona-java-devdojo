package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {

    private String titulo;
    private String tipo;
    private int episodios;
    private String genero;

    public void novoAnime(String titulo, String tipo, int episodios) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void novoAnime(String titulo, String tipo, int episodios, String genero) {
        this.novoAnime(titulo, tipo, episodios);
        this.genero = genero;
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
