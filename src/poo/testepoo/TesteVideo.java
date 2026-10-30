package poo.testepoo;

import poo.Video;

public class TesteVideo {
    static void main(String[] args) {
        Video video1 = new Video();

        video1.definirTitulo("Minha apresentação");
        video1.duracaoSegundos = 120;
        video1.cortarVideo(10);


        video1.exibirDados();

        System.out.println("=======");
        video1.adicionarTrechos(15,30,10);
        video1.exibirDados();

    }
}
