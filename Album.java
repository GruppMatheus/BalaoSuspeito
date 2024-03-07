import java.util.List;

public class Album {
    private String genero;
    private int ano;
    private String nome;
    private String artista;
    private List<String> musicas;

    public Album(String genero, int ano, String nome, String artista, List<String> musicas) {
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicas = musicas;
    }

    public void mostrarTodosOsDados() {
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + ano);
        System.out.println("Nome: " + nome);
        System.out.println("Artista: " + artista);
        
        System.out.println("Músicas:");
        for (String musica : musicas) {
            System.out.println(musica);
        }
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public List<String> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<String> musicas) {
        this.musicas = musicas;
    }
}
