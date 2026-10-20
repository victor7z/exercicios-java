package poo.testepoo;

import poo.Jogador;

public class JogadorTeste {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

        jogador1.nome = "Victor";
        jogador1.jogo = "Valorant";
        jogador1.nivel = 25;
        jogador1.pontuacao = 1570.5;
        jogador1.online = true;


        jogador2.nome = "Xulabrine"; /*Desconsidere o nome preferi alterar kkkkkkk*/
        jogador2.jogo = "Minecraft";
        jogador2.nivel = 40;
        jogador2.pontuacao = 2350.0;
        jogador2.online = false;

        System.out.println("========== Jogador 1 ==========");
        System.out.println("Nome: "+jogador1.nome);
        System.out.println("Jogo: "+jogador1.jogo);
        System.out.println("Nivel: "+jogador1.nivel);
        System.out.println("Pontuacao: "+jogador1.pontuacao);
        System.out.println("Esta online: "+jogador1.online);

        System.out.println("========== Jogador 2 ==========");
        System.out.println("Nome: "+jogador2.nome);
        System.out.println("Jogo: "+jogador2.jogo);
        System.out.println("Nivel: "+jogador2.nivel);
        System.out.println("Pontuacao: "+jogador2.pontuacao);
        System.out.println("Esta online: "+jogador2.online);

        jogador1.pontuacao = 2000.0;


        System.out.println("========== Jogador 1 ==========");
        System.out.println("Nome: "+jogador1.nome);
        System.out.println("Jogo: "+jogador1.jogo);
        System.out.println("Nivel: "+jogador1.nivel);
        System.out.println("Pontuacao: "+jogador1.pontuacao);
        System.out.println("Esta online: "+jogador1.online);

        System.out.println("========== Jogador 2 ==========");
        System.out.println("Nome: "+jogador2.nome);
        System.out.println("Jogo: "+jogador2.jogo);
        System.out.println("Nivel: "+jogador2.nivel);
        System.out.println("Pontuacao: "+jogador2.pontuacao);
        System.out.println("Esta online: "+jogador2.online);


    }
}
