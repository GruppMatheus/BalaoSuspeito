public class Musica {
    private String titulo;
    private int duracao;
    private String compositor;
    
    public Musica(String titulo, int duracao, String compositor) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.compositor = compositor;
    }
    
    public void tocarMusica() {
        System.out.println("Tocando a música: " + titulo);
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
}