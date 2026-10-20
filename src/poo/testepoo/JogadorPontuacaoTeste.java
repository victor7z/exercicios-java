package poo.testepoo;


import poo.JogadorPontuacao;

public class JogadorPontuacaoTeste {
    static void main(String[] args) {
        JogadorPontuacao jogador1 = new JogadorPontuacao();

        jogador1.nome = "Victor";
        jogador1.pontos = 500;

        jogador1.exibirDados();
        int bonus = 50;
        System.out.println("Bonus: "+bonus);
        jogador1.aumentarPontos(bonus);
        System.out.println("Bonus aumentado: "+bonus);
        jogador1.adicionarPontos(bonus);
        jogador1.exibirDados();
    }
}
