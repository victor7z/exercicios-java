package poo;

public class JogadorPontuacao {
    public String nome;
    public int pontos;

    public void aumentarPontos(int pontosRecebidos){
        pontosRecebidos += 100;
    }

    public void adicionarPontos(int quantidade){
        pontos += quantidade;
    }

    public void exibirDados(){
        System.out.println("nome: "+nome);
        System.out.println("Pontos: "+pontos);
    }
}
