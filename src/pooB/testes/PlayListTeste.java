package pooB.testes;

import pooB.dominio.PlayList;

public class PlayListTeste {
    static void main(String[] args) {
        String[] musicas = {"Tempo Perdido", "Aquarela", "Evidências"};
        String[] outrasMusicas = {"O sol", "trem Bala"};
        String[] novasMusicas = {"Pais e filhos", "Velha infacia"};
        PlayList playList01 = new PlayList("Favoritas", musicas);
        PlayList playList02 = new PlayList(outrasMusicas);
        playList01.setMusicas(novasMusicas);
        playList01.exibirPlayList();
        System.out.println("Total de musicas: "+ playList01.getMusicas().length);
        playList02.exibirPlayList();
        System.out.println("Total de musicas: "+ playList02.getMusicas().length);




    }
}
