package Entity;

public class Livros {
    private int id;
    private String titulo;
    private int anoPublicacao;
    private String genero;
    // Criação de métodos de forma similar a criação de tabelas SQL //
    public Livros() {}

    public Livros(String titulo, int anoPublicacao, String genero) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }

  // Get's e Set's //
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(int anoPublicacao) { this.anoPublicacao = anoPublicacao; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
}
