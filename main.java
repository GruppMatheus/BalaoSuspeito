import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get Pessoa data
        System.out.println("Digite os dados da Pessoa:");
        System.out.print("Nome: ");
        String nomePessoa = scanner.nextLine();
        System.out.print("Idade: ");
        int idadePessoa = scanner.nextInt();
        Pessoa pessoa = new Pessoa(nomePessoa, idadePessoa);
        
        scanner.nextLine(); // Consume the remaining newline character
        
        // Get Musica data
        System.out.println("\nDigite os dados da Música:");
        System.out.print("Título: ");
        String tituloMusica = scanner.nextLine();
        System.out.print("Duração (em segundos): ");
        int duracaoMusica = scanner.nextInt();
        System.out.print("Compositor: ");
        String compositorMusica = scanner.nextLine();
        Musica musica = new Musica(tituloMusica, duracaoMusica, compositorMusica);
        
        scanner.nextLine(); // Consume the remaining newline character
        
        // Get Album data
        System.out.println("\nDigite os dados do Álbum:");
        System.out.print("Gênero: ");
        String generoAlbum = scanner.nextLine();
        System.out.print("Ano: ");
        int anoAlbum = scanner.nextInt();
        System.out.print("Nome: ");
        String nomeAlbum = scanner.nextLine();
        System.out.print("Artista: ");
        String artistaAlbum = scanner.nextLine();
        List<String> musicasAlbum = new ArrayList<>();
        System.out.print("Digite o nome das músicas do álbum (Digite 'fim' para parar): ");
        String nomeMusica = scanner.nextLine();
        while (!nomeMusica.equalsIgnoreCase("fim")) {
            musicasAlbum.add(nomeMusica);
            System.out.print("Digite o nome das músicas do álbum (Digite 'fim' para parar): ");
            nomeMusica = scanner.nextLine();
        }
        Album album = new Album(generoAlbum, anoAlbum, nomeAlbum, artistaAlbum, musicasAlbum);
        
        // Show Album data
        System.out.println("\nDados do Álbum:");
        album.mostrarTodosOsDados();
    }
}

class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
 

    public String getNome() {
        return nome;
    }
  
    public void setNome(String nome) {
        this.nome = nome;
    }
  
    public int getIdade() {
        return idade;
    }
  
    public void setIdade(int idade) {
        this.idade = idade;
    }
}

class Musica {
    private String titulo;
    private int duracao;
    private String compositor;
    
    public Musica (String titulo, int duracao, String compositor) {
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

class Album {
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