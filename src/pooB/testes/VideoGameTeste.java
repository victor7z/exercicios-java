package pooB.testes;

import pooB.dominio.VideoGame;

public class VideoGameTeste {
    static void main(String[] args) {
        VideoGame.exibirCatalogo();
        VideoGame videoGame01 = new VideoGame("playone");
        VideoGame videoGame02 = new VideoGame("playtwo");
        
        videoGame01.exibirJogador();
        videoGame02.exibirJogador();


    }
}
