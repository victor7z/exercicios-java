package poo2.dominio;

public class PlayList {
    private String nome;
    private String[] musicas;

    public PlayList(String nome, String[] musicas) {
        this.nome = nome;
        this.musicas = musicas;
    }

    public PlayList(String[] musicas) {
        this("Minha Playlist", musicas);
    }

    public void setMusicas(String[] musicas){
        this.musicas = musicas;
    }

    public String[] getMusicas(){
        return this.musicas;
    }

    public void exibirPlayList(){
        System.out.println("Playlist: "+ this.nome);
        for (int i = 0; i < this.musicas.length; i++) {
            System.out.println("Musica "+ (i+1)+ ": "+this.musicas[i]);
        }
    }
}
