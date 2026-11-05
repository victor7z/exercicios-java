package poo2.dominio;


public class VideoGame {
    private String nomeJogador;
    private static String[] jogosDisponiveis;

    static{
        VideoGame.jogosDisponiveis = new String[]{"Valorante","GTA-5","Forza","Fifa"};
    }

    public VideoGame (String nomeJogador){
        this.nomeJogador = nomeJogador;
    }

    public static void exibirCatalogo(){
        for (String jogo : jogosDisponiveis){
            System.out.println("Jogo: "+jogo);
        }
    }
    public void exibirJogador(){
        System.out.println("Jogador: "+nomeJogador);
    }

}
